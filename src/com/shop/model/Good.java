package com.shop.model;

public class Good extends BaseModel{

    private String name;
    private float price;
    private long amount;

    public Good(long id, String name, long price, long amount) {
        super(id);
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Good() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
