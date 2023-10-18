package com.UserDetailsService.userentity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="user_data",schema = "public")
public class UserEntity {

    @Id
    @Column(name="USERNAME")
    private String username;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="GENDER")
    private String gender;


    @Column(name="DOB")
    private Date dateOfBirth;

    @Column(name="EMAIL_ID")
    private String emailId;

    @Column(name="PHONE_NUM")
    private long phoneNum;


    //@JoinColumn(name = "address_data_ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    @OneToOne(cascade = CascadeType.ALL)
    private AddressEntity address;


    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}
