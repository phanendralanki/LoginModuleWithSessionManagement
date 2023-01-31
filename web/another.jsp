
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Another page</title>
    </head>
    <body>
        
        
        <% 
            
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
            
            response.setHeader("Pragma","no-cache"); //HTTP 1.0
            
            response.setHeader("Expires","0"); //Proxies
            
            if(session.getAttribute("uname") == null){
            response.sendRedirect("login.jsp");
            }
        %>
        
        
        <h3 style="text-align: center">Another page that opens only if you are logged in ${uname}</h3>
        
    </body>
</html>
