package com.shop.repository;

import java.sql.SQLException;

public class Goods extends BaseTable implements TableOperation {

    static final String TABLE_NAME = "goods";

    public Goods() throws SQLException {
    }

    @Override
    public void createTable() {
        super.executeSqlStatement("CREATE TABLE " + TABLE_NAME + " (" +
                "id SERIAL PRIMARY KEY, " +
                "producer_id INT NOT NULL, " +
                "category_id INT NOT NULL, " +
                "name VARCHAR(45) NOT NULL, " +
                "price DECIMAL(10, 2) NOT NULL, CHECK (price > 0), " +
                "amount INT NOT NULL, CHECK (amount > 0))",
                "Table " + TABLE_NAME + " has been created");
    }

    @Override
    public void createForeignKey() {
        super.executeSqlStatement("ALTER TABLE " + TABLE_NAME + " ADD FOREIGN KEY (producer_id) REFERENCES " + GoodProducers.TABLE_NAME + "(id)",
                "Foreign key '" + TABLE_NAME + ".producer_id -> " + GoodProducers.TABLE_NAME + ".id' has been created");

        super.executeSqlStatement("ALTER TABLE " + TABLE_NAME + " ADD FOREIGN KEY (category_id) REFERENCES " + Categories.TABLE_NAME + "(id)",
                "Foreign key '" + TABLE_NAME + ".producer_id -> " + Categories.TABLE_NAME + ".id' has been created");
    }

    @Override
    public void createConstraint() {
        super.executeSqlStatement("ALTER TABLE " + TABLE_NAME + " ADD CONSTRAINT price CHECK (price > 0)",
                "Constraint has been created (price > 0)");
    }
}
