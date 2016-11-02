package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ecommerce.model.Produto;
import ecommerce.control.ProdutoDAO;
import ecommerce.control.LoginController;

public final class index_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      ecommerce.model.Menu menu = null;
      synchronized (_jspx_page_context) {
        menu = (ecommerce.model.Menu) _jspx_page_context.getAttribute("menu", PageContext.PAGE_SCOPE);
        if (menu == null){
          menu = new ecommerce.model.Menu();
          _jspx_page_context.setAttribute("menu", menu, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("\n");
      out.write("\n");
 if (LoginController.estaLogado(request)) { 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bem vindo - Admin!</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            a {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            table, td, th {\n");
      out.write("                border: 1px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 70%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {\n");
      out.write("                height: 30px;\n");
      out.write("                vertical-align: bottom;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        ");

            out.print(menu.MostrarMenu());
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"w3-content \" style=\"max-width:2000px;margin-top:46px\">\n");
      out.write("            <h1 class=\"w3-center texto-banner\">Produtos cadastrados!</h1>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <table class=\"w3-center\" style=\"margin-left: 10%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Codigo</th>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Produto</th>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Descrição</th>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Valor Unitario</th>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Editar</th>\n");
      out.write("                        <th bgcolor=\"#000000\"><font color=\"white\">Excluir</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        List<Produto> produtos = ProdutoDAO.MostrarProdutos();
                        for (int i = 0; i < produtos.size(); i++) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
out.print(produtos.get(i).getId());
      out.write("</td>\n");
      out.write("                        <td>");
 out.print(produtos.get(i).getNome());
      out.write("</td>\n");
      out.write("                        <td>");
 out.print(produtos.get(i).getDescricao());
      out.write("</td>\n");
      out.write("                        <td>");
 out.print(produtos.get(i).getPrecoUnitario());
      out.write("</td>\n");
      out.write("                        <td><a style=\"text-decoration:none\" href=\"AlterarProduto?acao=alterar&idProduto=");
      out.print(produtos.get(i).getId());
      out.write("\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-edit\" aria-hidden=\"true\"></span></a></td>\n");
      out.write("                        <td><a style=\"text-decoration:none\" href=\"ControleAdmin?acao=excluir&idProduto=");
      out.print(produtos.get(i).getId());
      out.write("\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } else {
        response.sendRedirect("/TrabalhoWeb/login.jsp");
    }

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
