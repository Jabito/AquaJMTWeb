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
@Table(name="shop_sales_information")
public class ShopSalesInformation implements Serializable {

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    private String id;
    @Column(name = "roundOffered")
    @JsonProperty("roundOffered")
    private Boolean roundOffered;
    @Column(name="slimOffered")
    @JsonProperty("slimOffered")
    private Boolean slimOffered;
    @Column(name="roundStock")
    @JsonProperty("roundStock")
    private Integer roundStock;
    @Column(name="slimStock")
    @JsonProperty("slimStock")
    private Integer slimStock;
    @Column(name = "distilled")
    @JsonProperty("distilled")
    private Boolean distilled;
    @Column(name="purified")
    @JsonProperty("purified")
    private Boolean purified;
    @Column(name="mineral")
    @JsonProperty("mineral")
    private Boolean mineral;
    @Column(name="alkaline")
    @JsonProperty("alkaline")
    private Boolean alkaline;
    @Column(name="distilledPrice")
    @JsonProperty("distilledPrice")
    private Double distilledPrice;
    @Column(name="purifiedPrice")
    @JsonProperty("purifiedPrice")
    private Double purifiedPrice;
    @Column(name="mineralPrice")
    @JsonProperty("mineralPrice")
    private Double mineralPrice;
    @Column(name="alkalinePrice")
    @JsonProperty("alkalinePrice")
    private Double alkalinePrice;
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

    public Boolean getRoundOffered() {
        return roundOffered;
    }

    public void setRoundOffered(Boolean roundOffered) {
        this.roundOffered = roundOffered;
    }

    public Boolean getSlimOffered() {
        return slimOffered;
    }

    public void setSlimOffered(Boolean slimOffered) {
        this.slimOffered = slimOffered;
    }

    public Integer getRoundStock() {
        return roundStock;
    }

    public void setRoundStock(Integer roundStock) {
        this.roundStock = roundStock;
    }

    public Integer getSlimStock() {
        return slimStock;
    }

    public void setSlimStock(Integer slimStock) {
        this.slimStock = slimStock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDistilled() {
        return distilled;
    }

    public void setDistilled(Boolean distilled) {
        this.distilled = distilled;
    }

    public Boolean getPurified() {
        return purified;
    }

    public void setPurified(Boolean purified) {
        this.purified = purified;
    }

    public Boolean getMineral() {
        return mineral;
    }

    public void setMineral(Boolean mineral) {
        this.mineral = mineral;
    }

    public Boolean getAlkaline() {
        return alkaline;
    }

    public void setAlkaline(Boolean alkaline) {
        this.alkaline = alkaline;
    }

    public Double getDistilledPrice() {
        return distilledPrice;
    }

    public void setDistilledPrice(Double distilledPrice) {
        this.distilledPrice = distilledPrice;
    }

    public Double getPurifiedPrice() {
        return purifiedPrice;
    }

    public void setPurifiedPrice(Double purifiedPrice) {
        this.purifiedPrice = purifiedPrice;
    }

    public Double getMineralPrice() {
        return mineralPrice;
    }

    public void setMineralPrice(Double mineralPrice) {
        this.mineralPrice = mineralPrice;
    }

    public Double getAlkalinePrice() {
        return alkalinePrice;
    }

    public void setAlkalinePrice(Double alkalinePrice) {
        this.alkalinePrice = alkalinePrice;
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
