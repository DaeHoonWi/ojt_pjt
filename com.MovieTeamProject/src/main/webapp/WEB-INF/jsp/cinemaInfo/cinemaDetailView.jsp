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
	<title>영화 상세정보</title>
	<script src="js/jquery-latest.min.js"></script>
</head>
<body>
		상세정보 page 입니다. 리스트로 돌아가시려면
		<a href="cinemaList.do">여기</a>를 클릭 해 주세요 <br><br>
		영화 번호	: ${cinemaDetail.cNum} <br>
		국가		: ${cinemaDetail.couNum} <br>
		제목		: ${cinemaDetail.cTitle} <br>
		러닝타임	: ${cinemaDetail.cRunningtime} 분 <br>
		줄거리		: ${cinemaDetail.cSummary} <br>

		리뷰수		: ${cinemaDetail.cCount} 개<br>
		시청연령제한: ${cinemaDetail.cAge} 세 관람가<br>
		원본파일명	: ${cinemaDetail.cOriginalFileName} <br>
		저장파일명	: ${cinemaDetail.cStoredFileName} <br>
		개봉일		: ${cinemaDetail.cPlaydate} <br>

		<a href="cinemaDelete.do?cNum=${cinemaDetail.cNum}">이 영화 삭제</a>
		<a href="cinemaUpdateFormView.do?cNum=${cinemaDetail.cNum}">이 영화 수정</a>
</body>
</html>