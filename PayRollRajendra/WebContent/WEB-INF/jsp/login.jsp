<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="loginForm" style="margin-top: 100px; margin-bottom: 100px;">

	<div id="page-wrapper">
	
	<marquee style="color: blue;">Please login for access the software</marquee>
	
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Admin Login</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-3"></div>

				<div class="col-md-5">
					<!-- Form Elements -->
					<div class="panel panel-default">
					
					 <h5 style="color: red;">${errorMsg}</h5>
					
						<div class="panel-heading">Login Form</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-md-12">

									<form role="form" action="adminLogin.html" method="post">
													
										<div class="form-group">
										<label class="block clearfix" align="center"> Choose
													User For Login </label>
													 <label class="block clearfix" align="center"> 
													<select name=authority>
														<option value=" ">Select Authority</option>
														<option value="admin">Admin</option>
														<option value="site_manager">Site Manager</option>
														<option value="supervisor">Supervisor</option>
														<option value="employee">Employee</option>
														</select>
														</label>
														
											<h3>User Name</h3>
											<input class="form-control" name="username" required />
										</div>

										<div class="form-group">
											<h3>Password</h3>
											<input type="password" class="form-control" name="password" required />
										</div>

										<br>
										<button type="submit" class="btn btn-success">Login</button>
										&emsp;
										<button type="reset" class="btn btn-info">Clear</button>

									</form>


								</div>
							</div>
							<!-- /. ROW  -->

						</div>

					</div>

				</div>

				<div class="col-md-3"></div>

			</div>


		</div>
		<!-- /. PAGE INNER CLASS END -->

	</div>
	<!-- /. PAGE WRAPPER CLASS END -->
	
	</div>
	
</body>
</html>