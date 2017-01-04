package ua.com.skills.controller;

import org.dom4j.rule.Mode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.skills.entity.User;
import ua.com.skills.service.FeedService;

import java.io.IOException;
import java.security.Principal;

/**
 * Created by ваня on 03.01.2017.
 */
@Controller
public class HomeController {
    @Autowired
    private FeedService feedService;

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String home() {
        return "views-base-home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String loginprocesing() {
        return "views-base-home";
    }

    @RequestMapping("/loginpage")
    public String login() {
        return "views-base-loginpage";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "redirect:/loginpage";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "views-user-registration";
    }
    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public String feed(Model model){
            model.addAttribute("newses", feedService.findNews());
            return "views-base-feed";
    }
}
