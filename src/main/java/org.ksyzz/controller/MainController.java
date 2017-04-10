package org.ksyzz.controller;

import org.ksyzz.entity.User;
import org.ksyzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fengqian on 2017/4/10.
 */
@Controller
public class MainController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public User addUser(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password
    ){
        return userService.addUser("6666", password);
    }
}
