<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>

<body>
<s:form action="verify">
<s:textfield name="uname" label="Enter UserName"/><br>
<s:password name="password" label="Enter Password"/><br>
<s:submit align="center" value="Login"/>
</s:form>
</body>
</html>