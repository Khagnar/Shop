package com.shop.model;

public class Customer extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(long id, String name) {
        super(id);
        this.name = name;
    }

    public Customer() {
    }
}
