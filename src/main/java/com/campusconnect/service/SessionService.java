
package com.campusconnect.service;

import com.campusconnect.entity.SessionBean;

import java.util.List;


/**
 * Created by NIKHI on 15-09-2018.
 */

public interface SessionService {

    public List<SessionBean> getSessionList();
    public void addSession(SessionBean sessionBean);
    public void deleteSession(long id);
    public void updateSession(SessionBean sessionBean);
    public SessionBean getSessionById(long id);
}
