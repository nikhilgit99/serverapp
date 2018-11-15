
package com.campusconnect.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * Created by NIKHI on 15-09-2018.
 */
@Table(name = "SESSION")
@Entity
public class SessionBean {

    @Id
    @Basic
    @Column(name="SESSION_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sessionId;

    @ManyToOne(cascade=CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name="COURSE_ID")
    private CourseBean courseBean;

    @ManyToOne(cascade=CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name="SUBJECT_ID")
    private SubjectBean subjectBean;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="ROOM_ID")
    private RoomBean roomBean;

    @Basic
    @Column(name="DATE")
    private String date;

    @Basic
    @Column(name="START_TIME")
    private java.sql.Time startTime;

    @Basic
    @Column(name="END_TIME")
    private java.sql.Time endTime;

    @Basic
    @Column(name="SESSION_DETAILS")
    private String sessionDetails;

    @Basic
    @Column(name="UPDATES_BY")
    private String updatedBy;

    @Basic
    @Column(name="CRE_TS")
    private java.sql.Timestamp creTs;

    @Basic
    @Column(name="UPD_TS")
    private java.sql.Timestamp updTs;

    @Basic
    @Column(name="OCCURENCE")
    private String occurrence;

    @Basic
    @Column(name="START_DATE")
    private java.sql.Date startDate;

    @Basic
    @Column(name="END_DATE")
    private java.sql.Date endDate;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

     public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getSessionDetails() {
        return sessionDetails;
    }

    public void setSessionDetails(String sessionDetails) {
        this.sessionDetails = sessionDetails;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getCreTs() {
        return creTs;
    }

    public void setCreTs(Timestamp creTs) {
        this.creTs = creTs;
    }

    public Timestamp getUpdTs() {
        return updTs;
    }

    public void setUpdTs(Timestamp updTs) {
        this.updTs = updTs;
    }

    public String getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(String occurrence) {
        this.occurrence = occurrence;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CourseBean getCourseBean() {
        return courseBean;
    }

    public void setCourseBean(CourseBean courseBean) {
        this.courseBean = courseBean;
    }

    public SubjectBean getSubjectBean() {
        return subjectBean;
    }

    public void setSubjectBean(SubjectBean subjectBean) {
        this.subjectBean = subjectBean;
    }
    public RoomBean getRoomBean() {
        return roomBean;
    }

    public void setRoomBean(RoomBean roomBean) {
        this.roomBean = roomBean;
    }


}

