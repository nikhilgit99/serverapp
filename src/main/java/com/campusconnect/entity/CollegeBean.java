package com.campusconnect.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIKHI on 21-01-2019.
 */
@Entity
@Table(name = "COLLEGE")
public class CollegeBean {

        @Id
        @Basic
        @Column(name="COLLEGE_ID" , unique = true)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long collegeId;

        @Basic
        @Column(name = "COLLEGE_NAME" , unique = true)
        private String collegeName;

        @OneToMany(mappedBy = "collegeBean")
        private List<UserBean> listOfStudents = new ArrayList<UserBean>();


        public long getCollegeId() {
                return collegeId;
        }

        public void setCollegeId(long collegeId) {
                this.collegeId = collegeId;
        }

        public String getCollegeName() {
                return collegeName;
        }

        public void setCollegeName(String collegeName) {
                this.collegeName = collegeName;
        }
}
