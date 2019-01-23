
package com.campusconnect.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by NIKHI on 01-09-2018.
 */

@Entity
@Table(name = "TIMETABLE")
public class TimeTableBean {
        @Id
        @Column(name="TIMETABLE_ID" , unique = true)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long timetableid;

        @Basic
        @Column(name="START_TIME")
        @NotNull(message="timetable.starttime.required")
        @NotEmpty(message="timetable.starttime.required")
        private String startTime;

        @Basic
        @Column(name="END_TIME")
        @NotNull(message="timetable.endtime.required")
        @NotEmpty(message="timetable.endtime.required")
        private String endTime;

       /* @ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="uid")
        private UserBean UserID;*/

        /*@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="COURSE_ID")
        private CourseBean courseId;

        @OneToMany(fetch=FetchType.EAGER)
        @JoinColumn(name="SUBJECT_ID")
        private SubjectBean subjectId;*/
}
