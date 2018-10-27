
package com.campusconnect.controller;

import com.campusconnect.entity.TimeTableBean;
import com.campusconnect.repository.TimeTableRepository;
import com.campusconnect.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by NIKHI on 01-09-2018.
 */

@Controller
@RequestMapping(value = "/Timetable")
public class TimeTableContoller {

    @Autowired
    private TimeTableService timeTableService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String addTimetable(@RequestBody TimeTableBean timeTableBean){

        timeTableService.addTimetable(timeTableBean);

        return "Timetable succesfully saved!";
    }


}
