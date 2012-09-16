<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
    q<%= request.getAttribute("output") %>q '<c:out value="${output}" />'
        

<h2>Welcome to Court Reservation System</h2>
Today is <!-- fmt:formatDate value="${today}" pattern="yyyy-MM-dd" /-->.<c:out value="${today}" />
</body>
</html>
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
