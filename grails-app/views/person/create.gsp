<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>create person</title>
    <meta name="layout" content="main">
</head>

<body>
<form controller="person" action="save" method="POST" id="user-create-form">
    <label>User Id:</label></br>
    <g:textField name="userId" id="user-id" maxlength="300"/></br>
    <label>User Name:</label></br>
    <g:textField name="userName" id="user-name" maxlength="100"/>

    <div class="form-submit-area">
        <button id="user-save">Save</button>
        <button id="user-cancel">Cancel</button>
    </div>

</form>

</body>
</html>