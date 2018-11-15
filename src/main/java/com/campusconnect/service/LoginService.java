package com.campusconnect.service;

import com.campusconnect.entity.LoginBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 * SERVICE  -- we define queries to CRUD data in database
 *
 */
public interface LoginService {

    public List<LoginBean> getLoginList();
    public void addLogin(LoginBean loginBean);
    public void deleteLogin(long id);
    public void updateLogin(LoginBean loginBean);
    public LoginBean getLoginById(long id);
    public LoginBean getLoginByUserName(String userName);
    public LoginBean fetchLoginBean(String firstName, String lastName);
    //public LoginBean fetchLoginBeanbyroleid(long roleId);

}
