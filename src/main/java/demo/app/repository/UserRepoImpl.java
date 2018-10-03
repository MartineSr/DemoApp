package demo.app.repository;

import demo.app.model.User;
import demo.app.repository.UserRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.*;
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
        return new ArrayList<>(userMap.values());
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

    @Override
    public List<User> findAllUsers() {
        return new ArrayList<>(userMap.values());
    }
}
