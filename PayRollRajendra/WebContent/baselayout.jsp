 <!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
<tiles:insertAttribute name="title" ignore="true" />
</title>
<head>

<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<!-- JQUERY SCRIPTS -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- METISMENU SCRIPTS -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="assets/js/custom.js"></script>

<!-- ********************************** -->

<!-- jQuery links for pagination table -->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

 <script type="text/javascript">
$(document).ready(function(){
	$('#allUserInfo').DataTable();
});

/* ------------------------------ */
 
$(document).ready(function(){
	$('#dataTable_2').DataTable({
		
		 "pageLength": 5
		 
	});
	$("#tblClaimSearch").find('tbody').empty(); //add this line
});
 
/* ------------------------------ */

$(document).ready(function(){
	$('#dataTable_3').DataTable({
		
		 "pageLength": 5
		 
	});
	$("#tblClaimSearch").find('tbody').empty(); //add this line
});

</script>

<style type="text/css">

   .table-hover tbody tr:hover td

    {
            background-color: #B2BEB5;       
    }



</style>

<!-- ***************** DataTable work Offline ******************* -->

 <link rel="stylesheet" type="text/css" href="assets/DataTables/datatables.min.css"/>
 
<script type="text/javascript" src="assets/DataTables/datatables.min.js"></script>

 <script type="text/javascript">
$(document).ready(function(){	
	$('#dataTable').DataTable({

 "pageLength": 10

});

});

</script>  

<style type="text/css">
.table_scrollbar {
	width: 100%;
	margin-bottom: 15px;
	margin-left: 4px;
	overflow-x: auto;
	overflow-y: hidden;
	-webkit-overflow-scrolling: touch;
	-ms-overflow-style: -ms-autohiding-scrollbar;
	border: 1px solid #DDD;
	overflow-x: auto;
}
</style>

   
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="mainContainer">
		<div style="width: 100%; margin: 0 0 -50px 0; float: left;">
			<tiles:insertAttribute name="header" />
		</div>
		<div style="width: 100%; margin: 10px 0px 0px 0px; float: left;">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="container" style="width: 100%; margin: 0; float: left;">
			<div class="errors" id="message" style="width: 400px; display: none;"></div>

			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<div
		style="position: fixed; bottom: 0px; width: 100%; background: silver;">
		<tiles:insertAttribute name="footer" />
	</div>


</body>
</html>
