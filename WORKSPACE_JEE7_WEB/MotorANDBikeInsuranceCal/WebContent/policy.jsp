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
<table border="2">
<tr>
<td>Policy Number</td>
<td>Policy Type</td>
<td>Policy start Date</td>
<td>Policy End Date</td>
<td>Sum Insured</td>
<td>Premium Amount</td>
<td>Vehicle Number</td>
<td>Vehicle Type</td>
<td>manufacturer</td>
<td>Vehicle Model</td>
<td>Engine CC</td>
<td>Vehicle Fuel Type</td>
<td>Vehicle Passing Year</td>
<td>Vehicle Colour</td>

<td>
</tr>
<c:forEach items="${ policyList}" var="policy">
<tr>
<td>${ policy.policyNo}</td>
<td>${ policy.policyType}</td>
<td>${ policy.policyStartDate}</td>
<td>${ policy.policyEndDate}</td>
<td>${ policy.sumInsured}</td>
<td>${ policy.premiumAmount}</td>
<td>${ policy.vehicle.vehicleNumber}</td>
<td>${ policy.vehicle.vehicleType}</td>
<td>${ policy.vehicle.manufacturer}</td>
<td>${ policy.vehicle.vehicleModel}</td>
<td>${ policy.vehicle.engineCC}</td>
<td>${ policy.vehicle.fuelType}</td>
<td>${ policy.vehicle.passingYear}</td>
<td>${ policy.vehicle.vehicleColour}</td>

</tr>
</c:forEach>
</table>
</body>
</body>
</html>