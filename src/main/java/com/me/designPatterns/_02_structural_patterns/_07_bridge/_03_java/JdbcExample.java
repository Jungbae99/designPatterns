package com.me.designPatterns._02_structural_patterns._07_bridge._03_java;

import javax.xml.transform.Result;
import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "create table account " +
                    "(id integer not null, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY (id)) ";
            Statement statement = conn.createStatement();
            statement.execute(sql);

            PreparedStatement statement1 = conn.prepareStatement(sql);
//            Result result = statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
