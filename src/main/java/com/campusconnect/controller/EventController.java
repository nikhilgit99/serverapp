package com.campusconnect.controller;

import com.campusconnect.entity.EventBean;
import com.campusconnect.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value = "/Event")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String addUserLogin(@RequestBody EventBean eventBean){

        eventService.addEvent(eventBean);

        return "Event succesfully saved!";
    }

}
