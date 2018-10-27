
package com.campusconnect.entity;

import javax.persistence.*;


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

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="COURSE_ID")
    private CourseBean courseId;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="SUBJECT_ID")
    private SubjectBean subjectId;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="ROOM_ID")
    private RoomBean roomId;

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

}

