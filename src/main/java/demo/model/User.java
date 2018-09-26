package demo.model;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="user")
public class User {

    @Id
    @NonNull
    private Integer userID;

    private String firstName;
    private String lastName;

    public Integer getUserID(){
        return userID;
    }

    public void setUserID(Integer userId){
        this.userID = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


