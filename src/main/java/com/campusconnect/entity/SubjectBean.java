
package com.campusconnect.entity;

import javax.persistence.*;

/**
 * Created by NIKHI on 15-09-2018.
 * CONTAINS DETAILS OF SUBJECT
 */

@Entity
@Table(name="SUBJECT")
public class SubjectBean {

    @Id
    @Basic
    @Column(name="SUBJECT_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long subject_id;

    @Basic
    @Column(name="SUBJECT_NAME")
    private String subject_name;

    @Basic
    @Column(name="THEORY")
    private boolean theory;

    @Basic
    @Column(name="PRACTICAL")
    private boolean practical;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="COURSE_ID")
    private CourseBean courseId;


    public long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(long subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public boolean isTheory() {
        return theory;
    }

    public void setTheory(boolean theory) {
        this.theory = theory;
    }

    public boolean isPractical() {
        return practical;
    }

    public void setPractical(boolean practical) {
        this.practical = practical;
    }
}

