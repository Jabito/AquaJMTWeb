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

public class OrderInfo implements Serializable{


    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "orderedBy")
    @JsonProperty("orderedBy")
    private String orderedBy;
    @Column(name="orderedFrom")
    @JsonProperty("orderedFrom")
    private String orderedFrom;
    @Column(name="customerAddress")
    @JsonProperty("customerAddress")
    private String customerAddress;
    @Column(name="waterType")
    @JsonProperty("waterType")
    private String waterType;
    @Column(name="roundOrdered")
    @JsonProperty("roundOrdered")
    private Integer roundOrdered;
    @Column(name="slimOrdered")
    @JsonProperty("slimOrdered")
    private Integer slimOrdered;
    @Column(name="costPerItem")
    @JsonProperty("costPerItem")
    private Double costPerItem;
    @Column(name="totalCost")
    @JsonProperty("totalCost")
    private Double totalCost;
    @Column(name="moreDetails")
    @JsonProperty("moreDetails")
    private String moreDetails;
    @Column(name="createdOn")
    @JsonProperty("createdOn")
    private String createdOn;
    @Column(name="updatedOn")
    @JsonProperty("updatedOn")
    private String updatedOn;
    @Column(name="updatedBy")
    @JsonProperty("updatedBy")
    private String updatedBy;
    @Column(name="ratingGiven")
    @JsonProperty("ratingGiven")
    private Integer ratingGiven;
    @Column(name="status")
    @JsonProperty("status")
    private String status;
    @Column(name="comments")
    @JsonProperty("comments")
    private String comments;
    @Column(name = "Name")
    @JsonProperty("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public String getOrderedFrom() {
        return orderedFrom;
    }

    public void setOrderedFrom(String orderedFrom) {
        this.orderedFrom = orderedFrom;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public Integer getRoundOrdered() {
        return roundOrdered;
    }

    public void setRoundOrdered(Integer roundOrdered) {
        this.roundOrdered = roundOrdered;
    }

    public Integer getSlimOrdered() {
        return slimOrdered;
    }

    public void setSlimOrdered(Integer slimOrdered) {
        this.slimOrdered = slimOrdered;
    }

    public Double getCostPerItem() {
        return costPerItem;
    }

    public void setCostPerItem(Double costPerItem) {
        this.costPerItem = costPerItem;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
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

    public Integer getRatingGiven() {
        return ratingGiven;
    }

    public void setRatingGiven(Integer ratingGiven) {
        this.ratingGiven = ratingGiven;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
