package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public Response getUser(Integer userID){
        User u = userService.getUserById(userID);
        return Response.ok(u).build();
    }

}
