package demo.repository;

import demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends CrudRepository<User,Integer> {

    User findById(int userID);

}