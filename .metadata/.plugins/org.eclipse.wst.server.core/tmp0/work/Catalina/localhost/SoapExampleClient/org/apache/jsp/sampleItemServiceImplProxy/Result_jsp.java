/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-03-16 08:52:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleItemServiceImplProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      com.store.service.ItemServiceImplProxy sampleItemServiceImplProxyid = null;
      synchronized (session) {
        sampleItemServiceImplProxyid = (com.store.service.ItemServiceImplProxy) _jspx_page_context.getAttribute("sampleItemServiceImplProxyid", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sampleItemServiceImplProxyid == null){
          sampleItemServiceImplProxyid = new com.store.service.ItemServiceImplProxy();
          _jspx_page_context.setAttribute("sampleItemServiceImplProxyid", sampleItemServiceImplProxyid, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleItemServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleItemServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleItemServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.store.service.ItemServiceImpl getItemServiceImpl10mtemp = sampleItemServiceImplProxyid.getItemServiceImpl();
if(getItemServiceImpl10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getItemServiceImpl10mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
case 15:
        gotMethod = true;
        String itemId_1id=  request.getParameter("itemId26");
        int itemId_1idTemp  = Integer.parseInt(itemId_1id);
        com.store.model.Item getItem15mtemp = sampleItemServiceImplProxyid.getItem(itemId_1idTemp);
if(getItem15mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getItem15mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">itemDescription:</TD>\r\n");
      out.write("<TD>\r\n");

if(getItem15mtemp != null){
java.lang.String typeitemDescription18 = getItem15mtemp.getItemDescription();
        String tempResultitemDescription18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitemDescription18));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultitemDescription18 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">itemName:</TD>\r\n");
      out.write("<TD>\r\n");

if(getItem15mtemp != null){
java.lang.String typeitemName20 = getItem15mtemp.getItemName();
        String tempResultitemName20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitemName20));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultitemName20 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">itemPrice:</TD>\r\n");
      out.write("<TD>\r\n");

if(getItem15mtemp != null){

      out.write('\r');
      out.write('\n');
      out.print(getItem15mtemp.getItemPrice()
);
}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">itemId:</TD>\r\n");
      out.write("<TD>\r\n");

if(getItem15mtemp != null){

      out.write('\r');
      out.write('\n');
      out.print(getItem15mtemp.getItemId()
);
}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
case 28:
        gotMethod = true;
        com.store.model.Item[] getAllItems28mtemp = sampleItemServiceImplProxyid.getAllItems();
if(getAllItems28mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getAllItems28mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempreturnp29 = null;
        if(getAllItems28mtemp != null){
        java.util.List<com.store.model.Item> listreturnp29= java.util.Arrays.asList(getAllItems28mtemp);
        //tempreturnp29 = listreturnp29.toString();
        	
            for(com.store.model.Item it : listreturnp29){
            	int id = it.getItemId();
            	String name = it.getItemName();
            	String description = it.getItemDescription();
            	double price = it.getItemPrice();
            	
      out.write("\r\n");
      out.write("            \t<h3>***********ITEM ");
      out.print(id);
      out.write("***********</h3>\r\n");
      out.write("            \t<p>Name => ");
      out.print(name );
      out.write("</p>\r\n");
      out.write("            \t<p>Price => ");
      out.print(price );
      out.write("</p>\r\n");
      out.write("            \t<p>Description => ");
      out.print(description );
      out.write("</p>\r\n");
      out.write("            \t<h3>***********************************</h3>\r\n");
      out.write("            \t");

            }
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp29);
      out.write("\r\n");
      out.write("        ");

}
break;
case 31:
        gotMethod = true;
        String itemDescription_3id=  request.getParameter("itemDescription36");
            java.lang.String itemDescription_3idTemp = null;
        if(!itemDescription_3id.equals("")){
         itemDescription_3idTemp  = itemDescription_3id;
        }
        String itemName_4id=  request.getParameter("itemName38");
            java.lang.String itemName_4idTemp = null;
        if(!itemName_4id.equals("")){
         itemName_4idTemp  = itemName_4id;
        }
        String itemPrice_5id=  request.getParameter("itemPrice40");
        double itemPrice_5idTemp  = Double.parseDouble(itemPrice_5id);
        String itemId_6id=  request.getParameter("itemId42");
        int itemId_6idTemp  = Integer.parseInt(itemId_6id);
        
      out.write("\r\n");
      out.write("        ");
      com.store.model.Item com1store1model1Item_2id = null;
      synchronized (session) {
        com1store1model1Item_2id = (com.store.model.Item) _jspx_page_context.getAttribute("com1store1model1Item_2id", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (com1store1model1Item_2id == null){
          com1store1model1Item_2id = new com.store.model.Item();
          _jspx_page_context.setAttribute("com1store1model1Item_2id", com1store1model1Item_2id, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1store1model1Item_2id.setItemDescription(itemDescription_3idTemp);
        com1store1model1Item_2id.setItemName(itemName_4idTemp);
        com1store1model1Item_2id.setItemPrice(itemPrice_5idTemp);
        com1store1model1Item_2id.setItemId(itemId_6idTemp);
        boolean addItem31mtemp = sampleItemServiceImplProxyid.addItem(com1store1model1Item_2id);
        String tempResultreturnp32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addItem31mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp32 );
      out.write("\r\n");
      out.write("        ");

break;
case 44:
        gotMethod = true;
        String itemId_7id=  request.getParameter("itemId47");
        int itemId_7idTemp  = Integer.parseInt(itemId_7id);
        boolean deleteItem44mtemp = sampleItemServiceImplProxyid.deleteItem(itemId_7idTemp);
        String tempResultreturnp45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteItem44mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp45 );
      out.write("\r\n");
      out.write("        ");

break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
