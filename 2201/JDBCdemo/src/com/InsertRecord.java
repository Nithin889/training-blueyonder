package com;
import java.sql.*;
public class InsertRecord{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blueyonder", "root", "root");
            Statement stmt = conn.createStatement();
            stmt.execute("insert into employee values(200,'Mahesh',25,20000,'tester')");
            stmt.close();
            conn.close();
            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}