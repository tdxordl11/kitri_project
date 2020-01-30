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
<h1> 게시물 리스트 조회 페이지 5개씩 1페이지</h1>

<%-- <c:forEach items="${allboard }" var="vo">
	${vo }<br>
</c:forEach> --%>

<a href="/mybatis/boardwrite"><input type="button" id="writebtn" value="글쓰기"></a>
<table class="table table-striped">
<tr><th>번호</th><th>제목</th><th>내용</th><th>작성자</th><th>암호</th><th>작성시간</th><th>조회수</th> 
<c:forEach items="${boardlist }" var="vo">
<tr><td>${vo.seq}</td><td><a href="/mybatis/boarddetail?seq=${vo.seq}">${vo.title}</a></td><td>${vo.contents}</td><td>${vo.writer }</td><td>${vo.password }</td><td>${vo.time }</td><td>${vo.viewcount }</td></tr>
</c:forEach>
</table>


<%-- <%
int totalcnt = (Integer)request.getAttribute("totalcnt");

for(int i=1;i<=totalcnt/5+1;i++){
	out.print("<a href='/mybatis/boardpaginglist?pagenum="+i+"'>"+i+"</a>&nbsp");
}

%> --%>

<nav style="text-align: center;">
<ul class="pagination">

<c:forEach var = "i" begin="1" end = "${totalcnt/5+1}" step="1">
	<li><a href="/mybatis/boardpaginglist?pagenum=${ i }">${ i }</a></li>
</c:forEach>

  </ul>
</nav>

</body>
</html>