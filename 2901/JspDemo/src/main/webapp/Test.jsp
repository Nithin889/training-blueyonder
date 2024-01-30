<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function fun(){
	document.getElementById("answer").value=parseInt(document.getElementById("a").value)+parseInt(document.getElementById("b").value);
	console.log("hi");
	
}
</script>
a=<input type="text" id="a">
b=<input type="text" id="b">
answer=<input type="text" id="answer">
<button  id="button" onclick="fun()">add</button>

</body>
</html>