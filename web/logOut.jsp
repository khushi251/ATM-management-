
<%
   response.sendRedirect("login.jsp");
   session.invalidate();
   session=null;
%>