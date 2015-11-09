<%-- 
    Document   : index
    Created on : 09.11.2015, 12:26:54
    Author     : kataev2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="POST">
            <table>
                <tr>
                    <td>
                        <input name="AR_KEY" value="${article.AR_KEY}" type="hidden" />
                        Ключ
                    </td>
                    <td>
                        ${article.AR_KEY}
                    </td>
                </tr>
                <tr>
                    <td>
                        Имя статьи
                    </td>
                    <td>
                        <input name="AR_NAME" value="${article.AR_NAME}" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Сортировка
                    </td>
                    <td>
                        <input name="AR_ORDERBY" value="${article.AR_ORDERBY}" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Удалить
                    </td>
                    <td>
                        <input type="checkbox" name="AR_HIDE" value="${article.AR_HIDE}" >
                    </td>
                </tr>
             </table>
                    <input type="submit" value="Сохранить" />
        </form>
    </body>
</html>
