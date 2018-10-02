package demo.app.service;

import demo.app.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepoImpl implements UserRepo {

    private final Map<String, User> userMap = new ConcurrentHashMap<>();

    public Object save(Object entity) {
        return null;
    }

    public Iterable saveAll(Iterable entities) {
        return null;
    }

    public Optional findById(Object o) {
        return Optional.empty();
    }

    public boolean existsById(Object o) {
        return false;
    }

    public List<User> findAll() {
        List<User> u = new ArrayList<>();
        User user1 = new User();
        user1.setFirstName("Piet");
        user1.setLastName("Demo");
        u.add(user1);
        User user2 = new User();
        user2.setFirstName("Piet");
        user2.setLastName("Demo2");
        u.add(user2);
        return u;
    }

    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Object o) {

    }

    public void delete(Object entity) {

    }

    public void deleteAll(Iterable entities) {

    }

    public void deleteAll() {

    }
}
