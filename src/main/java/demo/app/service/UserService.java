package demo.app.service;

import demo.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService{

    private final UserRepo userRepo;

    private User user1 = new User();

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User showUser1(){
        user1.setFirstName("Klaas");
        user1.setLastName("Hein");
        return user1;
    }

    public List<Object> getAllUsers(){
        ArrayList<Object> users = new ArrayList<>();
        userRepo.findAll().forEach(e -> users.add(e));
        return users;
    }

}
