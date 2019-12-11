<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PremiumCalculator" method="post"> 

Vehicle Type:  <input type="text" placeholder="Enter Vehicle Type" name="vehicletype" required="required" value="${vehicle.vehicleType}"><br><br>
Manufacturer:  <input type="text" placeholder="Enter Manufacturer" name="manufacturer" required="required" value="${vehicle.manufacturer}"><br><br>
Vehicle model:  <input type="text" placeholder="Enter Vehicle model" name="model" required="required" value="${vehicle.vehicleModel}"><br><br>
Engine CC:  <input type="text" placeholder="Enter Engine CC" name="engineCC" required="required" value="${vehicle.engineCC}"><br><br>
Fuel Type:  <input type="text" placeholder="Enter Fuel Type" name="fueltype" required="required" value="${vehicle.fuelType}"><br><br>
Passing Year:  <input type="text" placeholder="Enter Passing Year" name="passingyear" required="required" value="${vehicle.passingYear}"><br><br>
Vehicle Cost:  <input type="text" placeholder="Enter Vehicle Cost" name="cost" required="required" value="${vehicle.vehicleCost}"><br><br>
Chassis Number:  <input type="text" placeholder="Enter Chassis Number" name="chassisnumber" required="required" value="${vehicle.chassisNo}"><br><br>
Vehicle Colour:  <input type="text" placeholder="Enter Vehicle Colour" name="colour" required="required" value="${vehicle.vehicleColour}"><br><br>
City:  <input type="text" placeholder="Enter City" name="city" required="required" value="${vehicle.customer.city}"><br><br>
 <button type="submit">Calculate</button><br><br> 

</form>

</body>
</html>