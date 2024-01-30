package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class RegisterDemo
 */
public class RegisterDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.print("<h1>");

		String uid=request.getParameter("uid");
		String uname=request.getParameter("uname");
		String uage=request.getParameter("uage");
		String usalary=request.getParameter("usalary");
		String udesig=request.getParameter("udesig");
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			
			Connection con=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			
			PreparedStatement stmt=
			con.prepareStatement("insert into employee values(?,?,?,?,?)");
		
			stmt.setString(1, uid);
			stmt.setString(2,uname);
			stmt.setString(3, uage);
			stmt.setString(4, usalary);
			stmt.setString(5, udesig);
			stmt.execute();
			
			stmt.close();con.close();
			out.println("Data Inserted Successfully....!");
			out.print("</h1>");

					}
				catch(Exception e)
				{ System.out.println(e);}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
