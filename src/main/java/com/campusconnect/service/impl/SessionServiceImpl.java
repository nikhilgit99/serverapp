
package com.campusconnect.service.impl;

import com.campusconnect.entity.SessionBean;
import com.campusconnect.repository.SessionRepository;
import com.campusconnect.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Service
public class SessionServiceImpl implements SessionService{

    @Autowired
    SessionRepository sessionRepository;

    @Override
    public List<SessionBean> getSessionList() {
        return (List<SessionBean>) sessionRepository.findAll();
    }

    @Override
    public void addSession(SessionBean sessionBean) {
        sessionRepository.save(sessionBean);
    }

    @Override
    public void updateSession(SessionBean sessionBean) {sessionRepository.save(sessionBean);}

    @Override
    public void deleteSession(long id) {
        sessionRepository.deleteById(id);
    }

    @Override
    public SessionBean getSessionById(long id) {
        return sessionRepository.findById(id).get();
    }

}
