
package com.campusconnect.controller;

import com.campusconnect.entity.SessionBean;
import com.campusconnect.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Controller
@RequestMapping(value = "/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String addUserLogin(@RequestBody SessionBean sessionBean){

        sessionService.addSession(sessionBean);

        return "Person succesfully saved!";
    }

}

