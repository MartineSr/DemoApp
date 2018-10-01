package demo.app.model;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="user")
public class User {

    @Id
    @NonNull
    @Column
    private Integer userID;
    @Column
    private String firstName;
    @Column
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


