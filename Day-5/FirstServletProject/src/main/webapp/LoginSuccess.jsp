<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
</head>

<body>

<h2>
    Hi <%= request.getAttribute("user") %>, Login Successful!
</h2>

<a href="login.html">Login Page</a>

</body>
</html>