package com.campusconnect.entity;

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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "SESSION_ID")
    private SessionBean sessionId;

    @Basic
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private LoginBean userId;

        @Basic
    @Column(name = "ATTENDENCE_STATUS")
    private String attendenceStatus;

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
        return "LoginBean{" +
                "id=" + attendenceId +
                ", userId='" + userId + '\'' +
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

    public SessionBean getSessionId() {
        return sessionId;
    }

    public void setSessionId(SessionBean sessionId) {
        this.sessionId = sessionId;
    }

    public LoginBean getUserId() {
        return userId;
    }

    public void setUserId(LoginBean userId) {
        this.userId = userId;
    }

    public String getAttendenceStatus() {
        return attendenceStatus;
    }

    public void setAttendenceStatus(String attendenceStatus) {
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


}
