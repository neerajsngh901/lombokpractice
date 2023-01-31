package com.practise.lombokpractice.controller;

import com.practise.lombokpractice.model.User;
import com.practise.lombokpractice.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class TestController {

    @Autowired
    private TestService testService;
    //GET,PUT,DELETE,POST
    //get-data fetch - 27-01-2023
    // pathvariable query param
    //put-data update
    //delete-data delete
    //post-data insert
    //localhost:8080/api/vi/neeraj
    // Request Mapping - Global url for all method in class which is added before the method url.
    @GetMapping("/neeraj")
    public List<User> get(){
        return testService.getAll();
    }

    @GetMapping("/aman")
    public String getman(){
        User user= new User();
        user.setName("Aman");
        user.setAge(20);
        return user.toString();
    }
    //PathParam
    @GetMapping("/ex/{id}/data")
        public String getData(@PathVariable(value = "id") int id){
        return String.valueOf(id);
    }
    //Path Param- For Searching particular Data
    @GetMapping("/ex1/{account_no}/data")
    public String getData1(@PathVariable int account_no){
        return String.valueOf(account_no);
    }

    //QueryPAram- Its used to sort out data in particular Data

    //Workflow - i want particular case id full details- PathParam
    //Workflow - i want particular details from a case id -Query Param e.g- Dispatched.
//http://localhost:8080/api/vi/ex2/13/data?name=Divya&id=1
    @GetMapping("/ex2/{age}/data")
    public User getUserdetails(@PathVariable int age, @RequestParam String name,@RequestParam int
                               id){
        User user=new User(name,age,id);
        return user;
    }
    //Post
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return testService.getUser(user);

    }

    //Put
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return testService.update(user);

    }
    @DeleteMapping("/Delete/{id}")
    public String deleteData(@PathVariable int id){
        return testService.delete(id);
    }

}
