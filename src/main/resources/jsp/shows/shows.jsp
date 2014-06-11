<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <c:forEach items="${shows.shows}" var="show">
        <div>
            <h1>${show.name}</h1>
            <p>Seasons: ${show.numberOfSeasons}</p>
        </div>
    </c:forEach>
</body>
</html>