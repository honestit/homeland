<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodawanie plików</title>
</head>
<body>
<form method="post" enctype="multipart/form-data">
    <label>Dodaj plik:
        <input type="file" name="file"
               accept="application/pdf,image/*"/>
    </label>
    <label>Nazwa do zapisania:
        <input type="text" name="fileName"/>
    </label>
    <button type="submit">Dodaj</button>
</form>
</body>
</html>
