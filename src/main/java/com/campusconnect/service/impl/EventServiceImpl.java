package com.campusconnect.service.impl;

import com.campusconnect.entity.EventBean;
import com.campusconnect.repository.EventRepository;
import com.campusconnect.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository eventRepository;

    @Override
    public List<EventBean> getEventList() {
        return (List<EventBean>) eventRepository.findAll();
    }

    @Override
    public void addEvent(EventBean eventBean) {
        eventRepository.save(eventBean);
    }

    @Override
    public void updateEvent(EventBean eventBean) {eventRepository.save(eventBean);}

    @Override
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public EventBean getEventById(long id) {
        return eventRepository.findById(id).get();
    }

}
