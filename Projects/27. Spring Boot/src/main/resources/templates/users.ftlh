<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователи</title>
</head>
<body>
<h1>Добавление пользователя</h1>
<form method="post" action="/users">
    <label>Имя:
        <input name="firstName" placeholder="Имя">
    </label>
    <label>Фамилия:
        <input name="lastName" placeholder="Фамилия">
    </label>
    <input type="submit" value="Добавить">
</form>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Возраст</th>
        <th>Действия</th>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.age}</td>
            <td>
                <form method="post" action="/users/${user.id}/delete">
                    <input type="submit" value="Удалить">
                </form>
                <a href="/users/${user.id}">Перейти</a>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>