<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"></c:set>
<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.app.mylabels"/>
</head>
<body>
<a href="index.jsp?theLocale=en_US">English(US)</a> |
<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a> |
<a href="index.jsp?theLocale=de_DE">German(DE)</a> |
<a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a> |
<a href="index.jsp?theLocale=hi_IN">Hindi(IN)</a> |

<hr width="2px">
<fmt:message key="label.greeting"></fmt:message>
<br><br>
<fmt:message key="label.firstname"></fmt:message><i> Girish</i>
<br><br>
<fmt:message key="label.lastname"></fmt:message><i> Rane</i>
<br><br>
<fmt:message key="label.welcome"></fmt:message>
<br><br>

<hr width="2px">
Selected Locale: ${theLocale}
</body>
</html>