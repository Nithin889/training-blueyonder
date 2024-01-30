<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Status</title>
</head>
<body style="align-items:center">
<h3>Hello <%=session.getAttribute("username") %></h3>
<%!
Connection conn;
PreparedStatement ps;
Statement s;
String name;
String age;
String phone;
ResultSet rs;
%>
<%
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost/college","root","root");
ps=conn.prepareStatement("insert into student values(?,?,?)");
name=request.getParameter("name");
age=request.getParameter("age");
phone=request.getParameter("phone");
ps.setString(1,name);
ps.setString(2,age);
ps.setString(3,phone);
ps.execute();
s=conn.createStatement();
rs=s.executeQuery("select * from student");

%>
<div style="text-align:center">
<table style="border: 1px solid black;
  border-collapse: collapse">
<tr>
<th style="border: 1px solid black;
  border-collapse: collapse">name</th>
<th style="border: 1px solid black;
  border-collapse: collapse">age</th>
<th style="border: 1px solid black;
  border-collapse: collapse">phone</th>
</tr>
<%while(rs.next()){ %>
<tr>
<td style="border: 1px solid black;
  border-collapse: collapse"><%=rs.getString(1) %></td>
<td style="border: 1px solid black;
  border-collapse: collapse"><%=rs.getInt(2) %></td>
<td style="border: 1px solid black;
  border-collapse: collapse"><%=rs.getLong(3) %></td>
</tr>
<%} %>
</table>
</div>
<%s.close();
ps.close();
conn.close(); %>
</body>
</html>