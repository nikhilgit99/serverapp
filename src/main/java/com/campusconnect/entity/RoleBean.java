package com.campusconnect.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by NIKHI on 20-10-2018.
 */
@Entity
@Table(name = "ROLE")
public class RoleBean {

    @Id
    @Basic
    @Column(name="ROLE_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    @Basic
    @Column(name = "ROLE_NAME" , unique = true)
    private String roleName;

/*
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roleBean")
    private List<LoginBean> loginbean;
*/


    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

   /* public List<LoginBean> getLoginbean() {
        return loginbean;
    }

    public void setLoginbean(List<LoginBean> loginbean) {
        this.loginbean = loginbean;
    }*/

}


