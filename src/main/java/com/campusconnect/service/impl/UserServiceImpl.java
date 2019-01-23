package com.campusconnect.service.impl;

import com.campusconnect.entity.UserBean;
import com.campusconnect.repository.UserRepository;
import com.campusconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 * SERVICE IMPLEMENTATION -- we will implement queries created in SERVICE
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserBean> getLoginList() {
        return (List<UserBean>) userRepository.findAll();
    }

    @Override
    public void addLogin(UserBean userBean) {
        userRepository.save(userBean);
    }

    @Override
    public void updateLogin(UserBean userBean) {
        userRepository.save(userBean);}

    @Override
    public void deleteLogin(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserBean getLoginById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserBean getLoginByUserName(String userName) {
        return null;
    }

    public UserBean fetchLoginBean(String firstName, String lastName){
        return userRepository.fetchLoginBean(firstName,lastName).get(0);
    }

    /*public UserBean fetchLoginBeanbyrole( RoleBean role){
        return loginRepository.fetchLoginBeanbyrole(role).get(0);
    }*/

}
