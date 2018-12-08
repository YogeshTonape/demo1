<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- /. NAV TOP  -->
	<div class="navbar" style="margin-top: -11px; margin-left: -1px;">

		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/img/find_user.png"
						class="user-image img-responsive" /></li>
						
					<!-- ***************** Admin Home ******************* -->

					<li><a href="#">Home Admin<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							 <li><a href="home.html"><i class=""></i>Home</a></li>
							<!-- <li><a href="addBikeServices.html"><i class=""></i>Change
									Password</a></li> -->
							<li><a href="changePassword.html"><i class=""></i>Change Password</a></li>
							
							<li><a href="login.html"><i class=""></i>Login</a></li>
						</ul></li>

					<!-- *************************************** -->

					<!-- <li><a href="addManufacture.html"><i class=""></i>Company
							Make </a></li>

					<li><a href="addFinanceCompany.html"><i class=""></i>Add
							Finance Company</a></li>

					<li><a href="AddDealer.html"><i class=""></i> Add Dealer </a></li>

					<li><a href="addModel.html"><i class=""></i>Add New Model
					</a></li>

					<li><a href="addModel.html"><i class=""></i>Add New Model
					</a></li>

					<li><a href="addPurchase.html"><i class=""></i>Purchase</a></li>

					<li><a href="sale.html"><i class=""></i> Sale </a></li>

					<li><a class="" href="addBikeServices.html"><i class=""></i>Add
							Bike Srvices</a></li>

					<li><a href="allCustomers.html"><i class=""></i> All
							Customers </a></li>

					<li><a href="currentServices.html"><i class=""></i>
							Current Month Services </a></li>
 -->

					<!-- ***************** Current Date Activity  ******************* -->

					<!-- <li><a href="#">Current Date Activity<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="addBikeServices.html"><i class=""></i>Current
									Date Bike Purchase</a></li>
							<li><a href="addBikeServices.html"><i class=""></i>Current
									Date Bike Sale</a></li>
							<li><a href="addBikeServices.html"><i class=""></i>Current
									Date Spare Part Purchase</a></li>
							<li><a href="addBikeServices.html"><i class=""></i>Current
									Date Spare Part Sale</a></li>
							<li><a href="addBikeServices.html"><i class=""></i>Current
									Date Bike Services</a></li>
						</ul></li> -->

					<!-- *************************************** -->


					<!-- ***************** Add New Masters******************* -->

					<li><a href="#">  Masters<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
						
							<li><a href="managerInfo.html"><i class=""></i>Add
									Manager Master </a></li>
									
						    <li><a href="companyInfo.html"><i class=""></i>
									Company</a></li>
							
							
							<li><a href="superVisorInfo.html"><i class=""></i>
									SuperVisor</a></li>
							
							
						    <li><a href="ledgerInfo.html"><i class=""></i>
									Ledger</a></li>
									
									
						
						    </ul>
						    <ul></ul>
							<li><a href="addEnquiry.html"> Enquiry<span class="fa arrow"></span></a></li>
						
						
						   <li><a href="addEmployee.html"> Employee<span class="fa arrow"></span></a></li>
						 </ul>
						 
					    
					 
					     
				         
					    
					 
						
						
							
					    <!--  raj
							<li><a href="addEnquiry.html"><i class=""></i>Add Enquiry
							</a></li>
							<li><a href="addModel.html"><i class=""></i>Add New
									Model</a></li>

							<li><a href="addVender.html"><i class=""></i>Add Vender</a></li>

                            <li><a href="addSparePartList.html"><i class=""></i>Add Spare Part List</a></li> -->

			<!-- 			</ul></li> 

					***************************************

					***************** Purchase Bike*******************

					<li><a href="#"> Purchase Bike<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="addPurchase.html"><i class=""></i>New Bike
									Purchase</a></li>
							<li><a href="viewAllPurchaseBikes.html"><i class=""></i>View
									All Bike Stock</a></li>

						</ul></li>

					***************************************

					***************** Purchase Bike Spare Part *******************

					<li><a href="#"> Purchase Bike Spare Part<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="addBikeSpareParts.html"><i class=""></i>Bike
									Spare Part Purchase</a></li>
							<li><a href="viewAllPurchaseSpareParts.html"><i class=""></i>View
									All Spare Part Stock</a></li>

						</ul></li>

					***************************************

					***************** Sale Bike *******************

					<li><a href="#">Sale Bike<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="sale.html"><i class=""></i>Bike Sale</a></li>
							<li><a href="viewAllSoldBikeList.html"><i class=""></i>View
									All Sold Bikes </a></li>

						</ul></li>

					***************************************

					***************** Bike Service *******************

					<li><a href="#">Bike Services<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="addBikeServices.html"><i class=""></i>Bike
									New Service</a></li>
							<li><a href="viewAllCustomerServices.html"><i class=""></i>View
									All Customer Services </a></li>
							<li><a href="viewCurrentMonthServices.html"><i class=""></i>View Current
									Month Customer Services </a></li>
						</ul></li>

					***************************************

					***************** All Customers *******************

					<li><a href="#"> Customers<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="allCustomers.html"><i class=""></i>View All
									Customers</a></li>
						</ul></li>

					***************************************

					***************** Customers Payment *******************

					<li><a href="#"> Payment<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="bikePayments.html"><i class=""></i>Bike
									Payments</a></li>
							<li><a href="bikeServicingPayments.html"><i class=""></i>Bike Servicing
									Payments</a></li>
						</ul></li>

					***************************************

					***************** All Reports *******************

					<li><a href="#"> Reports<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#"><i class=""></i>Purchase Report<span
									class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="bikePurchaseReport.html">Bike Purchase
											Report</a></li>
								 <li><a href="sparePartPurchaseReport.html">Spare Part
											Purchase Report</a></li> 
								</ul></li>
							<li><a href="saleReport.html"><i class=""></i>Sale
									Report<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href=bikeSaleReport.html>Bike Sale Report</a></li>
									 <li><a href="sparePartSaleReport.html">Spare Part Sale Report</a></li> 
								</ul></li>
								
								<li><a href="saleReport.html"><i class=""></i>Pending Amount Report<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="bikePendingAmount.html">Bike Pending Amount Report</a></li>
									<li><a href="#">Spare Part Pending Amount Report</a></li>
								</ul></li>

							<li><a href="purchaseReport.html"><i class=""></i>Customer
									Report<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="#">Customer Bike Servicing Report</a></li>
									<li><a href="#">Customer Payment Report</a></li>
								</ul></li>


						</ul></li>
						
						
						***************** Create Quotation *******************

					<li><a href="#">Create Quotation<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							 <li><a href="createBikeQuotation.html"><i class=""></i>Create Bike Quotation</a></li>
							 <li><a href="viewAllBikeQuotation.html"><i class=""></i>View All Bike Quotation's</a></li>
						</ul></li>

					***************************************

					<li><a href="#"><i class=""></i></a></li>

					***************************************

					<li><a href="test.html"><i class="">Test</i></a></li>


					***************************************


					***************************************

					<li><a href="#"><i class="fa fa-sitemap fa-3x"></i>
							Multi-Level Dropdown<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Second Level Link</a></li>
							<li><a href="#">Second Level Link</a></li>
							<li><a href="#">Second Level Link<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="#">Third Level Link</a></li>
									<li><a href="#">Third Level Link</a></li>
									<li><a href="#">Third Level Link</a></li>

								</ul></li>
						</ul></li>

					***************************************
					


				</ul>

			</div>raj -->

		</nav>

	</div>


</body>
</html>