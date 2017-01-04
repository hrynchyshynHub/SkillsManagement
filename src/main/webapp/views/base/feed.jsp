<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
    <link rel="stylesheet" href="/css/feed.css">
</head>

<c:forEach var="news" items="${newses}">
    <div class = "news">
    <a href="${news.href}"><h2>${news.title}</h2></a><br>
    <img src="${news.pathToImage}">
    ${news.date}<br>
    ${news.description}<br>
    </div>
    <div class="clearfix"></div>
</c:forEach>

