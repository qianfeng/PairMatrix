<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>ShowPersonPage</title>
    <meta name="layout" content="main">
</head>

<body>

<table id="person-list">
    <thead>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td></td>
    </tr>
    </thead>
    <tbody>
    <g:each in="${personList}" var="person">
        <tr>
            <td><%=person.personId%></td>
            <td><%=person.name%></td>
            <td>
                <g:link action="delete" id="${person.personId}">delete</g:link>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>