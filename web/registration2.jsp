<%@page import="dao.AtmDao"%>
<%@include file="registration.jsp"%> 
<jsp:useBean class="model.Atm" id="N">
    <jsp:setProperty name="N" property="*"></jsp:setProperty>
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        
        <%
            AtmDao nd=new AtmDao();
            if(nd.insertData(N))
            {
                out.println("<font color=red size=4 font-size:100px> Successfully registered &#128540</font>");
                out.println("<br><br>");
                out.print("<a href=login.jsp>Click Here For Login</a>");
//                 msg="<font color=red size=4>Invalid user id or password<font>"; 
            }
            else
            {
                out.print("no");
            }
            %>
    </center>
    </body>
</html>