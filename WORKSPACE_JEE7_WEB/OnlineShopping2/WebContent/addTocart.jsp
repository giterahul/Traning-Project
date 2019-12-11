<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, TemplateMo.com</title>
<meta name="keywords"
	content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com" />
<meta name="description"
	content="Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script>

    function calculate(product_id) {
    	var qty=document.getElementById("quantity"+product_id).value;
    	console.log("quantity:"+qty);
    	
    	var price=document.getElementById("price"+product_id).value;
    	console.log("price:"+price);
    	
    	/* var result=parseFloat(price)*parseFloat(qty);
    	console.log(result); */
    	document.getElementById("total"+product_id).value=parseFloat(price)*parseFloat(qty);
  }
</script>
</head>
<body>

	<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_container">
		<div id="templatemo_menu">
			<ul>
				<li><a href="index.html">Home</a></li>
				<li><a href="#" class="current">Search</a></li>
				<li><a href="index.html">Books</a></li>
				<li><a href="index.html">New Releases</a></li>
				<li><a href="#">Company</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- end of menu -->

		<div id="templatemo_header">
			<div id="templatemo_special_offers">
				<p>
					<span>25%</span> discounts for purchase over $ 40
				</p>
				<a href="#" style="margin-left: 50px;">Read more...</a>
			</div>


			<div id="templatemo_new_books">
				<ul>
					<li>Suspen disse</li>
					<li>Maece nas metus</li>
					<li>In sed risus ac feli</li>
				</ul>
				<a href="#" style="margin-left: 50px;">Read more...</a>
			</div>
		</div>
		<!-- end of header -->

		<div id="templatemo_content">

			<div id="templatemo_content_left">
				<div class="templatemo_content_left_section">
					<h1>Categories</h1>
					<ul>
						<li><a href="index.html">Donec accumsan urna</a></li>
						<li><a href="index.html">Proin vulputate justo</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="#">Aliquam tristique dolor</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">Sed pellentesque placerat</a></li>
						<li><a href="#">Suspen disse</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
					</ul>
				</div>
				<div class="templatemo_content_left_section">
					<h1>Bestsellers</h1>
					<ul>
						<li><a href="#">Vestibulum ullamcorper</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="#">Praesent mattis varius</a></li>
						<li><a href="#">Maece nas metus</a></li>
						<li><a href="#">In sed risus ac feli</a></li>
						<li><a href="http://www.flashmo.com" target="_parent">Flash
								Templates</a></li>
						<li><a href="http://www.templatemo.com" target="_parent">CSS
								Templates</a></li>
						<li><a href="http://www.webdesignmo.com" target="_parent">Web
								Design</a></li>
						<li><a href="http://www.photovaco.com" target="_parent">Free
								Photos</a></li>
					</ul>
				</div>

				<div class="templatemo_content_left_section">
					<a href="http://validator.w3.org/check?uri=referer"><img
						style="border: 0; width: 88px; height: 31px"
						src="http://www.w3.org/Icons/valid-xhtml10"
						alt="Valid XHTML 1.0 Transitional" width="88" height="31"
						vspace="8" border="0" /></a> <a
						href="http://jigsaw.w3.org/css-validator/check/referer"><img
						style="border: 0; width: 88px; height: 31px"
						src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
						alt="Valid CSS!" vspace="8" border="0" /></a>
				</div>
			</div>
			<!-- end of content left -->

			<div id="templatemo_content_right">
				<table border=1>
					<tr>
						<th><u>Product Id</u></th>
						<th><u>Product Code</u></th>
						<th><u>Product Description</u></th>
						<th><u>Product Price</u></th>
						<th><u>Product munfDate</u></th>
						<th><u>Quantity</u></th>
						
						<th><u>Total</u></th>
						<th><u>Change</u></th>
					</tr>
					<c:forEach items="${productList}" var="product" varStatus="status">
						
						<input id="price${product.productId}" type="hidden"
							name="quantity${product.productId}" value="${product.price}" />
						<tr>
							<td><input type="hidden" id="productId" name="ProductId" value="${product.productId}"> </input>${product.productId}</td>
							<td>${product.productCode}</td>
							<td>${product.description}</td>
							<td><input type="hidden" id="price${product.productId}" name="price${product.productId}"  value="${product.price}"> </input>${product.price}</td>
							<td>${product.munfDate}</td>

							<td><input id="quantity${product.productId}" type="text"
								name="quantity${product.productId}" value="1"
								onblur="calculate(${product.productId});" /></td>

						<td><input id="total${product.productId}" type="text" name="total${product.productId}" value="${product.price}" onblur="calculate(${product.productId})"/></td>

					
							<td><a href="ProductController?action=deleteFromatCart&index=${status.index}">Remove</a></td>

						</tr>
					</c:forEach>
				</table>
				<%-- <c:forEach items="${productList}" varStatus="status" var="product">
            <h1>"${product.productCode}" <span>(by author name)</span></h1>
            <div class="image_panel"><img src="images/templatemo_image_02.jpg" alt="CSS Template" width="100" height="150" /></div>
          <h2>Read the lessons - Watch the videos - Do the exercises</h2>
            <ul>
         			<li>ProducrId-${product.productId }</li>
              		<li>ProductCode-${product.productCode}</li>
	          		<li>ProductDes-${product.description}</li>
	            	<li>ProductPrice-${product.price }</li>
	            	<li>ProductDate-${product.munfDate }</li>
	         	<li><input type="text" name="quantity${product.id}" value="1"/></li>
	          <a href="ProductController?action=deleteFromatCart&index=${status.index}">Remove</a>
            </ul>
            
             </c:forEach> 
             <div class="cleaner_with_height">&nbsp;</div>
            
            <a href="index.html"><img src="images/templatemo_ads.jpg" alt="css template ad" /></a>
          
      --%>
			</div>
			<!-- end of content right -->

			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<!-- end of content -->

		<div id="templatemo_footer">
			<a href="index.html">Home</a> | <a href="index.html">Search</a> | <a
				href="index.html">Books</a> | <a href="#">New Releases</a> | <a
				href="#">FAQs</a> | <a href="#">Contact Us</a><br /> Copyright ©
			2048 <a href="#"><strong>Your Company Name</strong></a> | <a
				href="http://www.iwebsitetemplate.com" target="_parent">Website
				Templates</a> by <a href="http://www.templatemo.com" target="_parent">Free
				CSS Templates</a>
		</div>
		<!-- end of footer -->
		<!--  Free CSS Template www.templatemo.com -->
	</div>
	<!-- end of container -->
	<div align=center>
		This template downloaded form <a
			href='http://all-free-download.com/free-website-templates/'>free
			website templates</a>
	</div>
</body>
</html>