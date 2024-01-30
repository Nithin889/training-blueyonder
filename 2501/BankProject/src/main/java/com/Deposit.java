package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deposit
 */
public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String accNo=request.getParameter("accNo");
		String money=request.getParameter("money");
		long bal;
		response.setContentType("text/html");
		out.print("<h3>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			PreparedStatement ps=conn.prepareStatement("select bal from customer where accNo=?");
			ps.setString(1,accNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bal=rs.getLong(1);
				bal+=Long.parseLong(money);
				PreparedStatement ps2=conn.prepareStatement("update customer set bal=? where accNo=?");
				ps2.setLong(1, bal);
				ps2.setString(2, accNo);
				ps2.execute();
				ps2.close();
				out.println("Money deposited successfully");
				out.print("</h3>");
				ps.close();
				conn.close();
				
			}
			else {
				out.print("Incorrect account number</h3>");
				ps.close();
				conn.close();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String accNo=request.getParameter("accNo");
		String money=request.getParameter("money");
		long bal;
		response.setContentType("text/html");
		out.print("<h3>");
		String driver=getServletContext().getInitParameter("driver");
		String database=getServletContext().getInitParameter("database");
		String user=getServletContext().getInitParameter("user");
		String password=getServletContext().getInitParameter("password");
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(database,user,password);
			PreparedStatement ps=conn.prepareStatement("select bal from customer where accNo=?");
			ps.setString(1,accNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bal=rs.getLong(1);
				bal+=Long.parseLong(money);
				PreparedStatement ps2=conn.prepareStatement("update customer set bal=? where accNo=?");
				ps2.setLong(1, bal);
				ps2.setString(2, accNo);
				ps2.execute();
				ps2.close();
				out.println("Money deposited successfully");
				out.print("</h3>");
				ps.close();
				conn.close();
				
			}
			else {
				out.print("Incorrect account number</h3>");
				ps.close();
				conn.close();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
