<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script src="//code.jquery.com/jquery-latest.min.js"></script> -->
<link rel="stylesheet" href="css/review.css"> 
<script src="js/review.js"></script>
<title>리뷰게시판</title>
</head>
<body>
Reiviewlist

<table>
	<tr>
		<th colspan="4" style="text-align: left; font-size: 20pt;">${rdto.r_title }</th>	
	</tr>
	<tr>
		<td style="text-align: left">${rdto.mId }</td><td>${rdto.rDate }</td><td>조회 ${rdto.rCount }</td><td>추천 ${rdto.rLike }</td>
	</tr>
	<tr><td colspan="4"><hr></td></tr>
	<tr>
		<td colspan="3">${rdto.rContent }</td><td>이미지</td>
	</tr>
	<tr><td colspan="4"><hr></td></tr>
	<tr>
		<th>첨부파일</th>
		<td colspan="2"></td>
		<td>
			<%-- <button onclick="javascript:movepage(${rdto.r_num}, 'reviewlist.do')">목록</button> --%>
			<button onclick="">목록</button>
			<c:if test="${rdto.mId eq login.mId }"> 	<!-- 글작성자와 로그인 회원이 동일한 경우 -->
				<button onclick="javascript:movepage(${rdto.rNum}, 'reviewmodify.do')">수정</button>
				<button onclick="javascript:movepage(${rdto.rNum}, 'reviewdelete.do')">삭제</button>
			</c:if>
			<c:if test="${rdto.mId ne login.mId }">  	<!-- 글작성자와 로그인 회원이 동일하지 않을 경우 -->
				<button onclick="javascript:movepage(${rdto.rNum}, 'reviewlike.do')">추천</button>
			</c:if>
		</td>
	</tr>
	
</table>



</body>
</html>