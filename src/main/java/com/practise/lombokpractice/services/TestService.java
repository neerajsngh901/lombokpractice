package com.practise.lombokpractice.services;

import com.practise.lombokpractice.model.User;

import java.util.List;

public interface TestService {
    public List<User> getAll();
    public String delete(int id);

    public User getUser(User user);

    public User update(User user);

}
