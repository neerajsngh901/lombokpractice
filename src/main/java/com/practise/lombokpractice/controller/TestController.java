package com.practise.lombokpractice.controller;

import com.practise.lombokpractice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/")
public class TestController {
    //GET,PUT,DELETE,POST
    //get-data fetch - 27-01-2023
    // pathvariable query param
    //put-data update
    //delete-data delete
    //post-data insert
    //localhost:8080/api/vi/neeraj
    @GetMapping("/neeraj")
    public User get(){
        User user= new User();
        user.setName("Neeraj");
        user.setAge(30);
        return user;
    }

    @GetMapping("/aman")
    public String getman(){
        User user= new User();
        user.setName("Aman");
        user.setAge(20);
        return user.toString();
    }


}
