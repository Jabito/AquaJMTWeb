package com.capstone.jmt.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Jabito on 15/02/2017.
 */
@Entity
@Table(name = "customer_login")
public class CustomerLogin implements Serializable{

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "username")
    @JsonProperty("username")
    private String username;
    @Column(name = "password")
    @JsonProperty("password")
    private String password;
    @Column(name = "email")
    @JsonProperty("email")
    private String email;
    @Column(name = "firstName")
    @JsonProperty("firstName")
    private String firstName;
    @Column(name="lastName")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name="middleName")
    @JsonProperty("middleName")
    private String middleName;
    @Column(name="cellphoneNo")
    @JsonProperty("cellphoneNo")
    private String cellphoneNo;
    @Column(name="landline")
    @JsonProperty("landline")
    private String landline;
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

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public void setCellphoneNo(String cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
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
