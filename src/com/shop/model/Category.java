package com.shop.model;

public class Category extends BaseModel {

    private String name;
    private long amount;

    public Category(long id, String name, long amount) {
        super(id);
        this.name = name;
        this.amount = amount;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
