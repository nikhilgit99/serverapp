package com.campusconnect.service;

import com.campusconnect.entity.EventBean;

import java.util.List;


/**
 * Created by NIKHI on 15-09-2018.
 */

public interface EventService {

    public List<EventBean> getEventList();
    public void addEvent(EventBean eventBean);
    public void deleteEvent(long id);
    public void updateEvent(EventBean eventBean);
    public EventBean getEventById(long id);

}

