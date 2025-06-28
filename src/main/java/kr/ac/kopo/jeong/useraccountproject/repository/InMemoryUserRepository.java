package kr.ac.kopo.jeong.useraccountproject.repository;


import kr.ac.kopo.jeong.useraccountproject.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryUserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public boolean existsByUsername(String username) {
        return users.containsKey(username);
    }

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(users.get(username));
    }
}

