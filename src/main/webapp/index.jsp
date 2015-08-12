<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Shop Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link href="assets/css/heder.css" rel="stylesheet">
<link href="assets/css/content.css" rel="stylesheet">

<meta name="viewport" content="width=device-width">
<link rel="stylesheet" type="text/css" href="assets/css/amazonmenu.css">


<script src="assets/js/amazonmenu.js">
	
</script>


<script>
	jQuery(function() {
		amazonmenu.init({
			menuid : 'mysidebarmenu'
		})
	})
</script>


</head>
<body>
<div class="aranjare">
	<div class="header">
		<nav class="navbar navbar-default" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Home</a>
			</div>


			<div class="col-sm-3 col-md-3">
				<form class="navbar-form" role="search">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search"
							name="q">
						<div class="input-group-btn">
							<button class="btn btn-default" type="submit">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</div>
					</div>
				</form>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false"> <span
						class="glyphicon glyphicon-shopping-cart"></span>{{}}<span
						class="caret"></span></a>
					<ul class="dropdown-menu dropdown-cart" role="menu">
						<li class="divider"></li>
						<li><a class="text-center" href="#">View Cart</a></li>
					</ul></li>
			</ul>


			<form class="navbar-form navbar-right" role="search">
				<div class="form-group">
					<input type="text" class="form-control" name="username"
						placeholder="Username">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name="password"
						placeholder="Password">
				</div>
				<button type="submit" class="btn btn-default">Login</button>
			</form>
	</div>



	<nav id="mysidebarmenu" class="amazonmenu">
		<ul>
			<li><a href="#">Item 1</a></li>
			<li><a href="#">Folder 0</a>
				<div>
					<p>Browse our spring collection of useful webmaster tools and
						resources! Everything from JavaScript, CSS to PHP are covered!</p>

					<ul>
						<li><a href="#">Sub Item 0.1</a></li>
						<li><a href="#">Sub Item 0.2</a></li>
						<li><a href="#">Sub Item 0.3</a>
						<li><a href="#">Sub Item 0.4</a>
							<div>
								<p>
								<h3>
									<a href="#">Image Optimizer</a>
								</h3>
								Use this tool to easily optimize regular gifs, animated gifs,
								jpgs, and pngs, so they load as fast as possible.
								</p>

								<p>
								<h3>
									<a href="#">FavIcon Generator</a>
								</h3>
								Generate a favicon using any regular image with this tool.
								</p>

								<p>
								<h3>
									<a href="#">Animated Gif Generator</a>
								</h3>
								Animated Gif Generator lets you easily create an animated gif by
								uploading a series of still images!
								</p>

								<p>
								<h3>
									<a href="#">Gradient Image Maker</a>
								</h3>
								Gradient images are used everywhere in web page design, such as
								the background of form buttons, DIVs, to act as shadows etc.
								This tool lets you easily generate a gradient image.
								</p>

							</div>
						<li><a href="#">Sub Item 0.5</a></li>
					</ul>
				</div></li>
			<li><a href="#">Folder 1</a>
				<ul>
					<li><a href="#">Sub Item 1.1</a></li>
					<li><a href="#">Sub Item 1.2</a></li>
					<li><a href="#">Sub Item 1.3</a>
						<ul>
							<li>Sub Item 1.3.1</li>
							<li>Sub Item 1.3.2</li>
							<li>Sub Item 1.3.3</li>
						</ul></li>
					<li><a href="#">Sub Item 1.4</a>
					<ul>
							<li>Sub Item 1.3.1</li>
							<li>Sub Item 1.3.2</li>
							<li>Sub Item 1.3.3</li>
						</ul>
					</li>
					<li><a href="#">Sub Item 1.2</a></li>
					<li><a href="#">Sub Item 1.3</a></li>
					<li><a href="#">Sub Item 1.4</a></li>
				</ul></li>
			<li><a href="#">Item 3</a></li>
			<li><a href="#">Folder 2</a>
				<ul>
					<li><a href="#">Sub Item 2.1</a></li>
					<li><a href="#">Sub Item 2.1</a></li>
					<li><a href="#">Sub Item 2.1</a></li>
					<li><a href="#">Sub Item 2.1</a></li>
					<li><a href="#">Sub Item 2.1</a></li>
					<li><a href="#">Sub Item 2.1</a></li>
				</ul></li>
			<li><a href="#style/">Item 4</a></li>
		</ul>
	</nav>

</div>
</body>
</html>
