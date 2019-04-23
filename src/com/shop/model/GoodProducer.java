package com.shop.model;

public class GoodProducer extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GoodProducer(long id, String name) {
        super(id);
        this.name = name;
    }

    public GoodProducer() {
    }
}
