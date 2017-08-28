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
@Table(name="shop_location")
public class ShopLocation implements Serializable {

    @Id
    @Column(name="id")
    @JsonProperty("id")
    private String id;
    @Column(name="shopAddress")
    @JsonProperty("shopAddress")
    private String shopAddress;
    @Column(name="shopLongitude")
    @JsonProperty("shopLongitude")
    private Float shopLongitude;
    @Column(name="shopLatitude")
    @JsonProperty("shopLatitude")
    private Float shopLatitude;
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

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Float getShopLongitude() {
        return shopLongitude;
    }

    public void setShopLongitude(Float shopLongitude) {
        this.shopLongitude = shopLongitude;
    }

    public Float getShopLatitude() {
        return shopLatitude;
    }

    public void setShopLatitude(Float shopLatitude) {
        this.shopLatitude = shopLatitude;
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
