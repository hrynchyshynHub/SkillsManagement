package ua.com.skills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.skills.entity.User;
import ua.com.skills.service.UserService;

/**
 * Created by ваня on 03.01.2017.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user){
        userService.saveUser(user);
        return "redirect:/";
    }
}
