<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script>
$(document).ready(function() {

	
});
</script>
</head>
<body>
<form action="/mybatis/boardwrite" method="post" >
<div>
	제목:<input type=text name=title ><br>
</div>
<div>
	내용:<textarea name=contents rows=4 cols=20 placeholder="내용을 입력하세요"></textarea><br>
</div>
	작성자:<input type=text name=writer ><br>
<div>
	암호:<input type=password name=password ><br>
</div>
<div>
	<input type=submit value="글쓰기 완료" >
</div>
</body>
</html>