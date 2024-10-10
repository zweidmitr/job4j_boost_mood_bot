package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

/**
 * Класс, который управляет ежедневными напоминаниями и уведомлениями.
 */
@Service
public class ReminderService {

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: ReminderService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: ReminderService");
    }
}
