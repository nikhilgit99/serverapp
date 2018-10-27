
package com.campusconnect.service.impl;

import com.campusconnect.entity.TimeTableBean;
import com.campusconnect.repository.TimeTableRepository;
import com.campusconnect.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Service
public class TimeTableServiceImpl implements TimeTableService{

        @Autowired
        TimeTableRepository timeTableRepository;

    @Override
    public List<TimeTableBean> getTimeTableList() {
        return (List<TimeTableBean>) timeTableRepository.findAll();
    }

    @Override
    public void addTimetable(TimeTableBean timeTableBean) {
        timeTableRepository.save(timeTableBean);
    }

    @Override
    public void updateTimetable(TimeTableBean timeTableBean) {timeTableRepository.save(timeTableBean);}

    @Override
    public void deleteTimetable(long id) {
        timeTableRepository.deleteById(id);
    }

    @Override
    public TimeTableBean getTimetableById(long id) {
        return null;
    }
    }
