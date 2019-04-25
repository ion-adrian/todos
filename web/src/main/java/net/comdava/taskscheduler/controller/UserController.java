package net.comdava.taskscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("")
@Controller
public class UserController {

    @RequestMapping({"/users", "/templates/users.html"})
    public String listOfUsers(){
        return "users";
    }
}
