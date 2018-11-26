package com.campusconnect.service.impl;

import com.campusconnect.entity.LoginBean;
import com.campusconnect.repository.LoginRepository;
import com.campusconnect.service.LoginService;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 * SERVICE IMPLEMENTATION -- we will implement queries created in SERVICE
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository loginRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LoginBean> getLoginList() {
        return (List<LoginBean>) loginRepository.findAll();
    }

    @Override
    public void addLogin(LoginBean loginBean) {
        loginRepository.save(loginBean);
    }

    @Override
    public void updateLogin(LoginBean loginBean) {loginRepository.save(loginBean);}

    @Override
    public void deleteLogin(long id) {
        loginRepository.deleteById(id);
    }

    @Override
    public LoginBean getLoginById(long id) {
        return loginRepository.findById(id).get();
    }

    @Override
    public LoginBean getLoginByUserName(String userName) {
        return null;
    }

    public LoginBean fetchLoginBean( String firstName,String lastName){
        return loginRepository.fetchLoginBean(firstName,lastName).get(0);
    }

    public LoginBean fetchLoginBeanbyroleid( long roleId){
        return loginRepository.fetchLoginBeanbyroleid(roleId).get(0);
    }

}
