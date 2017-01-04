package ua.com.skills.service;

import ua.com.skills.entity.User;

import java.util.List;

/**
 * Created by ваня on 03.01.2017.
 */
public interface UserService {
    void saveUser(User user);
    User findOne(int id);
    List<User>findAll();

}
