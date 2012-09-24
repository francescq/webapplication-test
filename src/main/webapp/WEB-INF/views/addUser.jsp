<%@ page language="java" contentType="text/html; charset=UTF-8"
	%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<style type="text/css">
.even {
	background-color: silver;
}
</style>
<title>Registration Page</title>
</head>
<body>

	<form:form action="addUser" method="POST" commandName="user">
	   <form:errors path="*" cssClass="errorblock" element="div" />
        
<table>
	<tr>
		<td>User Name :</td>
		<td><form:input path="name" /></td>
		<td><form:errors path="name" cssClass="error" /></td>
	</tr>
	<tr>
		<td>Password :</td>
		<td><form:password path="password" /></td>
		<td><form:errors path="password" cssClass="error" /></td>
	</tr>
	<tr>
		<td>Gender :</td>
		<td>
		   <form:radiobutton path="gender" value="M" label="M" />
		   <form:radiobutton path="gender" value="F" label="F" /></td>
		<td><form:errors path="gender" cssClass="error" /></td>  
	</tr>
	<tr>
		<td>Country :</td>
		<td><form:select path="country">
			<form:option value="" label="Select" />
			<form:option value="1" label="India" />
			<form:option value="2" label="USA" />
			<form:option value="3" label="UK" />
		</form:select></td>
		<td><form:errors path="country" cssClass="error" /></td>
	</tr>
	<tr>
		<td>About you :</td>
		<td><form:textarea path="aboutYou" /></td>
		<td><form:errors path="aboutYou" cssClass="error" /></td>
	</tr>
	<tr>
	<td>Community :</td>
	<td>
	   <form:checkbox path="community" value="Spring" label="Spring" />
	   <form:checkbox path="community" value="Hibernate" label="Hibernate" />
	   <form:checkbox path="community" value="Struts" label="Struts" /></td>
	<td>
	   <form:errors path="community" cssClass="error" /></td>
	</tr>
	<tr>
	   <td colspan="3"><form:checkbox path="mailingList" label="Would you like to join our mailinglist?" /></td>
	</tr>
	<tr>
	   <td colspan="3"><input type="submit" value="Register" ></td>
	</tr>
</table>

</form:form>
<form:form action="addUser" method="POST" commandName="userForm">
    
'<%= request.getAttribute("userList") %>'
	1<c:out value="${userList}" />
	2<c:out value="${userList.size}" />
	
	3<c:out value="${userForm.userList.length}" />
	4<c:out value="${userForm.userList}" />
    5<c:out value="${userForm.userList.size}" />
    
    6<c:out value="${userList.length}" />
    7<c:out value="${user.userList}" />
	8<c:out value="${user.userList.size}" />
	9<c:out value="${user.userList.length}" />
	
     	<table cellpadding="5">
			<tr class="even">
				<th>Name</th>
				<th>Gender</th>
				<th>Country</th>
				<th>About You</th>
			</tr>
			<c:forEach items="${userForm.userList}" var="user" varStatus="status">
				<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
					<td>${user.name}</td>
					<td>${user.gender}</td>
					<td>${user.country}</td>
					<td>${user.aboutYou}</td>
				</tr>
			</c:forEach>
		</table>
     </form:form>
</body>
</html>