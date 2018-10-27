package com.campusconnect.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by NIKHI on 25-08-2018.
 */
@Table(name = "USER_BASE")
@Entity
public class LoginBean {
    @Id
    @Basic
    @Column(name="USER_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Basic
    @Column(name = "USER_NAME" , unique = true)
    @NotNull(message="user.username.required")
    @NotEmpty(message="user.username.required")
    private String userName;

    @Column
    private String passWord;

    @Column(name="FIRST_NAME")
    @NotNull(message="user.firstname.required")
    @NotEmpty(message="user.firstname.required")
    private String firstName;

    @Column(name="MIDDLE_NAME")
    @NotNull(message="user.middlename.required")
    @NotEmpty(message="user.middlename.required")
    private String middleName;

    @Column(name="LAST_NAME")
    @NotNull(message="user.lastname.required")
    @NotEmpty(message="user.lastname.required")
    private String lastName;

    @Column(name="EMAIL_ID" , unique = true)
    @NotNull(message="user.emailid.required")
    @NotEmpty(message="user.emailid.required")
    private String emailId;

    @Column(name="PHONE_NUMBER" , unique = true)
    @NotNull(message="user.phonenumber.required")
    @NotEmpty(message="user.phonenumber.required")
    private String phoneNumber;

    @Column(name="PAN" , unique = true)
    private String PAN;

    @Column(name="AADHAR_CARD" , unique = true)
    private String aadharCard;

    @Column(name="DATE_OF_BIRTH")
    @NotNull(message="user.dob.required")
    @NotEmpty(message="user.dob.required")
    private String DOB;

    @Column(name="ADDRESS_1")
    private String address1;

    @Column(name="ADDRESS_2")
    private String address2;

    @Column(name="ADDRESS_3")
    private String address3;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;

    @Column(name="PIN_CODE")
    private String pinCode;

    @Column(name="BLOOD_GROUP")
    private String bloodGroup;

    @Column(name="GENDER")
    private String gender;

    @Column(name="COLLEGE_NAME")
    @NotNull(message="user.college.required")
    @NotEmpty(message="user.college.required")
    private String collegeName;

    @Column(name="CRE_TS")
    private String cre_ts;

    @Column(name="UPD_TS")
    private String upd_ts;

    public LoginBean() {
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "id=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public long getUserid() {
        return userId;
    }

    public void setUserid(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() { return firstName;    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }

    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmailId() { return emailId; }

    public void setEmailId(String emailId) { this.emailId = emailId; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPAN() { return PAN; }

    public void setPAN(String PAN) { this.PAN = PAN; }

    public String getAadharCard() { return aadharCard; }

    public void setAadharCard(String aadharCard) { this.aadharCard = aadharCard; }

    public String getDOB() { return DOB; }

    public void setDOB(String DOB) { this.DOB = DOB; }

    public String getAddress1() { return address1; }

    public void setAddress1(String address1) { this.address1 = address1; }

    public String getAddress2() { return address2; }

    public void setAddress2(String address2) { this.address2 = address2; }

    public String getAddress3() { return address3; }

    public void setAddress3(String address3) { this.address3 = address3; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getPinCode() { return pinCode; }

    public void setPinCode(String pinCode) { this.pinCode = pinCode; }

    public String getBloodGroup() { return bloodGroup; }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}
