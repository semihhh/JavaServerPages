package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kayitFormu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>Kayıt Formu</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1>Kayıt Formu</h1>\n");
      out.write("\n");
      out.write("<form method=\"POST\" action=\"kayitFormunuKontrolEt.jsp\">\n");
      out.write("\n");
      out.write("<table>\n");

    String errors=(String)request.getAttribute("errors");

    if(errors != null && errors.trim().length()>0){

        out.println("<tr><td colspan='2'>Hatanın Ayrıntıları <br>"+errors+"</td></tr>");

    }


      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td >Adı</td>\n");
      out.write("<td><input type=\"text\" name=\"loginName\" size=\"20\" value=\"");
      out.print(request.getParameter("loginName")!=null?request.getParameter("loginName"):"");
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td >Parola</td>\n");
      out.write("<td><input type=\"text\" name=\"password\" size=\"20\" value=\"");
      out.print(request.getParameter("password")!=null?request.getParameter("password"):"");
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" value=\"Gönder\" name=\"Gonder\">\n");
      out.write("    <input type=\"reset\" value=\"Temizle\" name=\"Temizle\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
