package demo.app.controller;

import demo.app.model.User;
import demo.app.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser1() {
        User u = userService.showUser1();
        return Response.ok(u).build();
    }

    @GetMapping("/allUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        List<Object> u = userService.getAllUsers();
        return Response.ok(u).build();
    }
}

