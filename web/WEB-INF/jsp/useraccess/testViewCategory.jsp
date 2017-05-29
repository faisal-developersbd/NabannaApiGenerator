<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
    <head>
        <title>my view</title>
        <link href="<c:url value="/resources/CSS/table.css" />" rel="stylesheet">
    </head>
    <body>
        <h1>First Text Here</h1>
        <table>
            <tr><th>user name</th><th>password</th><<th>Edit</th><th>Delete</th></tr>  
            <c:forEach var="tbl_category" items="${list}"> 
                
                <tr>
                
                    <td>${userInformation.category_id}</td>
                    <td>${userInformation.category_name}</td>
                    <td><a href="#">Edit</a></td>
                    <td><a href="#">Delete</a></td>
                </tr>
            </c:forEach>  
        </table>
    </body>
</html>