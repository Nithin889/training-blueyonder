package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nam = request.getParameter("nam");
		String phone=request.getParameter("phone");
		String aadhar=request.getParameter("aadhar");
		String pan=request.getParameter("pan");
		String bal=request.getParameter("bal");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery("select * from latestAccountNumber");
			rs.next();
			long accNo=rs.getLong(1);
			accNo++;
			PreparedStatement stmt1=
			conn.prepareStatement("update latestAccountNumber set value=?");
			stmt1.setLong(1, accNo);
			stmt1.execute();
			PreparedStatement stmt=
			conn.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			stmt.setString(1, aadhar);
			stmt.setString(2, nam);
			stmt.setString(3, phone);
			stmt.setString(4, pan);
			stmt.setString(5, bal);
			stmt.setLong(6, accNo);
			stmt.execute();
			s.close();
			stmt1.close();
			stmt.close();
			conn.close();
			RequestDispatcher td=request.getRequestDispatcher("Home.html");
			td.forward(request,response);
			
		}
		catch(Exception E) {
			System.out.println(E);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nam = request.getParameter("nam");
		String phone=request.getParameter("phone");
		String aadhar=request.getParameter("aadhar");
		String pan=request.getParameter("pan");
		String bal=request.getParameter("bal");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String driver=getServletContext().getInitParameter("driver");
		String database=getServletContext().getInitParameter("database");
		String user=getServletContext().getInitParameter("user");
		String password=getServletContext().getInitParameter("password");
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(database,user,password);
			Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery("select * from latestAccountNumber");
			rs.next();
			long accNo=rs.getLong(1);
			accNo++;
			PreparedStatement stmt1=
			conn.prepareStatement("update latestAccountNumber set value=?");
			stmt1.setLong(1, accNo);
			stmt1.execute();
			PreparedStatement stmt=
			conn.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			stmt.setString(1, aadhar);
			stmt.setString(2, nam);
			stmt.setString(3, phone);
			stmt.setString(4, pan);
			stmt.setString(5, bal);
			stmt.setLong(6, accNo);
			stmt.execute();
			s.close();
			stmt1.close();
			stmt.close();
			conn.close();
			RequestDispatcher td=request.getRequestDispatcher("Home.html");
			td.forward(request,response);
			
		}
		catch(Exception E) {
			System.out.println(E);
		}
		
	}


}
