<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <g:layoutHead/>
    <g:javascript library="application"/>
</head>

<body>
<div id="content-wrapper">
    <div id="sidebar">
        <li><g:link name="showPersonList" id="person">Person</g:link></li>
    </div>

    <div id="main-content"><g:layoutBody/></div>
</div>
</body>
</html>