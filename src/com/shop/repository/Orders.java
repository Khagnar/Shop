package com.shop.repository;

import java.sql.SQLException;

public class Orders extends BaseTable implements TableOperation {

    static final String TABLE_NAME = "orders";

    public Orders() throws SQLException {
    }

    @Override
    public void createTable() {
        super.executeSqlStatement("CREATE TABLE " + TABLE_NAME + " (" +
                "id SERIAL PRIMARY KEY, " +
                "customer_id INT NOT NULL, " +
                "good_id INT NOT NULL, " +
                "amount_goods INT NOT NULL, CHECK (amount_goods > 0), " +
                "sale_sum DECIMAL(10, 2) NOT NULL, CHECK (sale_sum >= 0), " +
                "status VARCHAR(45) NOT NULL, " +
                "date TIMESTAMP NOT NULL)",
                "Table "+ TABLE_NAME + " has been created");
    }

    @Override
    public void createForeignKey() {
        super.executeSqlStatement("ALTER TABLE " + TABLE_NAME + " ADD FOREIGN KEY (customer_id) REFERENCES " + Customers.TABLE_NAME + "(id)",
                "Foreign key '" + TABLE_NAME + ".customer_id -> " + Customers.TABLE_NAME + ".id' has been created");

        super.executeSqlStatement("ALTER TABLE " + TABLE_NAME + " ADD FOREIGN KEY (good_id) REFERENCES " + Goods.TABLE_NAME + "(id)",
                "Foreign key '" + TABLE_NAME + ".good_id -> " + Goods.TABLE_NAME + ".id' has been created");
    }

    @Override
    public void createConstraint() {
    }

}
