<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="number" value="12345678"/>
	<h2>출력</h2>
	<fmt:formatNumber value="${number }"></fmt:formatNumber> <br>
	
	<fmt:formatNumber value="${number }" type="number" groupingUsed="false
	"></fmt:formatNumber>
	<%-- percent --%>
	<fmt:formatNumber value="1" type="percent">
	</fmt:formatNumber>
	
	<%-- 화폐 단위 --%>
	
	<fmt:formatNumber value="${number }" type="currency" currencySymbol="$"></fmt:formatNumber>
	
	<%-- 3.14 --%>
	
	<fmt:formatNumber value="31.4" pattern="0.0000"></fmt:formatNumber> <br>
	<fmt:formatNumber value="3.141592" pattern="#.####"></fmt:formatNumber>
	ㄴㄴㅁㄴㅇㅁㄴㅇ
	
	<h2>날짜</h2>
	
	<fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"></fmt:formatDate>
	<fmt:formatDate value="${date }" pattern="yyyy/MM/dd hh:mm:ss" var="dateString"></fmt:formatDate>
	<p>${date }</p>
	데이트 문자열 변수 : ${dateString }
	
	<%-- 문자열을 Date 객체로 변환 --%>
	
	<fmt:parseDate value="${dateString }" pattern="yyyy/MM/dd hh:mm:ss" var="Date"></fmt:parseDate>
	
	<br>
	<fmt:formatDate value="${Date }" pattern="yyyy년MM월dd일"></fmt:formatDate>
</body>
</html>