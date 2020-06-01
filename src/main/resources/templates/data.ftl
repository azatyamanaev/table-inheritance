<!doctype html>
<html lang="en">
<head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <thead>
    <tr>first name</tr>
    <tr>last name</tr>
    <tr>age</tr>
    <tr>height</tr>
    <tr>weight</tr>
    </thead>
    <tbody>
    <#list humans as human>
        <td>${human.firstName}</td>
        <td>${human.lastName}</td>
        <td>${human.age}</td>
        <td>${human.height}</td>
        <td>${human.weight}</td>
    </#list>
    </tbody>
</table>
<br>

</body>
</html>