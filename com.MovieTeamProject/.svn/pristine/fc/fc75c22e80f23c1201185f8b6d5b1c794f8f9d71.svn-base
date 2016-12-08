<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>영화 정보 수정 :(</title>
	<script src="js/jquery-latest.min.js"></script>
</head>
<body>

	<!-- <table width="500" cellpadding="0" cellspacing="0" border="1"> -->
	<table>
		<form action="cinemaUpdate.do" method="post">
			<tr>
				<td><input type="text" name="cNum" value="${cinemaDetail.cNum}"> <!-- hidden으로 수정해야함 --></td>
			</tr>
			<tr>
				<td>나라(1:한국, 2:일본, 3:중국, 4:미국, 5:영국, 6:영국/미국))</td>
				<td><input type="text" name="couNum" value="${cinemaDetail.couNum}" size="50"></td>
			</tr>
			<tr>
				<td>영화 제목(한글 100자, 영문 200자 제한)/td>
				<td><input type="text" name="cTitle" value="${cinemaDetail.cTitle}" size="50"></td>
			</tr>
			<tr>
				<td>러닝타임(숫자)</td>
				<td><input type="text" name="cRunningtime" value="${cinemaDetail.cRunningtime}" size="50"></td>
			</tr>
			<tr>
				<td>줄거리</td>
				<!-- textarea의 기본 값을 불러오는 태그를 찾지 못해서 우선 placeholder으로 대체, 수정 필요 -->
				<td><textarea name="cSummary" placeholder="${cinemaDetail.cSummary}" cols="36" rows="10"></textarea></td>
			</tr>
			<tr>
				<td>리뷰 수</td>
				<td>디폴트 0</td>
			</tr>
			<tr>
				<td>시청연령제한(숫자)</td>
				<td><input type="text" name="cAge" value="${cinemaDetail.cAge}" size="50"></td>
			</tr>
			<tr>
				<td>원본파일명(한글50자, 영문100자 제한)</td>
				<td><input type="text" name="cOriginalFileName" value="${cinemaDetail.cOriginalFileName}" size="50"></td>
			</tr>
			<tr>
				<td>저장파일명(한글100자, 영문200자 제한)</td>
				<td>생략</td>
			</tr>
			<tr>
				<td>개봉일(숫자 6자리)</td>
				<td><input type="text" name="cPlaydate" value="${cinemaDetail.cPlaydate}" size="50"></td>
			</tr>
		<tr>
			<td colspan="2"><input type="submit" value="입력">
				&nbsp;&nbsp; <a href="cinemaList.do">목록보기</a>
				&nbsp;&nbsp;<a href="cinemaDetailView.do?cNum=${cinemaDetail.cNum}">뒤로가기</a></td>
		</tr>
		</form>
	</table>
</body>
</html>