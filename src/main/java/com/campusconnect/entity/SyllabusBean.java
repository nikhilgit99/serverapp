
package com.campusconnect.entity;

import javax.persistence.*;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Entity
@Table(name="SYLLABUS")
public class SyllabusBean {

    @Id
    @Basic
    @Column(name="SYLLABUS_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long syllabusId;

    @Basic
    @Column
    private String subjectId;

    @Basic
    @Column(name="CHAPTER_NAME")
    private String chapterName;

    @Basic
    @Column(name="CHAPTER_DETAILS")
    private String chapterDetails;

    @Basic
    @Column(name="UNIT_NUMBER")
    private String unitNumber;

    @Basic
    @Column(name="POINTS")
    private String points;

    @Basic
    @Column(name="NO_SESSIONS")
    private String noOfSessions;

    public long getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(long syllabus_id) {
        this.syllabusId = syllabusId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterDetails() {
        return chapterDetails;
    }

    public void setChapterDetails(String chapterDetails) {
        this.chapterDetails = chapterDetails;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getNoOfSessions() {
        return noOfSessions;
    }

    public void setNoOfSessions(String noOfSessions) {
        this.noOfSessions = noOfSessions;
    }



}

