
package com.campusconnect.service;

import com.campusconnect.entity.TimeTableBean;

import java.util.List;


/**
 * Created by NIKHI on 15-09-2018.
 */

public interface TimeTableService {
    public List<TimeTableBean> getTimeTableList();
    public void addTimetable(TimeTableBean timeTableBean);
    public void deleteTimetable(long id);
    public void updateTimetable(TimeTableBean timeTableBean);
    public TimeTableBean getTimetableById(long id);
}
