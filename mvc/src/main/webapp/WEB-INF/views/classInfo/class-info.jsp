<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이 페이지는 강의 리스트</h3>
<%=request.getAttribute("classInfoList") %>

<table board ="3">
<tr>
	<th>번호</th>
	<th>이름</th>
	<th>내용</th> 


 </tr>

<%
for(Map<String, String> map:list {
%>

	<tr>
	<td><%=map.get("ciNum") %></td>
	<td><%=map.get("ciName") %></td>
	<td><%=map.get("ci") %></td>
	
	
	
	
	</tr>

</table>


</body>
</html>