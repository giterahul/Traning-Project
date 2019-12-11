<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<style>
#invoice {
	padding: 30px;
}

.invoice {
	position: relative;
	background-color: #FFF;
	min-height: 680px;
	padding: 15px
}

.invoice header {
	padding: 10px 0;
	margin-bottom: 20px;
	border-bottom: 1px solid #3989c6
}

.invoice .company-details {
	text-align: right
}

.invoice .company-details .name {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .contacts {
	margin-bottom: 20px
}

.invoice .invoice-to {
	text-align: left
}

.invoice .invoice-to .to {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .invoice-details {
	text-align: right
}

.invoice .invoice-details .invoice-id {
	margin-top: 0;
	color: #3989c6
}

.invoice main {
	padding-bottom: 50px
}

.invoice main .thanks {
	margin-top: -100px;
	font-size: 2em;
	margin-bottom: 50px
}

.invoice main .notices {
	padding-left: 6px;
	border-left: 6px solid #3989c6
}

.invoice main .notices .notice {
	font-size: 1.2em
}

.invoice table {
	width: 100%;
	border-collapse: collapse;
	border-spacing: 0;
	margin-bottom: 20px
}

.invoice table td, .invoice table th {
	padding: 15px;
	background: #eee;
	border-bottom: 1px solid #fff
}

.invoice table th {
	white-space: nowrap;
	font-weight: 400;
	font-size: 16px
}

.invoice table td h3 {
	margin: 0;
	font-weight: 400;
	color: #3989c6;
	font-size: 1.2em
}

.invoice table .qty, .invoice table .total, .invoice table .unit {
	text-align: right;
	font-size: 1.2em
}

.invoice table .no {
	color: #fff;
	font-size: 1.6em;
	background: #3989c6
}

.invoice table .unit {
	background: #ddd
}

.invoice table .total {
	background: #3989c6;
	color: #fff
}

.invoice table tbody tr:last-child td {
	border: none
}

.invoice table tfoot td {
	background: 0 0;
	border-bottom: none;
	white-space: nowrap;
	text-align: right;
	padding: 10px 20px;
	font-size: 1.2em;
	border-top: 1px solid #aaa
}

.invoice table tfoot tr:first-child td {
	border-top: none
}

.invoice table tfoot tr:last-child td {
	color: #3989c6;
	font-size: 1.4em;
	border-top: 1px solid #3989c6
}

.invoice table tfoot tr td:first-child {
	border: none
}

.invoice footer {
	width: 100%;
	text-align: center;
	color: #777;
	border-top: 1px solid #aaa;
	padding: 8px 0
}

@media print {
	.invoice {
		font-size: 11px !important;
		overflow: hidden !important
	}
	.invoice footer {
		position: absolute;
		bottom: 10px;
		page-break-after: always
	}
	.invoice>div:last-child {
		page-break-before: always
	}
}
</style>
	<script type="text/javascript">
 $('#printInvoice').click(function(){
            Popup($('.invoice')[0].outerHTML);
            function Popup(data) 
            {
                window.print();
                return true;
            }
        });
 </script>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->
	<div id="site-content">
			<header class="site-header">
				
					
					</div> <!-- .container -->
				</div>
	<div id="invoice">

		<div class="toolbar hidden-print">
			
			
		</div>
		<div class="invoice overflow-auto">
			<div style="min-width: 600px">
				<header>
					<div class="row">
						<div class="col">
							<a target="_blank" href="Index.jsp"> <img
								src="dummy/invoicelogo.jpg" data-holder-rendered="true" />
							</a>
						</div>
						<div class="col company-details">
							<h2 class="name">
								<a target="_blank" href="Index.jsp"> Allianz Motor Insurance </a>


							</h2>

							
							
							<p>Allianz General Insurance is a private general insurance
								company in India. The company is a joint venture between Bajaj
								Finserv Limited owned by the Bajaj Group of India and Allianz
								SE, a German financial services company.</p>
						</div>
					</div>
				</header>
				<main>
				<div class="row contacts">

					<div class="col invoice-details">
						<!-- <h1 class="invoice-id">INVOICE 3-2-1</h1> -->
						
					</div>
				</div>
				<table border="0" cellspacing="0" cellpadding="0">

<h1 class="invoice-id">Thank You</h1>
 <div>Pune, EON Free Zone</div>
							<div>Kharadi, Pune</div>
							<div>Maharashtra 411014</div>
							<div>motorinsurance@outlook.com</div> 
							
					<!-- <div class="thanks">Thank you!</div> -->
					<div class="notices">
						<!--  <div>NOTICE:</div> -->
						<div class="notice">Please Insured Your Car with Us</div>
					</div>
					</main>
					
					</div>
					<!--DO NOT DELETE THIS div. IT is responsible for showing footer always at the bottom-->
					<div></div>
					</div>
					</div>
</body>
</html>