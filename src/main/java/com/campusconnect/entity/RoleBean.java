package com.campusconnect.entity;

import com.campusconnect.Constants.rolesEnum;

import javax.persistence.*;

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
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME" , unique = true)
    private rolesEnum roleName;

    @OneToOne(mappedBy = "roleBean")
    private UserBean userBean;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public rolesEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(rolesEnum roleName) {
        this.roleName = roleName;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

}


