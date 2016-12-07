<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 정보 목록:)</title>
</head>
<body>

<c:forEach items="${cinemaList}" var="dto">

<h1>유효값!!</h1>

영화 번호	: ${dto.cNum} <br>
국가		: ${dto.couNum} <br>
제목		: ${dto.cTitle} <br>
러닝타임	: ${dto.cRunningtime} 분 <br>
줄거리		: ${dto.cSummary} <br>

리뷰수		: ${dto.cCount} 개<br>
시청연령제한: ${dto.cAge} 세 관람가<br>
원본파일명	: ${dto.cOriginalFileName} <br>
저장파일명	: ${dto.cStoredFileName} <br>
개봉일		: ${dto.cPlaydate} <br>

</c:forEach>

<h3> <a href="cinemaWriteVeiw.do">영화 추가</a> </h3><br> 

</body>
</html>