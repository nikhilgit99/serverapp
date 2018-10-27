package com.campusconnect.entity;

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
    @Column(name = "ROLE_NAME" , unique = true)
    private String roleName;

}


