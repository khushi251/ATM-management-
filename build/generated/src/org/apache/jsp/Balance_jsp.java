package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Atm;
import dao.AtmDao;

public final class Balance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


  if(session.isNew())
      response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>ATM Management System - Balance</title>\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("  }\n");
      out.write("  .balance-container {\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("  h1 {\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("  .account-info {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("  .back-button {\n");
      out.write("    background-color: #007bff;\n");
      out.write("    color: #fff;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("  }\n");
      out.write("  .back-button:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"balance-container\">\n");
      out.write("  <h1>ATM Management System</h1>\n");
      out.write("  <div class=\"account-info\">\n");
      out.write("      ");
 int s;
     Atm a=new Atm();
      s=Integer.parseInt(session.getAttribute("userid").toString());
      AtmDao ad=new AtmDao();
      a=ad.searchByUser(s);
      
      out.write("\n");
      out.write("      <p>Account Number: <span id=\"accountNumber\" >");
      out.print(s );
      out.write("  </span></p>\n");
      out.write("    <p>Available Balance: <span id=\"balance\">");
      out.print(a.getBalance() );
      out.write("</span></p>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"back-button\" onclick=\"goBack()\">Back</button>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("  function goBack() {\n");
      out.write("    window.location.href=\"FrontPage.jsp\";\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
