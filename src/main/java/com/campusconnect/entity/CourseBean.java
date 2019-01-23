
package com.campusconnect.entity;

import javax.persistence.*;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Entity
@Table(name = "COURSE")
public class CourseBean {

     @Id
     @Basic
     @Column(name="COURSE_ID" , unique = true)
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long courseId;

    @Basic
    @Column(name="COURSE_NAME")
    private String courseName;

    @Basic
    @Column(name="YEAR")
    private String year;

    @Basic
    @Column(name="SEMESTER")
    private String semester;

    @OneToOne(mappedBy = "courseBean")
    private UserBean userBean;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
