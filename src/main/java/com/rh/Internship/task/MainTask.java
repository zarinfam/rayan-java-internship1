package com.rh.Internship.task;

import java.sql.*;

/**
 * @author Saeed Zarinfam
 */
public class MainTask {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/new_schema?characterEncoding=UTF-8&useSSL=false";

    //  Database credentials
    static final String USER = "test";
    static final String PASS = "p";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 1: Register JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            stmt = conn.createStatement();

            String sql = "SELECT * FROM new_table";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 4: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                String name = rs.getString("name");

                //Display values
                System.out.println("name: " + name);
            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
    }
}
