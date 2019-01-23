package com.campusconnect.controller;

import com.campusconnect.entity.UserBean;
import com.campusconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by NIKHI on 25-08-2018.
 */
@Controller
@RequestMapping(value = "/login")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String addUserLogin(@RequestBody UserBean userBean){

        userService.addLogin(userBean);

        return "Person succesfully saved!";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateUserLogin(@RequestBody UserBean userBean){

        userService.updateLogin(userBean);

        return "Person succesfully updated!";
    }


}
