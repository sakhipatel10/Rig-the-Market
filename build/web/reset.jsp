<%-- 
    Document   : reset
    Created on : Mar 6, 2016, 1:54:50 PM
    Author     : Rohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MailServlet">
           Enter your id: <input type="text" name="mail"/>
           <input type="submit" value="Send"/> 
        </form>
        <%
            if(request.getAttribute("msg1")!=null)
            {
                String message=request.getAttribute("msg1").toString();
            
        %>
        <%=message%>    
        <%}%>
    </body>

</html>
