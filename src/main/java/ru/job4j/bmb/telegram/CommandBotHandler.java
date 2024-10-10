package ru.job4j.bmb.telegram;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

/**
 * Класс для обработки команд, поступающих от пользователей (например, выбор настроения, запрос рекомендаций).
 */
@Service
public class CommandBotHandler {

    void receive(Content content) {
        System.out.println(content);
    }

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: CommandBotHandler");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: CommandBotHandler");
    }
}
