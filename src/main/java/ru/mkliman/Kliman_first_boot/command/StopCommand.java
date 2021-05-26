package ru.mkliman.Kliman_first_boot.command;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.mkliman.Kliman_first_boot.service.SendBotMessageService;
import ru.mkliman.Kliman_first_boot.service.TelegramUserService;

/**
 * Stop {@link Command}.
 */
public class StopCommand implements Command {

    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;

    public static final String STOP_MESSAGE = "Деактивировал отслеживание \uD83D\uDE1F.";

    public StopCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
        String name = update.getMessage().getChatId().toString();
        telegramUserService.findByChatId(update.getMessage().getChatId().toString())
                .ifPresent(it -> {
                    it.setActive(false);
                    it.setName(name);
                    telegramUserService.save(it);
                });
    }
}