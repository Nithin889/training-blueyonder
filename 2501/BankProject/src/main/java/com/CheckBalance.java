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
 * Servlet implementation class CheckBalance
 */
public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h3>");
		String accNo=request.getParameter("accNo");
		String driver=getServletContext().getInitParameter("driver");
		String database=getServletContext().getInitParameter("database");
		String user=getServletContext().getInitParameter("user");
		String password=getServletContext().getInitParameter("password");
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(database,user,password);
			PreparedStatement ps=conn.prepareStatement("select bal from customer where accNo=?");
			ps.setString(1, accNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				out.print("Balance in the account is : "+rs.getLong(1));
			}
			else {
				out.print("Incorrect account number");
			}
			out.print("</h3");
			ps.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
