<%-- 
    Document   : input
    Created on : May 30, 2017, 12:29:58 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>API TEST FORM</title>
    </head>
    <body>
        <h1>API TEST FORM</h1>
        <form action="calculation" method="POST">
            AVAILABLE NITROZEN <input type="text" name="stn" id="stn" placeholder="available ni"/> <br />
            AVAILABLE PHOSPHORASH <input type="text" name="stp" id="stp" placeholder="available ni"/><br />
            AVAILABLE POTASSIUM <input type="text" name="stk" id="stk" placeholder="available ni"/><br />
            AVAILABLE SALPHUR <input type="text" name="sts" id="sts" placeholder="available ni"/><br />
            AVAILABLE ZINK <input type="text" name="stzn" id="stzn" placeholder="available ni"/><br />
            AVAILABLE BORON <input type="text" name="stb" id="stb" placeholder="available ni"/><br />
            AVAILABLE CROP ID <input type="text" name="cropid" id="cropid" placeholder="available ni"/><br />
            <input type="submit" id="btnSubmit" value="CALCULATE" /><br />
            
            
        </form>
    </body>
</html>
