package com.campusconnect.controller;

import com.campusconnect.entity.LoginBean;
import com.campusconnect.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by NIKHI on 25-08-2018.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String addUserLogin(@RequestBody LoginBean loginBean){

        loginService.addLogin(loginBean);

        return "Person succesfully saved!";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateUserLogin(@RequestBody LoginBean loginBean){

        loginService.updateLogin(loginBean);

        return "Person succesfully updated!";
    }


}
