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
 * Servlet implementation class SendMoney
 */
public class SendMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h3>");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String money=request.getParameter("money");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			PreparedStatement ps=conn.prepareStatement("select bal from customer where accNo=?");
			ps.setString(1,from);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				long bal=rs.getLong(1);
				if(bal>=Long.parseLong(money)) {
					PreparedStatement ps2=conn.prepareStatement("select bal from customer where accNo=?");
					ps2.setString(1, to);
					ResultSet rs2=ps2.executeQuery();
					if(rs2.next()) {
						long bal2=rs2.getLong(1);
						bal-=Long.parseLong(money);
						bal2+=Long.parseLong(money);
						PreparedStatement ps3=conn.prepareStatement("update customer set bal=? where accNo=?");
						ps3.setLong(1,bal);
						ps3.setString(2, from);
						ps3.execute();
						PreparedStatement ps4=conn.prepareStatement("update customer set bal=? where accNo=?");
						ps4.setLong(1, bal2);
						ps4.setString(2, to);
						ps4.execute();
						ps3.close();
						ps4.close();
						out.print("Money sent successfully");
					}
					else {
						out.print("Incorrect receiver account number");
					}
					ps2.close();
				}
				else {
					out.print("Insufficient balance");
				}
			}
			else {
				out.print("Incorrect sender account number");
			}
			out.print("</h3");
			ps.close();
			conn.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h3>");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String money=request.getParameter("money");
		String driver=getServletContext().getInitParameter("driver");
		String database=getServletContext().getInitParameter("database");
		String user=getServletContext().getInitParameter("user");
		String password=getServletContext().getInitParameter("password");
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(database,user,password);
			PreparedStatement ps=conn.prepareStatement("select bal from customer where accNo=?");
			ps.setString(1,from);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				long bal=rs.getLong(1);
				if(bal>=Long.parseLong(money)) {
					PreparedStatement ps2=conn.prepareStatement("select bal from customer where accNo=?");
					ps2.setString(1, to);
					ResultSet rs2=ps2.executeQuery();
					if(rs2.next()) {
						long bal2=rs2.getLong(1);
						bal-=Long.parseLong(money);
						bal2+=Long.parseLong(money);
						PreparedStatement ps3=conn.prepareStatement("update customer set bal=? where accNo=?");
						ps3.setLong(1,bal);
						ps3.setString(2, from);
						ps3.execute();
						PreparedStatement ps4=conn.prepareStatement("update customer set bal=? where accNo=?");
						ps4.setLong(1, bal2);
						ps4.setString(2, to);
						ps4.execute();
						ps3.close();
						ps4.close();
						out.print("Money sent successfully");
					}
					else {
						out.print("Incorrect receiver account number");
					}
					ps2.close();
				}
				else {
					out.print("Insufficient balance");
				}
			}
			else {
				out.print("Incorrect sender account number");
			}
			out.print("</h3");
			ps.close();
			conn.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
