package com.practise.lombokpractice.servicesimpl;

import com.practise.lombokpractice.model.User;
import com.practise.lombokpractice.services.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public List<User> getAll() {
        List<User> allUser=new ArrayList<>();
        User user1=new User("divya",22,1);
        User user2=new User("aman",22,2);
        User user3=new User("Neeraj",32,3);
        allUser.add(user1);
        allUser.add(user2);
        allUser.add(user3);
        return allUser;
    }

    @Override
    public String delete(int id) {
        return "Your Id:"+id+" Deleted Sucessfully";
    }

    @Override
    public User getUser(User user) {
        return user;
    }

    @Override
    public User update(User user) {
        return user;
    }
}
