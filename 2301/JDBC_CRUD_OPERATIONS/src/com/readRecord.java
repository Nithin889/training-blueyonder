package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class readRecord {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blueyonder", "root", "root");
        // Statement stmt = conn.createStatement();
        PreparedStatement stmt= conn.prepareStatement("select * from employee where id=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id");int id=sc.nextInt();
        stmt.setInt(1,id);
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getString(5));
        }

        stmt.close();
        conn.close();
        sc.close();
        System.out.println("Data retrieved successfully");


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
}
}
