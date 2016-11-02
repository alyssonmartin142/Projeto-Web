package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ecommerce.model.ItemDeCompra;
import ecommerce.model.CarrinhoDeCompra;

public final class carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      ecommerce.model.Menu menu = null;
      synchronized (_jspx_page_context) {
        menu = (ecommerce.model.Menu) _jspx_page_context.getAttribute("menu", PageContext.PAGE_SCOPE);
        if (menu == null){
          menu = new ecommerce.model.Menu();
          _jspx_page_context.setAttribute("menu", menu, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Carrinho de Compras</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/meu-estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            a {\n");
      out.write("                color: white;\n");
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
      out.write("        <div class=\"w3-content\" style=\"margin-left: 6%; margin-top:46px\">\n");
      out.write("            <h1>Carrinho de Compras!</h1>\n");
      out.write("            <table class=\"w3-center\" border=\"1\" cellpadding=\"2\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">Remover</font></td>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">Item</font></td>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">QTD</font></td>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">Preço Unitário</font></td>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">Total Item</font></td>\n");
      out.write("                    <td bgcolor=\"#000000\"><font color=\"white\">Adicionar</font></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    //recupera os produtos do carrinho da sessao
                    CarrinhoDeCompra carrinho = (CarrinhoDeCompra) session.getAttribute("carrinho");
                    for (ItemDeCompra item : carrinho.getItens()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a style=\"text-decoration:none; color: black\"\n");
      out.write("                            href=\"ControleCarrinho?acao=removeProduto&idProduto=");
      out.print(item.getProduto().getId());
      out.write("\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-remove-sign\" aria-hidden=\"true\"></span></td>\n");
      out.write("                    <td>");
      out.print(item.getProduto().getNome());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(item.getQuantidade());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(item.getProduto().getPrecoUnitario());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(item.getTotal());
      out.write("</td>\n");
      out.write("                    <td><a style=\"text-decoration:none; color: black \"\n");
      out.write("                            href=\"ControleCarrinho?acao=addProduto&idProduto=");
      out.print(item.getProduto().getId());
      out.write("\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></a\n");
      out.write("                        ></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <strong>Valor Total: ");
      out.print(carrinho.calculaTotal());
      out.write("</strong><br/>\n");
      out.write("            <button class=\"w3-btn w3-margin-bottom\">\n");
      out.write("                <a style=\"text-decoration:none\" href=\"ControleCarrinho?acao=finalizarCompra\">Finalizar compra</a>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"w3-btn w3-margin-bottom\">\n");
      out.write("                <a style=\"text-decoration:none\" href=\"produtos.jsp\">Continue comprando</a>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"w3-btn w3-margin-bottom\">\n");
      out.write("                <a style=\"text-decoration:none\" href=\"ControleCarrinho?acao=cancelaCompra\">Cancelar comprar</a>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
