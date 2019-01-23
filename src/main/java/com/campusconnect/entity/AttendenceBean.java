package com.campusconnect.entity;

import com.campusconnect.Constants.AttendenceStatus;

import javax.persistence.*;

/**
 * Created by NIKHI on 27-10-2018.
 */
@Entity
@Table(name = "ATTENDENCE")
public class AttendenceBean {

    @Id
    @Basic
    @Column(name = "ATTENDENCE_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long attendenceId;

    @Basic
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SESSION_ID")
    private SessionBean sessionBean;

    @Basic
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private UserBean userBean;

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ATTENDENCE_STATUS")
    private AttendenceStatus attendenceStatus;

    @Basic
    @Column(name = "CRE_TS")
    private String creTs;

    @Basic
    @Column(name = "UPD_TS")
    private String updTs;

    public AttendenceBean() {
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + attendenceId +
                ", attendenceStatus='" + attendenceStatus + '\'' +
                ", creTs='" + creTs + '\'' +
                ", updTs='" + updTs + '\'' +
                '}';
    }

    public long getAttendenceId() {
        return attendenceId;
    }

    public void setAttendenceId(long attendenceId) {
        this.attendenceId = attendenceId;
    }

    public AttendenceStatus getAttendenceStatus() {
        return attendenceStatus;
    }

    public void setAttendenceStatus(AttendenceStatus attendenceStatus) {
        this.attendenceStatus = attendenceStatus;
    }

    public String getCreTs() {
        return creTs;
    }

    public void setCreTs(String creTs) {
        this.creTs = creTs;
    }

    public String getUpdTs() {
        return updTs;
    }

    public void setUpdTs(String updTs) {
        this.updTs = updTs;
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }


}
