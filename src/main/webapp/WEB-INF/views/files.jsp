<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Moja galeria</title>
</head>
<body>

<c:forEach items="${files}" var="file">
    <p>
        <img title="${file.fileName}" src="/files/${file.id}" width="250" height="160"/>
    </p>
</c:forEach>


</body>
</html>
