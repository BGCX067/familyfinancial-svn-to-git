<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Date"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META HTTP-EQUIV="Expires" CONTENT="0"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Item</title>
</head>
<body>
	<div>
		 <s:form action="store" >
			<fieldset>
				<legend>Create InOutItem</legend> 
				<s:textfield name="item.names" label="Name" />
				<s:textfield name="item.value" label="Value" />
				<s:submit /> <a href="#">cancel</a>
			</fieldset>
		</s:form>
	</div>
</body>
</html>