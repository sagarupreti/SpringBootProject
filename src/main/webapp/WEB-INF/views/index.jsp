<%-- 
    Document   : index
    Created on : Jan 18, 2019, 11:26:09 AM
    Author     : ideapad-520S
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="/webjars/bootstrap/3.3.7-1/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link href="/css/styless.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
                <h1>Hello ${name}!</h1>
                <ul>
                    <c:forEach var="std" items="${students}">
                     <li>${std.fullName}</li>
                     </c:forEach>
                </ul>
        </div>
    </body>
</html>
 