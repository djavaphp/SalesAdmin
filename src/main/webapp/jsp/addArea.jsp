<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Area Master</title>
</head>
<body>
<form method="post" action="createarea.html" modelAttribute="areaForm">
	<table>
	<tr>
		<td>Area Code :</td>
		<td><input type="text" id="areaCode" name="areaCode"/></td> 
	</tr>
	<tr>
		<td>Area Name :</td>
		<td><input type="text" id="areaName" name="areaName"/></td>
	</tr>	
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Area"/>
		</td>
	</tr>
</table>	
</form:form>

</body>
</html>