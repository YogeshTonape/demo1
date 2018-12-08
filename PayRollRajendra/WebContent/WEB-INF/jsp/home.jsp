
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
		<div id="page-inner" style="text-align: center;">
			<div class="row">
				<div class="col-md-12">
				
		<marquee style="color: green;">Welcome To PayRollPage </marquee>		
				
					<h2>TechPayRoll</h2>
					<!-- <h5>Welcome Jhon Deo , Love to see you back. </h5> -->

				</div>
			</div>
			<!-- /. ROW  -->
			<hr />


<!-- ************************************************************* -->

          <%--  raj
			<div class="row" style="font-size: 18px">

				<div class="col-md-6">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Total Bike Stock</div>
						<div class="panel-body" style="font-size: 45px">

                     <%=
                     
                     session.getAttribute("totalBikeStock")
                     
                     %>

					</div>
						
						<a href="viewAllPurchaseBikes.html">Details</a>

					</div>

				</div>
				
				<!-- ********************* -->
				
				<div class="col-md-6">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Total Bike Sale</div>
						<div class="panel-body" style="font-size: 45px">

                     <%=
                     
                     session.getAttribute("totalBikeSale")
                     
                     %>
			
						</div>
						
						<a href="viewAllSoldBikes.html">Details</a>

					</div>

				</div>
					

			</div>

<!-- ************************************************************* -->

<div class="row" style="font-size: 18px">


				<div class="col-md-6">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Total Spare Part Stock</div>
						<div class="panel-body" style="font-size: 45px">

                     <%=
                     
                     session.getAttribute("totalSparePartStock")
                     
                     %>
 		
						</div>
						
						<a href="viewAllPurchaseSpareParts.html">Details</a>

					</div>

				</div>
				
				<!-- ********************* -->
				
				<div class="col-md-6">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Total Spare Part Sale</div>
						<div class="panel-body" style="font-size: 45px">

                     <%=
                     
                     session.getAttribute("totalSaleSparePart")
                     
                     %>

					</div>
						
						  <a href="viewAllSoldSpareParts.html">Details</a>  

					</div>

				</div>
				
				
			</div>
			
			
    <!-- ************************************************************* -->	
    
    <!-- ************************************************************* -->

<div class="row" style="font-size: 18px">

<div class="col-md-3"></div>

				<div class="col-md-6">
					<!-- Form Elements -->
					<div class="panel panel-default">
						<div class="panel-heading">Total Customers</div>
						<div class="panel-body" style="font-size: 45px">

                       <%=
                     
                    		   session.getAttribute("totalCustomers")
                     
                     %>
                   
				
						</div>
						
						<a href="allCustomers.html">Details</a>

					</div>

				</div>
							
		<div class="col-md-3"></div> raj
 --%>		
    <!-- ************************************************************* -->			

		</div>
		<!-- jumbotron class end -->


	</div>
	<!-- /. PAGE INNER CLASS END -->

	</div>
	<!-- /. PAGE WRAPPER CLASS END -->



	<script type="text/javascript">
		var table = document.getElementById('allUserInfo');

		for (var i = 1; i < table.rows.length; i++) {
			
			table.rows[i].onclick = function() {
			
				document.getElementById("id").value = this.cells[0].innerHTML;
				document.getElementById("dealerName").value = this.cells[1].innerHTML;
				document.getElementById("dealerContact").value = this.cells[2].innerHTML;
				document.getElementById("dealerDetails").value = this.cells[3].innerHTML;

				document.getElementById('submit').style.display = "none";
				document.getElementById('update').style.display = "block";
			};
		}

		function backOption() {
			document.getElementById('submit').style.display = "block";
			document.getElementById('update').style.display = "none";
		}
	</script>



</body>
</html>

