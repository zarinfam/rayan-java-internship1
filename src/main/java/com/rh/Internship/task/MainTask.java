package com.rh.Internship.task;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class MainTask {
    // JDBC database URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/task_db?characterEncoding=UTF-8&useSSL=false";

    // Database credentials
    static final String USER = "test";
    static final String PASS = "p";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "SELECT * FROM task";
                ResultSet rs = stmt.executeQuery(sql);
                //STEP 3: Extract data from result set
                while (rs.next()) {
                    //Retrieve by column name
                    String name = rs.getString("name");

                    //Display values
                    System.out.println("name: " + name);
                }
                rs.close();
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
