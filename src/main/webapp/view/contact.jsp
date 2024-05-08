<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body>
<center>
<h1>User Contact Table Record</h1>
		<a href="">Back To Home</a> <br> <br>

		<form action="save" method="post">

			Firstname <input type="text" name="Firstname"> 
			Lastname <input type="text" name="Lastname"> 
			Email <input type="text" name="Email"> 
			Country <input type="text" name="Country"> 
			 Message<input type="text" name="Message"> 
			<br>
			<br>
			<input type="submit" value="save">

			<button type="button" formaction="update">Update</button>
			<button type="button" formaction="delete">Delete</button>

			<input type="reset" value="reset">

		</form>
		<br>
	</center>

	<table>
		<tr>
			<th>Firstname</th>
			<th> Lastname</th>
			<th>Country</th>
			<th>Email</th>
			<th>Message</th>
		</tr>
</table>
</body>
</html>