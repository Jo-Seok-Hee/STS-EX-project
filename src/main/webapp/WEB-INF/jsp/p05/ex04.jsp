<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>함수 라이브랄리</title>
</head>
<body>
	
	<c:set var="string1" value="No pain, No gain."></c:set>
	
	<%-- 문자열 길이 확인 length --%>
	${fn:length(string1) } <br>
	${fn:length(string1) } <br>
	
	<%-- 특정 문자여 존재확인  --%>
	
	${fn:contains(string1,"No") }
	${fn:contains(string1,"no") }  <br>
	
	<%--대, 소문자 구분없이  --%>
	
	${fn:containsIgnoreCase(string1,"no") }    <br>
	
	<c:if test="${fn:containsIgnoreCase(string1,'no') }">
		문장에 NO가 존재합니다
	</c:if>
	
	<h1> ㅇㅇ</h1>
	
	<%-- 특정 문자열로 시작하느냐? --%>
	NO로 시작하는가 : ${fn:startsWith(string1,"N") }<br>
	gain.으로 끝나는가 : ${fn:endsWith(string1,"gain.") }
	
	<%-- 문자열 치환 --%>
	<br>
	<c:set var="string2" value="I love chicken"></c:set>
	${string2 }
	<br>
	<%-- 대체해서 출력까지 --%>
	${fn:replace(string2,"chicken","hamberger") }
	
	<%-- 문자열 쪼개버리기 --%>
	${fn:split(string2," ")[2] }
	
	<%-- 문자열 자르기 --%>
	
	${fn:substring(string2,2,6) } <br>
	
	<%-- 대소문자 변경 --%>
	
	${fn:toUpperCase(string2) }<br>
	${fn:toLowerCase(string2) }<br>
	<c:set var="string3" value="             hello world               "></c:set>
	${string3 }<br>
	<pre>${string3 }</pre>
	
	
	
</body>
</html>