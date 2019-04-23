package com.shop.model;

import java.util.TimeZone;

public class Order extends BaseModel {

    private long customer;
    private long goods;
    private long amountGoods;
    private float saleSum;
    private String status;
    private TimeZone date;

    public Order(long id, long customer, long goods, long amountGoods, float saleSum, String status, TimeZone date) {
        super(id);
        this.customer = customer;
        this.goods = goods;
        this.amountGoods = amountGoods;
        this.saleSum = saleSum;
        this.status = status;
        this.date = date;
    }

    public Order() {
    }

    public long getCustomer() {
        return customer;
    }

    public void setCustomer(long customer) {
        this.customer = customer;
    }

    public long getGoods() {
        return goods;
    }

    public void setGoods(long goods) {
        this.goods = goods;
    }

    public long getAmountGoods() {
        return amountGoods;
    }

    public void setAmountGoods(long amountGoods) {
        this.amountGoods = amountGoods;
    }

    public float getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(float saleSum) {
        this.saleSum = saleSum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TimeZone getDate() {
        return date;
    }

    public void setDate(TimeZone date) {
        this.date = date;
    }
}
