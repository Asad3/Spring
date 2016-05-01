<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Submitted</title>
</head>
<body>
	
	Name : <div>${student1.name}</div>
	Password : <div>${student1.password}</div>
	Mobile No : <div>${student1.mobile}</div>
	Date Of Birth : <div>${student1.dob }</div>
	Skills : <div>${student1.skills }</div>
	Country : <div>${student1.address.country}</div>
	City : <div>${student1.address.city }</div>
	Town : <div>${student1.address.town }</div>
	Street No : <div>${student1.address.streetNo }</div>
	House No : <div>${student1.address.houseNo }</div>
</body>
</html>