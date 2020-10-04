<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome to our great portal</title>
</head>
<body>
<h1>Welcome ${username}, my dear friend</h1>
<h2>How do you do today (${today})</h2>
<p>Your amazing order is coming to you! Look what did you order!</p>
<ul>
    <#list orders as order>
    <li>${order}</li>
    </#list>
</ul>

<h3>Are you happy?</h3>
</body>
</html>