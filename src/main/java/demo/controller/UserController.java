package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @Produces(MediaType.APPLICATION_JSON)
        public Response getUser1(){
        User u = userService.showUser1();
        return Response.ok(u).build();
    }


}
