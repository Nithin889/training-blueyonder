package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class batchStatements {
    public static void main(String[] args) {
            try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blueyonder", "root", "root");
        // Statement stmt = conn.createStatement();
        Statement stmt= conn.createStatement();
        stmt.addBatch("insert into employee values(3432,'idf',2,454,'dcd')");
        stmt.addBatch("insert into employee values(343292,'id392f',23,4254,'ddcd')");
        stmt.executeBatch();
        stmt.close();
        conn.close();
        System.out.println("Data updated successfully");


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    }
}
