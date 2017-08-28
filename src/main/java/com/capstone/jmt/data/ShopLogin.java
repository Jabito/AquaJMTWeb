package com.capstone.jmt.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jabito on 15/02/2017.
 */
@Entity
@Table(name="shop_login")
public class ShopLogin {

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "username", unique = true)
    @JsonProperty("username")
    private String username;
    @Column(name="password")
    @JsonProperty("password")
    private String password;
    @Column(name="email")
    @JsonProperty("email")
    private String email;
    @Column(name="firstName")
    @JsonProperty("firstName")
    private String firstName;
    @Column(name="lastName")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name="middleName")
    @JsonProperty("middleName")
    private String middleName;
    @Column(name="staffOf")
    @JsonProperty("staffOf")
    private String staffOf;
    @Column(name="createdOn")
    @JsonProperty("createdOn")
    private String createdOn;
    @Column(name="updatedOn")
    @JsonProperty("updatedOn")
    private String updatedOn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStaffOf() {
        return staffOf;
    }

    public void setStaffOf(String staffOf) {
        this.staffOf = staffOf;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }
}
