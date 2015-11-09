<%-- 
    Document   : index
    Created on : 09.11.2015, 11:28:06
    Author     : kataev2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1px">
            <c:forEach var="article" items="${articles}">
                <tr>
                    <td>Ключ</td>
                    <td>${article.AR_KEY}</td>
                    <td>Название</td>
                    <td>${article.AR_NAME}</td>
                    <td>Дата</td>
                    <td>${article.AR_CREATE_DATETIME}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
