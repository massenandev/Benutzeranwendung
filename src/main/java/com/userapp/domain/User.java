package com.userapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//Serializable - This class is gonna be going from being java class into a different stream that can be saved into the database
//The serializable makes the transition a lot easier when you are moving the type of representation of the data into another
@Entity //marks as a table in db
public class User implements Serializable {
    //this id will be for the PK that identifies the user. it will be storage in a different table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    //customer id
    private String userIf;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String profileImageUrl;
    //the last time a user logged in
    private Date lastLogin;
    //the actual data we are gonna use to show when the user logs in. thats to track how many times the user tried to login
    private Date lastLoginDisplay;
    private Date joinDate;
    private String[] role; //rollen_nutzerin{read, update}, rolle_admin{delete, create, read, update}
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;

    //default constructor
    public User() {}

    public User(Long id, String userIf, String firstName, String lastName, String userName, String password, String email, String profileImageUrl, Date lastLogin, Date lastLoginDisplay, Date joinDate, String[] role, String[] authorities, boolean isActive, boolean isNotLocked) {
        this.id = id;
        this.userIf = userIf;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.lastLogin = lastLogin;
        this.lastLoginDisplay = lastLoginDisplay;
        this.joinDate = joinDate;
        this.role = role;
        this.authorities = authorities;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIf() {
        return userIf;
    }

    public void setUserIf(String userIf) {
        this.userIf = userIf;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastLoginDisplay() {
        return lastLoginDisplay;
    }

    public void setLastLoginDisplay(Date lastLoginDisplay) {
        this.lastLoginDisplay = lastLoginDisplay;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public void setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
    }
}
