
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Title here</title>
</head>



<!-- PAGE LEVEL PLUGIN STYLES  for datepicker-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/autoCompleter.js"></script>
<link href="${pageContext.request.contextPath}/css/themes/base/jquery.ui.all.css" rel="stylesheet" type="text/css">
<%-- <script type="text/javascript">
$(document).ready(function(){     
	
	$('#advanceAmount').blur(function(){
		var pendingAmount = $('#pendingAmount').val();
		var advamt = $('#advanceAmount').val();
		var pendingamt = pendingAmount - advamt;
		$('#pendingAmount').val(pendingamt.toFixed(2));
		
	});
	 $('#paidAmtDate').datetimepicker({
			
		});
	
}); --%>
</script>
</head>
<body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/autoCompleter.js"></script>
<link
	href="${pageContext.request.contextPath}/css/themes/base/jquery.ui.all.css"
	rel="stylesheet" type="text/css">

<script>
	function clickAlert() {
		alert("Save Successfully !!!");
	}
</script>
<script>
	function clickAlertUpdate() {
		alert("Update Successfully !!!");
	}
	
	
</script>

<style type="text/css">
button {
	color: blue;
	width: 150px;
	height: 40px;
}
</style>
<style type="text/css">

/* Extra styles for the cancel button */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.container {
	padding: 16px;
}

/* span.psw {
    float: right;
    padding-top: 16px;
} */

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}
}

/* * Change styles for span and cancel button on extra small screens 
@media screen {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
} */
</style>

<script type="text/javascript">
	var showData = function($this) {
	  alert("Inside show data function !!!");
		

		$("#update").show();
        $("#save").hide();
		$("#id").val($($this).find("td").eq(0).text());
		$("#empName").val($($this).find("td").eq(1).text());
		$("#contactNo").val($($this).find("td").eq(2).text());
		$("#address").val($($this).find("td").eq(3).text());
		$("#emailId").val($($this).find("td").eq(4).text());
		$("#AdharCardNo").val($($this).find("td").eq(5).text());
		$("#PanCardNo").val($($this).find("td").eq(6).text());
		$("#Photocopy").val($($this).find("td").eq(7).text());
		$("#birthDate").val($($this).find("td").eq(8).text());
		$("#city").val($($this).find("td").eq(9).text());
		$("#state").val($($this).find("td").eq(10).text());
		$("#qualification").val($($this).find("td").eq(11).text());
		$("#userType").val($($this).find("td").eq(12).text());
		$("#Role").val($($this).find("td").eq(13).text());
		
   }
   
</script>



