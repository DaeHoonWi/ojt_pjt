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
${dto.cNum} <br>
${dto.couNum} <br>
${dto.cTitle} <br>
${dto.cRunningtime} <br>
${dto.cSummary} <br>

${dto.cCount} <br>
${dto.cAge} <br>
${dto.cOriginalFileName} <br>
${dto.cStoredFileName} <br>
${dto.cPlaydate} <br>


</c:forEach>
<h5>hahaha</h5>


<h3> <a href="cinemaWriteVeiw.do">영화 추가</a> </h3><br> 

</body>
</html>