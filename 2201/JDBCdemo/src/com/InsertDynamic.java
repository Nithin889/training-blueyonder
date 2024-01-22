package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamic {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blueyonder", "root", "root");
        // Statement stmt = conn.createStatement();
        PreparedStatement stmt= conn.prepareStatement("insert into employee values(?,?,?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id");int id=sc.nextInt();
        System.out.println("Enter employee name");String name=sc.next();
        System.out.println("Enter employee age");int age=sc.nextInt();
        System.out.println("Enter employee salary");float salary=sc.nextFloat();
        System.out.println("Enter employee designation");String designation=sc.next();
        stmt.setInt(1,id);
        stmt.setString(2,name);
        stmt.setInt(3,age);
        stmt.setFloat(4,salary);
        stmt.setString(5,designation);
        stmt.execute();
        stmt.close();
        conn.close();
        System.out.println("Data inserted successfully");


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
}
}