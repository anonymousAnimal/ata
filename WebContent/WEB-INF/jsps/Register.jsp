<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<f:form action="register" commandName="profileBean">
<table align="center">
<tr><td>First Name<f:input type="text" path="firstName"></f:input></td></tr>
<tr><td>Last Name<f:input type="text" path="lastName"></f:input></td></tr>
<tr><td>Date of Birth<f:input type="date" path="dateOfBirth" ></f:input></td></tr>
<tr><td>Street<f:input type="text" path="street"></f:input></td></tr>
<tr><td><f:radiobutton path="gender" value="M" />Male</td></tr> 
<tr><td><f:radiobutton path="gender" value="F" />Female</td></tr>
<tr><td>Location<f:input type="text" path="location"></f:input></td></tr>
<tr><td>City<f:input type="text" path="city"></f:input></td></tr>
<tr><td>State<f:input type="text" path="state"></f:input></td></tr>
<tr><td>Pincode<f:input type="text" path="pincode"></f:input></td></tr>
<tr><td>Mobile no<f:input type="text" path="mobileNo"></f:input></td></tr>
<tr><td>Email<f:input type="text" path="emailID"></f:input></td></tr>
<tr><td>Password <f:password type="password" path="password"></f:password></td></tr>
<tr><td><input type="submit" value="Signup" ></td></tr>
<tr><td><a href="Login">Already a user?Login here</a></td></tr>

</table>
</f:form>
</body>
</html>