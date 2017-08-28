package com.capstone.jmt.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Jabito on 15/06/2017.
 */
public class LastSevenDays implements Serializable{

    @JsonProperty("date")
    private String date;
    @JsonProperty("sold")
    private Integer sold;
    @JsonProperty("sales")
    private Double sales;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }
}
