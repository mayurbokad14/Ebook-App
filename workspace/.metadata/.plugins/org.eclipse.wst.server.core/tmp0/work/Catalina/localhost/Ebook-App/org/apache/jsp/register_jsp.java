/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-04-07 11:14:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.DAO.CartDAOImpl;
import com.entity.User;
import com.entity.Category;
import java.util.List;
import com.DB.DBConnect;
import com.DAO.BookDAOImpl;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Java%20Project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Ebook-App/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/all_component/allCss.jsp", Long.valueOf(1712405302898L));
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1712405303033L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1712405448261L));
    _jspx_dependants.put("/all_component/footer.jsp", Long.valueOf(1712405302959L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.entity.Category");
    _jspx_imports_classes.add("com.entity.User");
    _jspx_imports_classes.add("com.DAO.BookDAOImpl");
    _jspx_imports_classes.add("com.DAO.CartDAOImpl");
    _jspx_imports_classes.add("com.DB.DBConnect");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>EBook: Register</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\"\r\n");
      out.write("	crossorigin=\"anonymous\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".paint-card {\r\n");
      out.write("	box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error {\r\n");
      out.write("	color: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f0f1f2;\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\"\r\n");
      out.write("	style=\"height: 5px; background-color: #303f9f\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col-md-3 text-success\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<i class=\"fas fa-book\"></i> Ebooks\r\n");
      out.write("			</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-4 text-center\">\r\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0\" action=\"search.jsp\"\r\n");
      out.write("				method=\"post\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\" name=\"ch\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /all_component/navbar.jsp(29,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userobj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			<div class=\"col-md-5\">\r\n");
            out.write("				<div class=\"row\">\r\n");
            out.write("					");

					User us = (User) session.getAttribute("userobj");
					CartDAOImpl daoy = new CartDAOImpl(DBConnect.getConn());
					int i = daoy.countCart(us.getId());
					
            out.write("\r\n");
            out.write("					<div class=\"col-md-4 text-right pt-1 pr-0 \">\r\n");
            out.write("						<span style=\"font-size: 24px;\">(");
            out.print(i);
            out.write(")\r\n");
            out.write("						</span><a href=\"checkout.jsp\"><i class=\"fas fa-cart-plus fa-2x\"></i></a>\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("					<div class=\"col-md-8\">\r\n");
            out.write("						<a href=\"#\" class=\"btn btn-success\"><i\r\n");
            out.write("							class=\"fas fa-user-plus\"></i> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userobj.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a> <a href=\"logout\"\r\n");
            out.write("							class=\"btn btn-primary text-white\"><i\r\n");
            out.write("							class=\"fas fa-sign-in-alt\"></i> Logout</a>\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("				</div>\r\n");
            out.write("			</div>\r\n");
            out.write("\r\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i class=\"fas fa-home\"></i></a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Home\r\n");
      out.write("					<span class=\"sr-only\">(current)</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<!-- <li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("				href=\"all_recent_book.jsp\"><i class=\"fas fa-book-open\"></i>\r\n");
      out.write("					Recent Book</a></li> -->\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item dropdown\"><a\r\n");
      out.write("				class=\"nav-link active dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("				role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("				aria-expanded=\"false\"> Categories </a>\r\n");
      out.write("				<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("					<a class=\"dropdown-item\"\r\n");
      out.write("						href=\"all_recent_book.jsp\">All</a>\r\n");
      out.write("					\r\n");
      out.write("					");

					BookDAOImpl daox = new BookDAOImpl(DBConnect.getConn());
					List<Category> listx = daox.getAllCategory();
					for (Category c : listx) {
					
      out.write("\r\n");
      out.write("					<a class=\"dropdown-item\"\r\n");
      out.write("						href=\"catogory_book.jsp?ca=");
      out.print(c.getCategoryName());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</div></li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link disabled\"\r\n");
      out.write("				href=\"all_old_book.jsp\"><i class=\"fas fa-book-open\"></i> Old\r\n");
      out.write("					Book</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("			<a href=\"setting.jsp\" class=\"btn btn-light my-2 my-sm-0\"\r\n");
      out.write("				type=\"submit\"> <i class=\"fas fa-cog\"></i> Setting\r\n");
      out.write("			</a> <a href=\"helpline.jsp\" class=\"btn btn-light my-2 my-sm-0 ml-1\"\r\n");
      out.write("				type=\"submit\"> <i class=\"fas fa-phone-square-alt\"></i> Contact\r\n");
      out.write("				Us\r\n");
      out.write("			</a>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"container p-2\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("				<div class=\"card paint-card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h4 class=\"text-center\">Registration Page</h4>\r\n");
      out.write("\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<form action=\"register\" method=\"post\" id=\"register\" novalidate>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Enter Full Name</label> \r\n");
      out.write("								<input\r\n");
      out.write("									type=\"text\" class=\"form-control\" name=\"fname\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Email address</label> <input\r\n");
      out.write("									type=\"email\" class=\"form-control\" name=\"email\">\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Phone No</label> <input\r\n");
      out.write("									type=\"number\" class=\"form-control\" name=\"phno\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputPassword1\">Password</label> <input\r\n");
      out.write("									type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\"\r\n");
      out.write("									required=\"required\" name=\"password\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-check\">\r\n");
      out.write("								<input type=\"checkbox\" class=\"form-check-input\" name=\"check\"\r\n");
      out.write("									id=\"exampleCheck1\"> <label class=\"form-check-label\"\r\n");
      out.write("									for=\"exampleCheck1\">Agree terms & Condition</label>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"text-center p-2\">\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary btn-block btn-sm\">Register</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<div class=\"conatiner-fluid text-center text-white p-3 mt-2\"\r\n");
      out.write("	style=\"background-color: #303f9f;\">\r\n");
      out.write("	<h5>Design and Devloped by ebook.com</h5>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /all_component/navbar.jsp(58,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userobj }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<div class=\"col-md-3\">\r\n");
          out.write("				<a href=\"login.jsp\" class=\"btn btn-success\"><i\r\n");
          out.write("					class=\"fas fa-sign-in-alt\"></i> Login</a> <a href=\"register.jsp\"\r\n");
          out.write("					class=\"btn btn-primary text-white\"><i class=\"fas fa-user-plus\"></i>\r\n");
          out.write("					Register</a>\r\n");
          out.write("			</div>\r\n");
          out.write("\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /register.jsp(30,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty succMsg }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<p class=\"text-center text-success\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${succMsg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("							");
          if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f0_reused = false;
    try {
      _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /register.jsp(32,7) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setVar("succMsg");
      // /register.jsp(32,7) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setScope("session");
      int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
      if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      _jspx_th_c_005fremove_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /register.jsp(35,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty failedMsg }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<p class=\"text-center text-danger\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${failedMsg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("							");
          if (_jspx_meth_c_005fremove_005f1(_jspx_th_c_005fif_005f3, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f1 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f1_reused = false;
    try {
      _jspx_th_c_005fremove_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
      // /register.jsp(37,7) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f1.setVar("failedMsg");
      // /register.jsp(37,7) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f1.setScope("session");
      int _jspx_eval_c_005fremove_005f1 = _jspx_th_c_005fremove_005f1.doStartTag();
      if (_jspx_th_c_005fremove_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f1);
      _jspx_th_c_005fremove_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f1_reused);
    }
    return false;
  }
}
