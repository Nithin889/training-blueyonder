package com;
import java.sql.*;
public class SqlServerr {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=blueyonder;encrypt=true;trustServerCertificate=true","nithin","Nithin@889");
            Statement stmt = conn.createStatement();
            stmt.execute("insert into employee values(200,'Mahesh',25,20000,'tester')");
            stmt.close();
            conn.close();
            System.out.println("Data inserted successfully");
        }
        catch(Exception e){
            System.out.println(e);   
        }
    }

}
