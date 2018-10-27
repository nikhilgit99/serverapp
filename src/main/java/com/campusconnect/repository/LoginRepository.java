package com.campusconnect.repository;

import com.campusconnect.entity.LoginBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 */
@Repository
public interface LoginRepository extends CrudRepository<LoginBean, Long> {

    @Query("SELECT a FROM LoginBean a WHERE a.firstName=:firstName and a.lastName=:lastName")
    List<LoginBean> fetchLoginBean(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
