package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import demo.model.Demo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    private final Demo demo;

    public DemoController(Demo demo){
        this.demo = demo;
    }

    @GetMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String sayHello(){
        return "Hello, you are :Logged in";
    }
}
