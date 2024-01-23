package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updateRecord {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blueyonder", "root", "root");
        // Statement stmt = conn.createStatement();
        PreparedStatement stmt= conn.prepareStatement("update employee set salary=? where id=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id");int id=sc.nextInt();
        System.out.println("Enter employee salary");float salary=sc.nextFloat();
        stmt.setFloat(1,salary);
        stmt.setInt(2,id);
        stmt.execute();
        stmt.close();
        conn.close();
        System.out.println("Data updated successfully");


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
}
}
