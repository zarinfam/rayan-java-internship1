package com.rh.internship.task.daos;

import java.sql.*;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Saeed Zarinfam
 */
public class GeneralDaoJdbc {
    // JDBC database URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/task_db?characterEncoding=UTF-8&useSSL=false";

    // Database credentials
    static final String USER = "test";
    static final String PASS = "p";

    public <T> Optional<T> runQuery(Function<Statement, T> queryBlock){

        Optional<T> ret = Optional.empty();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            try (Statement stmt = conn.createStatement()) {
                ret = Optional.ofNullable(queryBlock.apply(stmt));
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return ret;
    }

    public <T> Optional<T> runQuery(Function<PreparedStatement, T> codeBlock, String query){
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                return Optional.ofNullable(codeBlock.apply(stmt));
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return Optional.empty();
    }

}
