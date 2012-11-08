<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Zadanie 2</title>
</head>
<body>

	<form action="pokaz.jsp">

		Name:<input type="text" name="name" /><br /> 
		Login:<input type="text" name="login" /><br /> 
		Do you want to get newsletter? <br />
		<input type='radio' name='letter' value='yes'>Yes<br /> 
		<input type='radio' name='letter' value='no'>No<br />

		<p>
			What are you interested in? <br /> <select name='interests' multiple>
				<option value='cars'>Cars</option>
				<option value='shopping'>Shopping</option>
				<option value='cosmetics'>Cosmetics</option>
				<option value='sport'>Sport</option>
			</select>
		</p>

		<p>
			How did you find us? <br /> 
			<input type='checkbox' name='zrodlo' value='internet'>In the internet<br /> 	
			<input type='checkbox' name='zrodlo' value='news'>In the newspaper<br />
			<input type='checkbox' name='zrodlo' value='friends'>By friends<br /> 
			<input type='checkbox' name='zrodlo' value='random'>Random<br />
		</p>

		<input type="submit" value=" OK ">

	</form>




</body>
</html>