package ru.mkliman.Kliman_first_boot.command;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.mkliman.Kliman_first_boot.model.TelegramUser;
import ru.mkliman.Kliman_first_boot.service.SendBotMessageService;
import ru.mkliman.Kliman_first_boot.service.TelegramUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Start {@link Command}.
 */
@Component
public class StartCommand implements Command {

    public final static String START_MESSAGE = "Отслеживание онлайн магазина машин Hyundai включено!";
    public final static String START_MESSAGE_DOUBLE = "Отслеживание онлайн магазина машин Hyundai уже включено!";

    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;

    private static List<String> chats = new ArrayList<>();

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        String chatId = update.getMessage().getChatId().toString();
        String name = update.getMessage().getFrom().getUserName();
        telegramUserService.findByChatId(chatId).ifPresentOrElse(
                user -> {
                    if (!user.isActive()) {
                        user.setActive(true);
                        user.setName(name);
                        telegramUserService.save(user);
                        sendBotMessageService.sendMessage(chatId, START_MESSAGE);
                    }else {
                        sendBotMessageService.sendMessage(chatId, START_MESSAGE_DOUBLE);
                    }
                },
                () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChatId(chatId);
                    telegramUser.setName(name);
                    telegramUserService.save(telegramUser);
                    sendBotMessageService.sendMessage(chatId, START_MESSAGE);
                });
    }
}