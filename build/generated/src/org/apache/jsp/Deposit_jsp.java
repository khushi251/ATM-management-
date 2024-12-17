package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Atm;
import dao.AtmDao;

public final class Deposit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

  if(session.isNew())
      response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>ATM Management System - Deposit</title>\n");
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
      out.write("    background-image: url('atm2.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("  }\n");
      out.write("  .deposit-container {\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("  h1 {\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("  .amount-input {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("  .action-buttons {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("  }\n");
      out.write("  .action-buttons button {\n");
      out.write("    background-color: #007bff;\n");
      out.write("    color: #fff;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("  }\n");
      out.write("  .action-buttons button:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"deposit-container\">\n");
      out.write("  <h1>ATM Management System</h1>\n");
      out.write("  <form id=\"depositForm\" action=\"Deposit.jsp\" method=\"post\">\n");
      out.write("    <label for=\"amount\" style=\"display: block; margin-bottom: 10px;\">Amount to Deposit:</label>\n");
      out.write("    <input type=\"number\" id=\"amount\" class=\"amount-input\" name=\"amount\" placeholder=\"Enter amount\">\n");
      out.write("       <input type=\"submit\" value=\"Deposit\">\n");
      out.write("  </form>\n");
      out.write("    <div class=\"action-buttons\">\n");
      out.write("    <button onclick=\"goBack()\">Back</button>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  ");

    String addamt=null;
    addamt=request.getParameter("amount");
    int amt;
    if(addamt!=null){
        amt=Integer.parseInt(addamt);
        int accno;
        Atm a =new Atm();
        accno= Integer.parseInt(session.getAttribute("userid").toString());
        AtmDao ad= new AtmDao();
        a=ad.searchByUser(accno);
        int bal;
        bal=a.getBalance();
    int total= bal+amt;
    if(ad.updateBalance(accno, total)){
        out.println("Amount deposited Successfully");
    }else{
         out.println("Amount deposited Failed");
    }
    }

      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("  function depositAmount() {\n");
      out.write("    const amount = document.getElementById(\"amount\").value;\n");
      out.write("    // Process the deposit logic here\n");
      out.write("    // You can add your logic to update the balance or perform other actions\n");
      out.write("    alert(\"Amount deposited: $\" + amount);\n");
      out.write("  }\n");
      out.write("  function menu(){\n");
      out.write("          window.location.href = \"FrontPage.jsp\";\n");
      out.write("  }\n");
      out.write("  function goBack() {\n");
      out.write("     window.location.href = \"FrontPage.jsp\";\n");
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
