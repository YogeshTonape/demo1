
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
					<h2>Company  Detail</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-12">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Company Information</div>
						<div class="panel-body">


							<form role="form" action="saveCompany.html" method="post">

								<div class="row">
									<div class="col-md-10">


										<div class="col-md-6">
											<div class="form-group">
												<label> Company Name</label> <input type="hidden"
													class="form-control" name="id" id="id" /> <input
													class="form-control" name="companyName" id="companyName" required />
											</div>

										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label>location</label> <input class="form-control"
													name="location" id="location" required />
											</div>
										</div>

								</div>
							</div>
								
                                <br>
								<div class="row">
									<div class="col-md-10">

										<div class="col-md-6">
											<div class="form-group">
												<label>city</label>
												<textarea rows="" cols="50" class="form-control"
													name="city" id="city" required></textarea>
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
					<div class="panel-heading">All Company</div>
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

										<c:forEach items="${CompanyList}" var="list">

											<tr>
												<td>${list.companyId}</td>
												<td>${list.companyName}</td>
												<td>${list.location}</td>
												<td>${list.city}</td>

												<%-- <td><a href="deleteCompany.html?companyId=${list.id}">Delete</a></td> --%>

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