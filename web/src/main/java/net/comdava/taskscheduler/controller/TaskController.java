package net.comdava.taskscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("")
public class TaskController {

    @RequestMapping({"/index", "/templates/index.html"})
    public String listOfTasks(){
        return "index";
    }
}
