<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-
1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/boo
tstrap.min.css">
<title>Products</title>
</head>
<body>
	<div class="pull-right" style="padding-right: 50px">
		<a href="?language=en">English</a>|<a href="?language=nl">Dutch</a>
	</div>
	<a href="<c:url value="/logout" />">Logout</a>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="newProduct" class="form-horizontal">
			<fieldset>
				<legend>Add new product</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message
							code="addProduct.form.productId.label1" /></label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitPrice">name</label>
					<div class="col-lg-10">
						<form:input id="name" type="text" path="name"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows="2" />
					</div>
				</div>

				<div class="form-group">
					<label for="manufacturer" class="control-label col-lg-2 col-lg-2">Manufacturer</label>
					<div class="col-lg-10">
						<form:input id="manufacturer" path="manufacturer" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label for="category" class="control-label col-lg-2 col-lg-2">Category</label>
					<div class="col-lg-10">
						<form:input id="category" path="category" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label for="unitsInStock" class="control-label col-lg-2 col-lg-2">Units
						In Stock</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">Condition</label>
					<div class="col-lg-10">
						<form:radiobutton path="condition" value="New" />
						New
						<form:radiobutton path="condition" value="Old" />
						Old
						<form:radiobutton path="condition" value="Refurbished" />
						Refurbished
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>