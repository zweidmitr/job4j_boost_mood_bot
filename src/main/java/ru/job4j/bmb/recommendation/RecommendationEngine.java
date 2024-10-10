package ru.job4j.bmb.recommendation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 *  Основной класс, который на основе настроения пользователя выбирает соответствующий контент.
 */
public class RecommendationEngine {

    @PostConstruct
    public void init() {
        System.out.println("Процедура инициализации бина: RecommendationEngine");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Сейчас бин будет уничтожен: RecommendationEngine");
    }
}
