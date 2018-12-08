
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
					<h2>SuperVisor Detail</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-12">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">SuperVisor Information</div>
						<div class="panel-body">


							<form role="form" action="saveSuperVisor.html" method="post">

								<div class="row">
									<div class="col-md-10">


										<div class="col-md-6">
											<div class="form-group">
												<label> SuperVisor Name</label> <input type="hidden"
													class="form-control" name="id" id="id" /> <input
													class="form-control" name="superVisor_name" id="superVisor_name" required />
											</div>

										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label>SuperVisor UserName</label> <input class="form-control"
													name="superVisor_userName" id="superVisor_userName" required />
											</div>
										</div>

								</div>
							</div>
								
                                <br>
								<div class="row">
									<div class="col-md-10">

										<div class="col-md-6">
											<div class="form-group">
												<label>SuperVisor Password</label>
												<textarea rows="" cols="50" class="form-control"
													name="superVisor_passWord" id="superVisor_passWord" required></textarea>
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
					<div class="panel-heading">All SuperVisor</div>
					<div class="panel-body">
						<div class="row">

							<div class="col-md-12">

								<table id="allUserInfo" align="center" class="table table-hover"
									border="1px solid black">

									<thead style="background-color: #e0240f; color: white">
										<tr>
											<th>Company Id</th>
									        <th>Company Name</th>
									        <th>Company City</th>
									        <th>Company Location</th>

										</tr>
									</thead>

									<tbody>

										<c:forEach items="${SuperVisorList}" var="list">

											<tr>
												<td>${list.superVisor_Id}</td>
												<td>${list.superVisor_name}</td>
												<td>${list.superVisor_userName}</td>
												<td>${list.superVisor_passWord}</td>

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