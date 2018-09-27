package demo.service;

import demo.model.User;
import demo.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private UserRepo userRepo;

    private User user1 = new User();


    public User showUser1(){
        user1.setFirstName("Klaas");
        user1.setLastName("Hein");
        return user1;
    }

}
