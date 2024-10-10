package ru.job4j.bmb.telegram;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

/**
 * Основной класс, который использует Telegram API для получения и отправки сообщений.
 */
@Service
public class TelegramBotService {
    private final CommandBotHandler handler;

    public TelegramBotService(CommandBotHandler handler) {
        this.handler = handler;
    }

    public void receive(Content content) {
        handler.receive(content);
    }

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: TelegramBotService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: TelegramBotService");
    }
}
