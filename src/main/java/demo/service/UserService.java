package demo.service;

import demo.model.User;
import demo.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private UserRepo userRepo;

    public User getUserById(int userID){
        return userRepo.findById(userID);
    }

    public Iterable<User> showAll(){
        return userRepo.findAll();
    }

}
