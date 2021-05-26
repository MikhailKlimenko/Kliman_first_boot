package ru.mkliman.Kliman_first_boot.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.mkliman.Kliman_first_boot.command.CommandContainer;
import ru.mkliman.Kliman_first_boot.service.CarService;
import ru.mkliman.Kliman_first_boot.service.SendBotMessageServiceImpl;
import ru.mkliman.Kliman_first_boot.service.TelegramUserService;

import javax.annotation.PostConstruct;

import static ru.mkliman.Kliman_first_boot.command.CommandName.NO;

@Component
public class KlimanFirstBot extends TelegramLongPollingBot {

    public static String COMMAND_PREFIX = "/";
    private final CommandContainer commandContainer;
    @Value("${bot.username}")
    private String username;
    @Value("${bot.token}")
    private String token;

    @Autowired
    private CarService carService;

    @Autowired
    public KlimanFirstBot(TelegramUserService telegramUserService) {
        this.commandContainer = new CommandContainer(new SendBotMessageServiceImpl(this), telegramUserService);
    }

    @PostConstruct
    private void init() {
        Runnable task = () -> {
            System.out.println("GO GO GO FIND CAR!");
            carService.findCar();
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText().trim();
            if (message.startsWith(COMMAND_PREFIX)) {
                String commandIdentifier = message.split(" ")[0].toLowerCase();

                commandContainer.retrieveCommand(commandIdentifier).execute(update);
            } else {
                commandContainer.retrieveCommand(NO.getCommandName()).execute(update);
            }
        }
    }
}
