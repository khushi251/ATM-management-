package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f4f4f4;\n");
      out.write("    background-image: url('atm2.jpg');\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .container {\n");
      out.write("    max-width: 400px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .container h2 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .form-group {\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  label {\n");
      out.write("    display: block;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input[type=\"text\"],\n");
      out.write("  input[type=\"number\"],\n");
      out.write("  input[type=\"tel\"] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    font-size: 14px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    background-color: #007BFF;\n");
      out.write("    color: #fff;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>ATM Management System Registration Form</h2>\n");
      out.write("  <form method=\"post\" action=\"registration2.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"accNum\">Account Number:</label>\n");
      out.write("      <input type=\"number\" id=\"accNum\" name=\"accNum\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"fname\">First Name:</label>\n");
      out.write("      <input type=\"text\" id=\"fname\" name=\"fname\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"lname\">Last Name:</label>\n");
      out.write("      <input type=\"text\" id=\"lname\" name=\"lname\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"dob\">Date of Birth:</label>\n");
      out.write("      <input type=\"date\" id=\"dob\" name=\"dob\" placeholder=\"DD/MM/YYYY\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"address\">Address:</label>\n");
      out.write("      <input type=\"text\" id=\"address\" name=\"address\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pin\">PIN:</label>\n");
      out.write("      <input type=\"password\" id=\"pin\" name=\"pin\"  required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"education\">Education:</label>\n");
      out.write("      <input type=\"text\" id=\"education\" name=\"education\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"occupation\">Occupation:</label>\n");
      out.write("      <input type=\"text\" id=\"occupation\" name=\"occupation\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"phone\">Phone Number:</label>\n");
      out.write("      <input type=\"tel\" id=\"phone\" name=\"phone\" required>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
