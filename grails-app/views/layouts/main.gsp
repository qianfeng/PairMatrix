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
        <li><g:link controller="person" action="show" name="showPersonList">show person</g:link></li>
        </br></br>
        <li><g:link controller="person" action="create" name="createPerson">create person</g:link></li>
        </br></br>
        <li><g:link controller="pairmatrix" action="create" name="createPairMatrix">create pair matrix</g:link></li>
    </div>

    <div id="main-content"><g:layoutBody/></div>
</div>
</body>
</html>