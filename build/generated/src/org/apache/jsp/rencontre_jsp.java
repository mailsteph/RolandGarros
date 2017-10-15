package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Joueur;
import DAO.JoueurDAOMySQL;
import java.util.List;
import DAO.JoueurDAO;

public final class rencontre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Rencontre</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"FeuilleCSS.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" />\n");
      out.write("\n");
      out.write("        <script src=\" http://code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.3/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/i18n/jquery-ui-i18n.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#date\").datepicker($.datepicker.regional[\"fr\"]);\n");
      out.write("            });\n");
      out.write("            $(function listejoueur() {\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeJoueur}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".remove(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container col-md-12\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <img class=\"nav navbar-nav thumbnail\" src=\"images/LogoRG.jpg\" alt=\"Logo Roland-Garros\"/>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">ROLAND-GARROS</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"home.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-md-offset-1 col-md-9 smallscreen\"> \n");
      out.write("\n");
      out.write("                <section class=\"jumbotron col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\n");
      out.write("                    <h2><strong>Planifier les rencontres</strong></h2>\n");
      out.write("                    <br />\n");
      out.write("                    <p>Planifier une nouvelle rencontre en indiquant le type de tournoi, les 2 joueurs, l'arbitre, le court, la date et l'heure.</p>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idTournoi\" class=\"col-md-4 control-label\">Tournoi</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <select name=\"idTournoi\" id=\"idTournoi\" required=\"required\" class=\"form-control\">\n");
      out.write("                                    <option>Simple Messieurs</option>\n");
      out.write("                                    <option>Simple Dames</option>\n");
      out.write("                                    <option>Simple Juniors Garçons</option>\n");
      out.write("                                    <option>Simple Juniors Filles</option>\n");
      out.write("                                </select>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idJoueur1\" class=\"col-md-4 control-label\">Joueur 1</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <select name=\"idJoueur1\" id=\"idJoueur1\" required=\"required\" class=\"form-control\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </select>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idJoueur2\" class=\"col-md-4 control-label\">Joueur 2</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <select name=\"idJoueur2\" id=\"idJoueur2\" required=\"required\" class=\"form-control\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idArbitre\" class=\"col-md-4 control-label\">Arbitre</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <select name=\"idArbitre\" id=\"idArbitre\" required=\"required\" class=\"form-control\">\n");
      out.write("                                    <option>Manuel Absolu</option>\n");
      out.write("                                    <option>Pierre Bacchi</option>\n");
      out.write("                                    <option>Thierry Carel</option>\n");
      out.write("                                    <option>Romain Dairiam-ubassy</option>\n");
      out.write("                                    <option>Stéphane Edouard</option>\n");
      out.write("                                    <option>Joël Fabas</option>\n");
      out.write("                                    <option>Arnaud Gabas</option>\n");
      out.write("                                    <option>Kim Hoan Ha Thuc</option>\n");
      out.write("                                </select>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idCourt\" class=\"col-md-4 control-label\">Court</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <select name=\"idCourt\" id=\"idCourt\" required=\"required\" class=\"form-control\">\n");
      out.write("                                    <option>Philippe Chatrier</option>\n");
      out.write("                                    <option>Suzanne Lenglen</option>\n");
      out.write("                                    <option>Court 1</option>\n");
      out.write("                                    <option>Court 2</option>\n");
      out.write("                                </select>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"date\" class=\"col-md-4 control-label\">Date du match</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <input name=\"date\" id=\"date\" required=\"required\" placeholder=\"jj/mm/aaaa\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("\n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"heure\" class=\"col-md-4 control-label\">Heure du match</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <input type=\"time\" name=\"heure\" id=\"heure\" required=\"required\" pattern=\"[0-2][0-9]:[0-9][0-9]\" placeholder=\"hh:mm\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"row col-md-8\">    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" value=\"Planifier la rencontre\" class=\"form-control btn-primary\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <aside class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    <li class=\"list-group-item active\">Liste des rencontres</li>\n");
      out.write("                    <li class=\"list-group-item\"><a href=\"#\">\n");
      out.write("                            <p>Simple Messieurs - Rafael Nadal / Stan Wawrinka - Manuel Absolu - Philippe Chatrier - 10/06/2016 15:00</p>\n");
      out.write("                        </a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </aside>  \n");
      out.write("\n");
      out.write("            <footer class=\"col-md-12\">&#9400; 2017 Copyright, Inc.</footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeJoueur}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("joueur");
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"listejoueur()\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeJoueur}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("joueur");
    _jspx_th_c_forEach_1.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"listejoueur()\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
