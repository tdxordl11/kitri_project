<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function() {
		if(<%=request.getAttribute("check") %>== 0 ) {
			alert("비밀번호가 틀려서 수정이 불가합니다");
		}
	
});
</script>
</head>
<body>
<form action="/mybatis/boardupdate" method="post">
<table class="table table-striped">
<tr>
	<td>번호</td>
	<td><input type="text" value="${detail.seq }" name=seq></td>
</tr>
<tr>
	<td>제목</td>
	<td><input type="text" value="${detail.title }" name=title></td>
</tr>
<tr>
	<td>작성자</td>
	<td><input type="text" value="${detail.writer }" name=writer></td>
</tr>
<tr>
	<td>작성시간</td>
	<td><input type="text" value="${detail.time }" name=time></td>
</tr>
<tr>
	<td>내용</td>
	<td><textarea type="text" name=contents rows=4 cols=20>${detail.contents }</textarea></td>
</tr>
<tr>
	<td>조회수</td>
	<td><input type="text" value="${detail.viewcount }" name=viewcount></td>
</tr>
<tr>
	<td>비밀번호 확인</td>
	<td><input type="password" name="password"></td>
</tr>
</table>

<input type="submit" id="updateendbtn" value="수정완료" >

</form>
</body>
</html>