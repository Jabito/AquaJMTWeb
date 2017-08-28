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
@Table(name="order_containers")
public class OrderContainers implements Serializable {

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "roundQty")
    @JsonProperty("roundQty")
    private Integer roundQty;
    @Column(name="roundCost")
    @JsonProperty("roundCost")
    private Double roundCost;
    @Column(name="slimQty")
    @JsonProperty("slimQty")
    private Integer slimQty;
    @Column(name="slimCost")
    @JsonProperty("slimCost")
    private Double slimCost;
    @Column(name="totalCost")
    @JsonProperty("totalCost")
    private Double totalCost;
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

    public Integer getRoundQty() {
        return roundQty;
    }

    public void setRoundQty(Integer roundQty) {
        this.roundQty = roundQty;
    }

    public Double getRoundCost() {
        return roundCost;
    }

    public void setRoundCost(Double roundCost) {
        this.roundCost = roundCost;
    }

    public Integer getSlimQty() {
        return slimQty;
    }

    public void setSlimQty(Integer slimQty) {
        this.slimQty = slimQty;
    }

    public Double getSlimCost() {
        return slimCost;
    }

    public void setSlimCost(Double slimCost) {
        this.slimCost = slimCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
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
