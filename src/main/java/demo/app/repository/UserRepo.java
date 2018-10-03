package demo.app.repository;

import demo.app.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepo extends CrudRepository {

    @Query("SELECT user FROM User user WHERE user.userID=1")
    List<User> findAllUsers();
}