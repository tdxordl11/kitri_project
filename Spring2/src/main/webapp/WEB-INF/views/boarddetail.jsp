<%@page import="com.sun.tools.javac.util.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='<%=request.getContextPath() + "/resources/jquery-3.2.1.min.js"%>'></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script>
$(document).ready(function() {
 	$("#updatebtn").on('click', function() {
 		location.href="/mybatis/boardupdate?seq=${detail.seq}";

		
	}); 
	
});
</script>
</head>
<body>
<table class="table table-striped">
<tr>
	<td>번호</td>
	<td>${detail.seq }</td>
</tr>
<tr>
	<td>제목</td>
	<td id=title>${detail.title }</td>
</tr>
<tr>
	<td>작성자</td>
	<td>${detail.writer }</td>
</tr>
<tr>
	<td>작성시간</td>
	<td>${detail.time }</td>
</tr>
<tr>
	<td>내용</td>
	<td id=contents><textarea type="text" name=contents rows=4 cols=20>${detail.contents }</textarea></td>
</tr>
<tr>
	<td>조회수</td>
	<td>${detail.viewcount }</td>
</tr>
</table>

<input type="button" id="updatebtn" value="수정">
<input type="button" id="deletebtn" value="삭제" onclick="location.href='/mybatis/boarddelete?seq=${detail.seq}'" >
<!--  onclick="location.href='/mybatis/boardupdate?seq=${detail.seq}'" -->
</body>
</html>