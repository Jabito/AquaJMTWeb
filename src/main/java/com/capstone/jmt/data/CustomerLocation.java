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
@Table(name="customer_location")
public class CustomerLocation implements Serializable {

    @Id
    @Column(name="id")
    @JsonProperty("id")
    private String id;
    @Column(name="address")
    @JsonProperty("address")
    private String address;
    @Column(name="longitude")
    @JsonProperty("longitude")
    private Float longitude;
    @Column(name="latitude")
    @JsonProperty("latitude")
    private Float latitude;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
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
