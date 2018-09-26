package demo.controller;

import demo.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private final Login login;

    public LoginController(Login login){
        this.login = login;
    }

    @GetMapping("/login")
    @ResponseBody
    public String redirect(){
        return "/login";
    }


}
