package ru.mkliman.Kliman_first_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.mkliman.Kliman_first_boot.bot.KlimanFirstBot;

/**
 * Implementation of {@link SendBotMessageService} interface.
 */
@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final KlimanFirstBot klimanFirstBot;

    @Autowired
    public SendBotMessageServiceImpl(KlimanFirstBot klimanFirstBot) {
        this.klimanFirstBot = klimanFirstBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            klimanFirstBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            //todo add logging to the project.
            System.out.println("Error: " + e.getMessage());
        }
    }
}