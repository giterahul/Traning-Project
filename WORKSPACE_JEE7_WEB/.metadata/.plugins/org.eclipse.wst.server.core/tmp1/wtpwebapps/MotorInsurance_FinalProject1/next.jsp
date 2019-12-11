<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">

<!-- Title Page-->
<title>Au Register Forms by Colorlib</title>

<!-- Icons font CSS-->
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Main CSS-->
<link href="css/main.css" rel="stylesheet" media="all">
</head>

<body>
	<div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
		<div class="wrapper wrapper--w780">
			<div class="card card-3">
				<div class="card-heading"></div>
				<div class="card-body">
					<h2 class="title">Get Premium</h2>
					<form action="PremiumController" method="post">
						<div class="input-group">
							Vehicle Type:<input class="input--style-3" type="text"
								placeholder="Enter Vehicle Type" name="vehicletype"
								required="required" value="${vehicle.vehicleType}">
						</div>
						<div class="input-group">
							Manufacturer:<input class="input--style-3" type="text"
								placeholder="Enter Manufacturer" name="manufacturer"
								required="required" value="${vehicle.manufacturer}"></i>
						</div>

						<div class="input-group">
							Vehicle model:<input class="input--style-3" placeholder="Enter Vehicle model"
								name="model" required="required" value="${vehicle.vehicleModel}">
						</div>
						<div class="input-group">
							Engine CC:<input class="input--style-3" type="text"
								placeholder="Enter Engine CC" name="engineCC"
								required="required" value="${vehicle.engineCC}">
						</div>
						<div class="input-group">
							Fuel Type:<input class="input--style-3" type="text"
								placeholder="Enter Fuel Type" name="fueltype"
								required="required" value="${vehicle.fuelType}">
						</div>
						<div class="input-group">
							Passing Year:<input class="input--style-3" type="text"
								placeholder="Enter Passing Year" name="passingyear"
								required="required" value="${vehicle.passingYear}">
						</div>
						<div class="input-group">
							Vehicle Cost:<input class="input--style-3" type="text"
								placeholder="Enter Vehicle Cost" name="cost" required="required"
								value="${vehicle.vehicleCost}">
						</div>
						<div class="input-group">
							<input class="input--style-3" type="text"
								placeholder="Enter Chassis Number" name="chassisnumber"
								required="required" value="${vehicle.chassisNo}">
						</div>
						<div class="input-group">
							Vehicle Colour:<input class="input--style-3" type="text"
								placeholder="Enter Vehicle Colour" name="colour"
								required="required" value="${vehicle.vehicleColour}">
						</div>
						<div class="input-group">
							City:<input class="input--style-3" type="text"
								 name="city" required="required"
								value="${vehicle.customer.city}">
						</div>
						<div class="p-t-10">
							<button class="btn btn--pill btn--green" type="submit">Calculate</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/datepicker/moment.min.js"></script>
	<script src="vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="js/global.js"></script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->