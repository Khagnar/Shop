package com.shop;

import com.shop.repository.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/shop";
    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String USER = "postgres";
    private static final String PASS = "1234";

    private Categories categories;
    private Customers customers;
    private GoodProducers goodProducers;
    private Goods goods;
    private Orders orders;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    private Main() {
        try {
            Class.forName(DB_DRIVER);
            categories = new Categories();
            customers = new Customers();
            goodProducers = new GoodProducers();
            goods = new Goods();
            orders = new Orders();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC driver is not found");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }
    }

    private void createAllTables() {
        categories.createTable();
        customers.createTable();
        goods.createTable();
        goodProducers.createTable();
        orders.createTable();
    }

    private void createAllForeignKeys() {
        categories.createForeignKey();
        customers.createForeignKey();
        goods.createForeignKey();
        goodProducers.createForeignKey();
        orders.createForeignKey();
    }

    private void createAllConstraints() {
        categories.createConstraint();
        customers.createConstraint();
        goods.createConstraint();
        goodProducers.createConstraint();
        orders.createConstraint();
    }

    public static void main(String[] argv) {

        Main main = new Main();
        main.createAllTables();
        main.createAllForeignKeys();
        main.createAllConstraints();
    }
}
