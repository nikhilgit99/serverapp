package com.campusconnect.service;

import com.campusconnect.entity.RoleBean;
import com.campusconnect.entity.UserBean;

import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 * SERVICE  -- we define queries to CRUD data in database
 *
 */
public interface UserService {

    public List<UserBean> getLoginList();
    public void addLogin(UserBean userBean);
    public void deleteLogin(long id);
    public void updateLogin(UserBean userBean);
    public UserBean getLoginById(long id);
    public UserBean getLoginByUserName(String userName);
    public UserBean fetchLoginBean(String firstName, String lastName);
    //public UserBean fetchLoginBeanbyrole(String roleId);

}
