package demo.repository;

import demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends CrudRepository<User,Integer> {

}