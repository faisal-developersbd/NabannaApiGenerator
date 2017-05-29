<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
    <head>
        <title>my view</title>
        <link href="<c:url value="/resources/CSS/table.css" />" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <h1>First Text Here</h1>
        <table>
            <tr><th>user name</th><th>password</th><<th>Edit</th><th>Delete</th></tr>  
            <c:forEach var="view_stObject" items="${list}"> 
                
                <tr>
                
                    <td>${view_stObject.limits}</td>
                    <td >${view_stObject.ls}</td>
                    <td><a href="#">Edit</a></td>
                    <td><a href="#">Delete</a></td>
                </tr>
            </c:forEach>  
        </table>
    </body>
</html>