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
@Table(name="shop_info")
public class ShopInfo implements Serializable{

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "businessName")
    @JsonProperty("businessName")
    private String businessName;
    @Column(name="address")
    @JsonProperty("address")
    private String address;
    @Column(name="email")
    @JsonProperty("email")
    private String email;
    @Column(name="cellphoneNo")
    @JsonProperty("cellphoneNo")
    private String cellphoneNo;
    @Column(name="alternateNo")
    @JsonProperty("alternateNo")
    private String alternateNo;
    @Column(name="timeOpen")
    @JsonProperty("timeOpen")
    private String timeOpen;
    @Column(name="timeClose")
    @JsonProperty("timeClose")
    private String timeClose;
    @Column(name="allowSwap")
    @JsonProperty("allowSwap")
    private Boolean allowSwap;
    @Column(name="accountVerified")
    @JsonProperty("accountVerified")
    private Boolean accountVerified;
    @Column(name="daysAvailable")
    @JsonProperty("daysAvailable")
    private String daysAvailable;
    @Column(name="openOnHolidays")
    @JsonProperty("openOnHolidays")
    private Boolean openOnHolidays;
    @Column(name="createdOn")
    @JsonProperty("createdOn")
    private String createdOn;
    @Column(name="updatedOn")
    @JsonProperty("updatedOn")
    private String updatedOn;
    @Column(name="updatedBy")
    @JsonProperty("updatedBy")
    private String updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public void setCellphoneNo(String cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }

    public String getAlternateNo() {
        return alternateNo;
    }

    public void setAlternateNo(String alternateNo) {
        this.alternateNo = alternateNo;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public String getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(String timeClose) {
        this.timeClose = timeClose;
    }

    public Boolean getAllowSwap() {
        return allowSwap;
    }

    public void setAllowSwap(Boolean allowSwap) {
        this.allowSwap = allowSwap;
    }

    public Boolean getAccountVerified() {
        return accountVerified;
    }

    public void setAccountVerified(Boolean accountVerified) {
        this.accountVerified = accountVerified;
    }

    public String getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(String daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public Boolean getOpenOnHolidays() {
        return openOnHolidays;
    }

    public void setOpenOnHolidays(Boolean openOnHolidays) {
        this.openOnHolidays = openOnHolidays;
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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}
