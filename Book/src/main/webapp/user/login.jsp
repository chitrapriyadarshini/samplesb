<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@ include file="../../layout/header.jsp"%>
	<div class="container-fluid">

		<div class="row">
			<div class="col-md-4">

				<div class="portlet-title">
					<div class="page-header">
						<h3>Login</h3>
					</div>
				</div>
				<div class="portlet-body">
					<form action="../log/login" method="POST">
						<div class="form-group">
							<label for="userName">UserName :</label> <input type="text"
								class="form-control" name="userName" placeholder="Enter Username"
								autofocus="autofocus" required="required" id="userName" />`	
 
						</div>

						<div class="form-group">
							<label for="password">Password :</label> <input type="password"
								class="form-control" name="password"
								placeholder="Enter Password" required="required" id="password" />
						</div>
						<div class="form-group">
							<button type="submit" name="add" class="btn btn-success"
								id="addLoginBtn">SIGN IN</button>

							<a href="log/register" class='btn btn-primary'>SIGN UP</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>