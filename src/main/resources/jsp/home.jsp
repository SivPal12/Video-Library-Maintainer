<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<title>${model.title}</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<script src="./js/bootstrap.min.js"></script>
</head>
<body>
    <!--Navbar start-->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">${model.brand}</a>
            </div>

            <ul class="nav navbar-nav">
                <c:forEach items="${model.menuItems}" var="item">
                    <li ${item.active}><a href="${item.link}">${item.name}</a></li>
                </c:forEach>
            </ul>
        </div>
        <!-- /.container-fluid -->
    </nav>
    <!--Navbar end-->

    <!--Tumbnails start-->
    <div class="container-fluid">
        <div class="row">
            <c:forEach items="${model.mediaItems}" var="item">
                <div class="col-xs-6 col-sm-4 col-md-2">
                    <a href="${item.link}" class="thumbnail"> <img src="${item.image}">
                        <div class="caption">
                            <h3>${item.title}</h3>
                            <p>${item.description}</p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <!--Tumbnails end-->


</body>