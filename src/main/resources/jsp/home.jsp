<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
<title>VLM</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<script src="./js/bootstrap.min.js"></script>
</head>
<body>
	<!--Navbar start-->
	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Home</a>
			</div>

			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Movies</a></li>
				<li><a href="#">TV Shows</a></li>
			</ul>
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!--Navbar end-->

	<!--Tumbnails start-->
	<div class="container-fluid">
		<div class="row">
		<c:forEach var="i" begin="1" end="50">
			<div class="col-xs-6 col-sm-4 col-md-2">
				<a href="#4" class="thumbnail"> <img
					src="http://static.rogerebert.com/uploads/movie/movie_poster/kill-bill-volume-1-2003/large_9O50TVszkz0dcP5g6Ej33UhR7vw.jpg">
					<div class="caption">
						<h3>Kill Bill</h3>
						<p>The Bride wakens from a four-year coma. The child she
							carried in her womb is gone. Now she must wreak vengeance on the
							team of assassins who betrayed her - a team she was once part of.
						</p>
					</div>
				</a>
			</div>
		</c:forEach>
		</div>
	</div>
	<!--Tumbnails end-->


</body>