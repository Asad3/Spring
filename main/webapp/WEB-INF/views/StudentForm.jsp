<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Form</title>
</head>
<body>			
		
			<div class="modal-body" id="main-body">
				<form action="submit.html" method="post">
  					<div>
    						<label>Email address:</label>
    						<input class="form-control" id="email" name="name">
  					</div>
  					<div >
    						<label for="pwd">Password:</label>
    						<input id="pwd" name="password">
  					</div>
  					<div >
    						<label>Mobile Number : </label>
    						<input type="text" name="mobile">
  					</div>
  					<div >
    						<label>DOB : </label>
    						<input type="text" name="dob">
  					</div>
  					<div >
    						<label>Student's Skill Set : </label>
    						<select name="skills" multiple>
    							<option>Java Core</option>
    							<option>Spring Core</option>
    							<option>Spring MVC</option>
    							<option>Hibernate</option>
    							<option>Jax-RS</option>
    						</select>
  					</div>
  					<div>
  						Country : <input type="text" name="address.country">
  						City : <input type="text" name="address.city">
  						Town : <input type="text" name="address.town">
  						Street No : <input type="text" name="address.streetNo">
  						House No : <input type="text" name="address.houseNo">
  					</div> 
					<input type="submit" value="Submit"/>
				</form>
			</div>			
		
		

</body>
</html>