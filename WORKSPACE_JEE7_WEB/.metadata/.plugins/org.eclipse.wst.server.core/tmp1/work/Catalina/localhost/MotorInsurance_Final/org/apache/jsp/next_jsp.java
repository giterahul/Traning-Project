/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-08 13:52:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class next_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<!-- Required meta tags-->\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("<meta name=\"author\" content=\"Colorlib\">\n");
      out.write("<meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("<!-- Title Page-->\n");
      out.write("<title>Au Register Forms by Colorlib</title>\n");
      out.write("\n");
      out.write("<!-- Icons font CSS-->\n");
      out.write("<link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\"\n");
      out.write("\trel=\"stylesheet\" media=\"all\">\n");
      out.write("<link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\" media=\"all\">\n");
      out.write("<!-- Font special for pages-->\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Vendor CSS-->\n");
      out.write("<link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("<link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("\n");
      out.write("<!-- Main CSS-->\n");
      out.write("<link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins\">\n");
      out.write("\t\t<div class=\"wrapper wrapper--w780\">\n");
      out.write("\t\t\t<div class=\"card card-3\">\n");
      out.write("\t\t\t\t<div class=\"card-heading\"></div>\n");
      out.write("\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title\">Get Premium</h2>\n");
      out.write("\t\t\t\t\t<form action=\"PremiumController\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tVehicle Type:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Vehicle Type\" name=\"vehicletype\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.vehicleType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tManufacturer:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Manufacturer\" name=\"manufacturer\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.manufacturer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tVehicle model:<input class=\"input--style-3\" placeholder=\"Enter Vehicle model\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"model\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.vehicleModel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tEngine CC:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Engine CC\" name=\"engineCC\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.engineCC}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tFuel Type:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Fuel Type\" name=\"fueltype\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.fuelType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tPassing Year:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Passing Year\" name=\"passingyear\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.passingYear}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tVehicle Cost:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Vehicle Cost\" name=\"cost\" required=\"required\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.vehicleCost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Chassis Number\" name=\"chassisnumber\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.chassisNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tVehicle Colour:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Vehicle Colour\" name=\"colour\"\n");
      out.write("\t\t\t\t\t\t\t\trequired=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.vehicleColour}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\tCity:<input class=\"input--style-3\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t name=\"city\" required=\"required\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vehicle.customer.city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"p-t-10\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn--pill btn--green\" type=\"submit\">Calculate</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Jquery JS-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<!-- Vendor JS-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Main JS-->\n");
      out.write("\t<script src=\"js/global.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
