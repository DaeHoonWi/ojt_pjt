<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/review.css"> 
<script src="js/review.js"></script>
<title>리뷰게시판</title>
</head>
<body>
Reiviewlist

<table>
	<tr>
		<th>번호</th><th>제목</th><th>작성자</th><th>조회수</th><th>추천수</th><th>작성일</th>
	</tr>
	<c:forEach items="${reveiwlist }" var="rwlist" varStatus="rwlist_index">
	<tr>
		<td>${rwlist.rNum }</td>
		<td><a href="javascript:movepage(${rwlist.r_num }, 'Reviewdetail.do')">${rwlist.r_title }</a></td>
		<td>${rwlist.mId }</td>
		<td>${rwlist.rCount }</td>
		<td>${rwlist.rLike }</td>
		<td>${rwlist.rDate }</td>
	</tr>
	</c:forEach>
</table>



</body>
</html>