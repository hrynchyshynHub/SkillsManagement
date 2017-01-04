package ua.com.skills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.skills.dto.DtoUtilMapper;
import ua.com.skills.dto.UserDto;
import ua.com.skills.entity.User;
import ua.com.skills.service.UserService;

import java.security.Principal;
import java.util.ArrayList;

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
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String userProfile(Model model, Principal principal){
        User user = userService.findOne(Integer.parseInt(principal.getName()));
        UserDto userDto = DtoUtilMapper.UserToUserDTO(user);
        model.addAttribute("user", userDto);
        return "views-user-profile";
    }
}