<body>

	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<h2>Employee  Detail</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


			<div class="row">

				<div class="col-md-12">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Employee Information</div>
						<div class="panel-body">


							<form role="form" action="saveEmployeeraj.html" method="post">

								<div class="row">
									<div class="col-md-10">
                               
                                 <div class="col-md-6">
								   <div class="form-group">
									   <label>Employee Name</label> <input type="text"
									    class="form-control" name="emp_Id1" id="id" /> 
									    <!-- class="form-control" name="id" id="id" /> -->
									  
									    <input class="form-control" name="empName" id="empName" required />
									
										  </div>
                                    </div>
                   
                        <div class="col-md-6">
						 <div class="form-group">
						  <label>Contact No</label>
						   <input class="form-control" name="contactNo" id="contactNo" required />
									  </div>
								 </div>
								 
						 <div class="col-md-6">
						 <div class="form-group">
						  <label>Address</label>
						   <input class="form-control" name="address" id="address" required />
									  </div>
								 </div>
								
								 
					    <div class="col-md-6">
						 <div class="form-group">
						  <label>Email Id</label>
						   <input class="form-control" name="emailId" id="emailId" required />
            						  </div>
								 </div>
						 
								 
						<!--   <div class="col-md-6">
						   <div class="form-group">
						    <label>SuperVisor Id</label>
						    <input class="form-control" name="superVisorid" id="superVisorid" required />
									  </div>
								 </div>
						
						 <div class="col-md-6">
						 <div class="form-group">
						  <label>Company Id</label>
						   <input class="form-control" name="companyId" id="companyId" required />
							       </div>
								  </div> -->
						
						 <div class="col-md-6">
						 <div class="form-group">
						  <label>AdharCardNo</label>
						   <input class="form-control" name="AdharCardNo" id="AdharCardNo" required />
									  </div>
								 </div>
						
					    <div class="col-md-6">
						  <div class="form-group">
						   <label>PanCardNo</label>
						    <input class="form-control" name="PanCardNo" id="PanCardNo" required />
									  </div>
								 </div> 
							 
					     <div class="col-md-6">
						 <div class="form-group">
						  <label>Photocopy</label>
						   <input class="form-control" name="Photocopy" id="Photocopy" required />
									  </div>
								 </div> 
							 
				      <div class="col-md-6">
						 <div class="form-group">
						  <label>Birth Date</label>
						   <input type="date" class="form-control" name="birthDate" id="birthDate" required />
									  </div>
								 </div>
							 
				       <div class="col-md-6">
						 <div class="form-group">
						  <label>City</label>
						   <input class="form-control" name="city" id="city" required />
									  </div>
								 </div>
							 
						
						<div class="col-md-6">
						 <div class="form-group">
							 <label>State</label>
							  <input class="form-control" name="state" id="state" required />
							   </div>
							 </div>
                  
                        <div class="col-md-6">
				         <div class="form-group">
				           <label> Qualification</label>
					         <input class="form-control" name="qualification" id="qualification" required />
						      </div>
						       </div>

			            <div class="col-md-6">
					    <div class="form-group">
					    <label>User Type</label> 
					    <input class="form-control" name="userType" id="userType" required />
								 </div>
							 </div>
                       </div>
				 </div>
						 		
                         <br>
						    <div class="row">
									<div class="col-md-10"> 
                                               
                                          <div class="col-md-6">
											<div class="form-group">
												<label>Role</label>
												<textarea rows="" cols="50" class="form-control"
												 name="Role" id="Role" required></textarea>
											</div>
										</div>

									</div>
								</div>

								<br>
								
								   <div class="row">
									<div class="col-md-6">

										<div class="col-md-2">
										
											<input type="submit" id="save" class="btn btn-success"
												value="Save" name="Save">  
												 </div>
												<br>
												<div class="col-md-2">
										    <input type="submit"id="update" class="btn btn-success"
											   value="Update" name="Update">  
  								   </div>
                                      <br>
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
					<div class="panel-heading">All Employee</div>
					<div class="panel-body">
						<div class="row">

							<div class="col-md-12">

								<table id="allUserInfo" align="center" class="table table-hover"
									border="1px solid black">

									<thead style="background-color: #e0240f; color: white">
										<tr>
    										<th>Employee Id</th> 
										    <th>Employee Name</th>
									        <th>Contact No</th>
									        <th>Address</th>
                                            <th>Email Id</th>
                                           <!-- <th>SuperVisor Id</th>
                                            <th>Company Id</th> -->
                                            <th>AdharCardNo</th>
                                            <th>PanCardNo</th>
                                            <th>Photocopy</th> 
                                            <th>Birth Date</th>
                                            <th>City</th>
                                            <th>State</th>
                                            <th>Qualification</th>
                                            <th>User Type</th>
                                            <th>Role</th>
                                            
                                            
										</tr>
									</thead>

									<tbody>

										<c:forEach items="${EmployeeList}" var="list">
											<tr onclick="showData(this);">

											<!-- <tr>  -->
												<%-- <td>${list.empId}</td> --%>
												 <td>${list.emp_Id}</td> 
												<td>${list.empName}</td>
												<td>${list.contactNo}</td>
												<td>${list.address}</td>
												<td>${list.emailId}</td>
												<%-- <td>${list.superVisorid}</td>
												<td>${list.companyId}</td> --%>
												<td>${list.AdharCardNo}</td>
												<td>${list.PanCardNo}</td>
											    <td>${list.Photocopy}</td> 
												<td>${list.birthDate}</td>
												<td>${list.city}</td>
												<td>${list.state}</td>
												<td>${list.qualification}</td>
												<td>${list.userType}</td>
												<td>${list.Role}</td>
												
												

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
       
       
        <!-- /. PAGE WRAPPER CLASS END -->



</body>
</html>