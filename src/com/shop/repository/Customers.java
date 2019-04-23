package com.shop.repository;

import java.sql.SQLException;

public class Customers extends BaseTable implements TableOperation{

    static final String TABLE_NAME = "customers";

    public Customers() throws SQLException {
    }

    @Override
    public void createTable() {
        super.executeSqlStatement("CREATE TABLE " + TABLE_NAME + " (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(45) NOT NULL)",
                "Table " + TABLE_NAME + " has been created");
    }

    @Override
    public void createForeignKey() {
    }

    @Override
    public void createConstraint() {

    }
}
