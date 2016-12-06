<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 정보 입력 ;)</title>
</head>
<body>

	<!-- <table width="500" cellpadding="0" cellspacing="0" border="1"> -->
	<table>
		<form action="cinemaWrite.do" method="post">
			<tr>
				<td>나라(숫자))</td>
				<td><input type="text" name="couNum" size="50"></td>
			</tr>
			<tr>
				<td>영화 제목</td>
				<td><input type="text" name="cTitle" size="50"></td>
			</tr>
			<tr>
				<td>러닝타임</td>
				<td><input type="text" name="cRunningtime" size="50"></td>
			</tr>
			<tr>
				<td>줄거리</td>
				<td><textarea name="cSummary" rows="10"></textarea></td>
			</tr>
			<tr>
				<td>리뷰 수</td>
				<td>디폴트</td>
			</tr>
			<tr>
				<td>시청연령제한(숫자)</td>
				<td><input type="text" name="cAge" size="50"></td>
			</tr>
			<tr>
				<td>원본파일명</td>
				<td><input type="text" name="cOriginalFileName" size="50"></td>
			</tr>
			<tr>
				<td>저장파일명</td>
				<td>생략</td>
			</tr>
			<tr>
				<td>개봉일(숫자 6자리)</td>
				<td><input type="text" name="cPlaydate" size="50"></td>
			</tr>
		<tr>
			<td colspan="2"><input type="submit" value="입력">
				&nbsp;&nbsp; <a href="cinemaList.do">목록보기</a></td>
		</tr>
		</form>
	</table>
</body>
</html>