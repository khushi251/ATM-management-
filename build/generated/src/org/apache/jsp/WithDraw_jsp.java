package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.AtmDao;
import model.Atm;

public final class WithDraw_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>ATM Management System - Withdraw</title>\n");
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
      out.write("  .withdraw-container {\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("  h1 {\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("  .balance-info {\n");
      out.write("    margin-bottom: 20px;\n");
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
      out.write("<div class=\"withdraw-container\">\n");
      out.write("  <h1>ATM Management System</h1>\n");
      out.write("  <div class=\"balance-info\">\n");
      out.write("      ");

          int t;
            int accno=Integer.parseInt(session.getAttribute("userid").toString());
          Atm a=new Atm();
          AtmDao ad =new AtmDao();
         a=ad.searchByUser(accno);
          t =a.getBalance();
          
      
      out.write("\n");
      out.write("      <p>Netbalance: ");
      out.print( t );
      out.write("</p>\n");
      out.write("  </div>\n");
      out.write("  <form id=\"withdrawForm\">\n");
      out.write("    <label for=\"amount\" style=\"display: block; margin-bottom: 10px;\">Amount to Withdraw:</label>\n");
      out.write("    <input type=\"number\" name=\"amount\" id=\"amount\" class=\"amount-input\" placeholder=\"Enter amount\">\n");
      out.write("      <input type=\"submit\" value=\"submit\"> \n");
      out.write("  </form>\n");
      out.write("  <div class=\"action-buttons\">\n");
      out.write("    <button onclick=\"goBack()\">Back</button>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("   ");

    String min_amt=null;
    min_amt=request.getParameter("amount");
    int amt;
    if(min_amt!=null){
        amt=Integer.parseInt(min_amt);
      
       // Atm a =new Atm();
        accno= Integer.parseInt(session.getAttribute("userid").toString());
       // AtmDao ad= new AtmDao();
       
        int bal;
        bal=a.getBalance();
    int total= bal-amt;
    if(ad.updateBalance(accno, total)){
        out.println("Amount WithDraw Successfully");
    }else{
         out.println("Amount WithDraw Failed");
    }
    }

      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("  function withdrawAmount() {\n");
      out.write("    const amount = document.getElementById(\"amount\").value;\n");
      out.write("    // Process the withdrawal logic here\n");
      out.write("    // You can add your logic to update the balance or perform other actions\n");
      out.write("    alert(\"Amount withdrawn: $\" + amount);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("   function goBack() {\n");
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
