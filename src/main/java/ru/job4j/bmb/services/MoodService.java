package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * Класс, отвечающий за обработку запросов пользователя в зависимости от его настроения.
 */
@Service
public class MoodService implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: MoodService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: MoodService");
    }
}
