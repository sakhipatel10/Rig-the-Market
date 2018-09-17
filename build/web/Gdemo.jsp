<%-- 
    Document   : Gdemo
    Created on : Mar 29, 2016, 6:05:34 PM
    Author     : Rohan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.VSMShareDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <%
            ArrayList<VSMShareDetail> al;
            if(request.getAttribute("SYMBOL")!=null){
                al=(ArrayList<VSMShareDetail>)request.getAttribute("SYMBOL");
                
            
        %>
        
        <img src="http://chart.finance.yahoo.com/z?s=<%=al.get(0).getSymbol()%>&t=6m&q=l&l=on&z=l&p=m50,m200">
        <%}%>
        </div>
        
    </body>
</html>
