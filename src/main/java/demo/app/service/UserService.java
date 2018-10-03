package demo.app.service;

import demo.app.model.User;
import demo.app.repository.UserRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService{

    private final UserRepoImpl userRepoImpl;

    private User user1 = new User();

    @Autowired
    public UserService(UserRepoImpl userRepoImpl) {
        this.userRepoImpl = userRepoImpl;
    }

    public User showUser1(){
        user1.setFirstName("Klaas");
        user1.setLastName("Hein");
        return user1;
    }

    public List<User> getAllUsers(){
        List<User> users = userRepoImpl.findAllUsers();
        return users;
    }

}
