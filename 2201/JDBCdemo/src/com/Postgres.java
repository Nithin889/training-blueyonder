package com;

import java.sql.*;
import java.sql.DriverManager;

public class Postgres {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/blueyonder2", "postgres", "root");
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
