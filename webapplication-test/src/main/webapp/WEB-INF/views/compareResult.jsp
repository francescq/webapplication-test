<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
    <head>
        <title>Result</title>
    </head>
    
    <style type="text/css">
    .even {background-color:pink;}
    .odd {background-color: yellow;}
    </style>
    <body>
    q<%= request.getAttribute("output") %>q
        <h1><c:out value="${x}">x defecte</c:out> <c:out value="${output}"></c:out></h1>
        
        ${output}
        ---
        <table>
        <c:forEach begin="1" end="10" step="1" var="c">
            <c:choose>
                <c:when test = "${c%2 == 0}">
                    <tr class="even">
                        <td><c:out value="${output}" /></td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <tr class="odd">
                        <td><c:out value="${output}" /></td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        </table>
    </body>
</html>
