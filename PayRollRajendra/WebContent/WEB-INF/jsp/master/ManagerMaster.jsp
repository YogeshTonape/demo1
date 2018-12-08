
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Manager Detail</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-12">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Manager Information</div>
						<div class="panel-body">


							<form role="form" action="saveManager.html" method="post">

								<div class="row">
									<div class="col-md-10">


										<div class="col-md-6">
											<div class="form-group">
												<label> Manager Name</label> <input type="hidden"
													class="form-control" name="id" id="id" /> <input
													class="form-control" name="Manager_name" id="Manager_name" required />
											</div>

										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label>Manager UserName</label> <input class="form-control"
													name="Manager_userName" id="Manager_userName" required />
											</div>
										</div>

								</div>
							</div>
								
                                <br>
								<div class="row">
									<div class="col-md-10">

										<div class="col-md-6">
											<div class="form-group">
												<label>Manager Password</label>
												<textarea rows="" cols="50" class="form-control"
													name="Manager_passWord" id="Manager_passWord" required></textarea>
											</div>
										</div>

									</div>
								</div>

								<br>
								
								   <div class="row">
									<div class="col-md-6">

										<div class="col-md-2">
											<input type="submit" id="submit" class="btn btn-success"
												value="Save" name="Save"> <input type="submit"
												style="display: none;" id="update" class="btn btn-success"
												value="Update" name="Update">
										</div>

										<div class="col-md-2">
											<input type="reset" id="Clear" class="btn btn-info"
												value="Clear" onclick="backOption()">
										</div>
									</div>
							   </div>
												
		                         </form>
					     	</div>
                     </div>
                </div>
          </div>

			<!-- **************************************************************** -->

				<div class="panel panel-default">
					<div class="panel-heading">All Manager</div>
					<div class="panel-body">
						<div class="row">

							<div class="col-md-12">

								<table id="allUserInfo" align="center" class="table table-hover"
									border="1px solid black">

									<thead style="background-color: #e0240f; color: white">
										<tr>
											<th>Manager Id</th>
									        <th>Manager Name</th>
									        <th>Manager UserName</th>
									        <th>Manager Password</th>

										</tr>
									</thead>

									<tbody>

										<c:forEach items="${ManagerList}" var="list">

											<tr>
												<td>${list.Manager_id}</td>
												<td>${list.Manager_name}</td>
												<td>${list.Manager_userName}</td>
												<td>${list.Manager_passWord}</td>

												<%-- <td><a href="deleteSuperVisor.html?supervisorId=${list.id}">Delete</a></td> --%>

												<!-- <td> <a href="delete.html?id=${list.id}">Delete</a> </td> -->
											</tr>

										</c:forEach>

									</tbody>

								</table>

							</div>

						</div>

					</div>
				</div>

			<!-- *************************************************************** -->

		</div>
		<!-- jumbotron class end -->
		
		</div>
       <!-- /. PAGE INNER CLASS END -->
       
       </div>
        <!-- /. PAGE WRAPPER CLASS END -->



</body>
</html>