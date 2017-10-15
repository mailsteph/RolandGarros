package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Joueur;
import java.util.List;
import java.util.List;
import DAO.JoueurDAOMySQL;
import DAO.JoueurDAO;

public final class joueur_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/listeJoueur.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Joueur</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"FeuilleCSS.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
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
      out.write("                    <h2><strong>Enregistrement d'un nouveau joueur</strong></h2>\n");
      out.write("                    <br />\n");
      out.write("                    <p>Enregistrer un nouveau joueur en indiquant son nom, son prénom, son sexe, sa nationalité, son rang mondial en simple et sa catégorie (adulte ou junior).</p>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"col-md-6\">\n");
      out.write("                    <form method='post' action='addjoueur'>\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nom\" class=\"col-md-4 control-label\">Nom</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input type=\"text\" name=\"nom\" maxlength=\"30\" id=\"nom\" required=\"required\" class=\"form-control\"/> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"prenom\" class=\"col-md-4 control-label\">Prénom</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input type=\"text\" name=\"prenom\" maxlength=\"30\" id=\"prenom\" required=\"required\" class=\"form-control\"/> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"sexe\" class=\"col-md-4 control-label\">Sexe</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <select name=\"sexe\" id=\"sexe\" required=\"required\" class=\"form-control\">\n");
      out.write("                                        <option value='2'>Féminin</option>\n");
      out.write("                                        <option value='1'>Masculin</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"nationalite\" class=\"col-md-4 control-label\">Nation</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <select name=\"nationalite\" id=\"nationalite\" required=\"required\" class=\"form-control\">\n");
      out.write("                                        <option>Suisse</option>\n");
      out.write("                                        <option>Espagne</option>\n");
      out.write("                                        <option>Angleterre</option>\n");
      out.write("                                        <option>Autriche</option>\n");
      out.write("                                        <option>Japon</option>\n");
      out.write("                                        <option>Croatie</option>\n");
      out.write("                                        <option>Serbie</option>\n");
      out.write("                                        <option>France</option>        \n");
      out.write("                                        <option>Tchécoslovaquie</option> \n");
      out.write("                                        <option>Ukraine</option> \n");
      out.write("                                        <option>Roumanie</option>   \n");
      out.write("                                        <option>Lettonie</option> \n");
      out.write("                                        <option>Danemark</option> \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"rangs\" class=\"col-md-4 control-label\">Rang mondial en Simple</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <input type=\"text\" name=\"rangs\" maxlength=\"30\" id=\"rangs\" required=\"required\" class=\"form-control\"/> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"catg\" class=\"col-md-4 control-label\">Catégorie</label>\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <select name=\"catg\" id=\"catg\" required=\"required\" class=\"form-control\">\n");
      out.write("                                        <option>Adulte</option>\n");
      out.write("                                        <option>Junior</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row col-md-8\">    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" value=\"Enregistrer le joueur\" class=\"form-control btn-primary\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <aside class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    <li class=\"list-group-item active\">Liste des joueurs enregistrés</li>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
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
          out.write(" \n");
          out.write("                    <li class=\"list-group-item\">\n");
          out.write("                        <a href=\"#\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${joueur.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </a>\n");
          out.write("                        <form style=\"display: inline ; float: right\" method=\"post\" action=\"deletejoueur\">\n");
          out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                            <button type=\"submit\" class=\"glyphicon glyphicon-remove \" ></button>\n");
          out.write("                        </form>\n");
          out.write("                    </li>\n");
          out.write("\n");
          out.write("\n");
          out.write("                ");
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
}
