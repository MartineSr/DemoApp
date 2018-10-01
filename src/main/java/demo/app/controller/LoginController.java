package demo.app.controller;

import demo.app.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private final Login login;

    @Autowired
    public LoginController(Login login){
        this.login = login;
    }

    @GetMapping("/login")
    @ResponseBody
    public String redirect(){
        return "/login";
    }


}
