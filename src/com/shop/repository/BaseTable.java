package com.shop.repository;



import com.shop.Main;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseTable implements Closeable {

    private Connection connection;

    BaseTable() throws SQLException {
        this.connection = Main.getConnection();
    }

    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed())
                connection.close();
        }
        catch (SQLException e) {
            System.err.println("Cannot close SQL connection");
            e.printStackTrace();

        }
    }

    void executeSqlStatement(String sql, String description) {
        reopenConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        if (description != null) {
            System.out.println(description);
        }
    }

    private void reopenConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = Main.getConnection();
            }
        }
        catch (SQLException e) {
            System.err.println("Cannot open SQL connection");
            e.printStackTrace();
        }

    }
}
