package ru.job4j.bmb.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import ru.job4j.bmb.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Profile("test")
@Repository
public class UserFakeRepository implements UserRepository {
    private Map<Long, User> userMap = new HashMap<>();

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findByClientId(Long clientId) {
        return null;
    }

    public void save(User user) {
        userMap.put(user.getClientId(),user);
    }
}
