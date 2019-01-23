package com.campusconnect.repository;

import com.campusconnect.entity.UserBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NIKHI on 25-08-2018.
 */
@Repository
public interface UserRepository extends CrudRepository<UserBean, Long> {

    @Query("SELECT a FROM UserBean a WHERE a.firstName=:firstName and a.lastName=:lastName")
    List<UserBean> fetchLoginBean(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName);

   /*@Query("SELECT a FROM UserBean a WHERE a.roleId=:roleId")
    List<UserBean> fetchLoginBeanbyrole(
            @Param("roleBean") String  roleId);
    /*@Query("SELECT a FROM Loginbean a JOIN a.roleBean rb WHERE rb.roleId=:roleId")
    * @Query("SELECT a FROM Loginbean a WHERE a.roleBean.roleId=:roleId")*/
}