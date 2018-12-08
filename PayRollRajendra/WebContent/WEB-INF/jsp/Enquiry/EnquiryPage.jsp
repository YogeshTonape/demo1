
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
					<h2>Enquiry  Detail</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-12">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Enquiry Information</div>
						<div class="panel-body">


							<form role="form" action="saveEnquiry.html" method="post">

								<div class="row">
									<div class="col-md-10">
                               
                                 <div class="col-md-6">
								   <div class="form-group">
									   <label>Enquiry Person Name</label> <input type="hidden"
									   class="form-control" name="id" id="id" />
									    <input class="form-control" name="enq_personName" id="enq_personName" required />
									
										  </div>
                                    </div>
                   
                        <div class="col-md-6">
						 <div class="form-group">
						  <label>Enquiry Person Mob</label>
						   <input class="form-control" name="enq_personMob" id="enq_personMob" required />
									  </div>
								 </div>
						
                      <div class="col-md-6">
						 <div class="form-group">
							 <label>Time</label>
							  <input class="form-control" name="time" id="time" required />
							   </div>
							 </div>
                  
                  <div class="col-md-6">
				   <div class="form-group">
				      <label> Date</label>
					   <input class="form-control" name="date" id="date" required />
						   </div>
						       </div>

			      <div class="col-md-6">
					<div class="form-group">
					 <label>Purpose</label> 
					 <input class="form-control" name="purpose" id="purpose" required />
								 </div>
							 </div>
                       </div>
				 </div>
						 		
                         <br>
						    <div class="row">
									<div class="col-md-10"> 
                                               
                                          <div class="col-md-6">
											<div class="form-group">
												<label>Enquiry By</label>
												<textarea rows="" cols="50" class="form-control"
												 name="enquiry_By" id="enquiry_By" required></textarea>
											</div>
										</div>

									</div>
								</div>

								<br>
								
								   <div class="row">
									<div class="col-md-6">

										<div class="col-md-2">
											<input type="submit" id="submit" class="btn btn-success"
												value="Save" name="Save"> 
												<!-- <input type="submit"
												 style="display: none;" id="update" class="btn btn-success"
												value="Update" name="Update">
  -->									   </div>

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
					<div class="panel-heading">All Enquiry</div>
					<div class="panel-body">
						<div class="row">

							<div class="col-md-12">

								<table id="allUserInfo" align="center" class="table table-hover"
									border="1px solid black">

									<thead style="background-color: #e0240f; color: white">
										<tr>
											<th> Enquiry Id</th>
									        <th>Enquiry Person Name</th>
									        <th>Enquiry Person Mob</th>
									        <th>Time</th>
                                            <th>Date</th>
                                            <th>Purpose</th>
                                            <th>Enquiry By</th>
										</tr>
									</thead>

									<tbody>

										<c:forEach items="${EnquiryList}" var="list">

											<tr>
												<td>${list.enq_Id}</td>
												<td>${list.enq_personName}</td>
												<td>${list.enq_personMob}</td>
												<td>${list.time}</td>
												<td>${list.date}</td>
												<td>${list.purpose}</td>
												<td>${list.enquiry_By}</td>

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