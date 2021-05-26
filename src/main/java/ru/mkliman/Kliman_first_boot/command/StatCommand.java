package ru.mkliman.Kliman_first_boot.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.mkliman.Kliman_first_boot.model.TelegramUser;
import ru.mkliman.Kliman_first_boot.service.SendBotMessageService;
import ru.mkliman.Kliman_first_boot.service.TelegramUserService;

public class StatCommand implements Command {

    private final TelegramUserService telegramUserService;
    private final SendBotMessageService sendBotMessageService;

    public final static String STAT_MESSAGE = "Bot использует %s человек.";

    @Autowired
    public StatCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        int activeUserCount = telegramUserService.retrieveAllActiveUsers().size();
        String chatId = update.getMessage().getChatId().toString();
        String name = update.getMessage().getFrom().getUserName();

        telegramUserService.findByChatId(chatId).ifPresentOrElse(
                user -> {},
                () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChatId(chatId);
                    telegramUser.setName(name);
                    telegramUserService.save(telegramUser);
                });
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), String.format(STAT_MESSAGE, activeUserCount));
    }
}