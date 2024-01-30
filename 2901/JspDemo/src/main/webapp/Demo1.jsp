<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%!
int a;
int b;
int ans;
String operation;
%>
<%
a=Integer.parseInt(request.getParameter("a"));
b=Integer.parseInt(request.getParameter("b"));
operation=request.getParameter("button");
if(operation.equals("add")){
	ans=a+b;
	out.print("<h3>Sum of the numbers is : ");
}
else if(operation.equals("subtract")){
	ans=a-b;
	out.print("<h3>Difference between numbers is : ");
}
else if(operation.equals("multiply")){
	ans=a*b;
	out.print("<h3>Multiplication of numbers is : ");
}
else{
	ans=a/b;
	out.print("<h3>Division of the numbers is : ");
}

%>
<%=ans %><%out.print("</h3>"); %>
</body>
</html>