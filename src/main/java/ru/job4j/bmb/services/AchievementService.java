package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * Класс, который следит за достижениями пользователя и награждает его за выполнение определенных действий.
 */
@Service
public class AchievementService implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: AchievementService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: AchievementService");
    }
}
