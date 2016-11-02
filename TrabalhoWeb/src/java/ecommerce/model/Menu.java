package ecommerce.model;

/**
 *
 * @author Alysson Martin
 */
public class Menu {

    public String MostrarMenu() {
        String menu = "<nav class=\"navbar navbar-inverse\">\n"
                + "  <div class=\"container-fluid\">\n"
                + "    <div class=\"navbar-header\">\n"
                + "      <a class=\"navbar-brand\" href=\"/TrabalhoWeb/index.jsp\">E-Commerce</a>\n"
                + "    </div>\n"
                + "    <ul class=\"nav navbar-nav\">\n"
                + "      <li><a href=\"/TrabalhoWeb/index.jsp\">Home</a></li>\n"
                + "      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Admin<span class=\"caret\"></span></a>\n"
                + "        <ul class=\"dropdown-menu\">\n"
                + "          <li><a href=\"/TrabalhoWeb/novo-produto.jsp\">Novo</a></li>\n"
                + "          <li><a href=\"/TrabalhoWeb/index-admin.jsp\">Alterar-Excluir</a></li>\n"
                + "        </ul>\n"
                + "      </li>\n"
                + "      <li><a href=\"/TrabalhoWeb/produtos.jsp\">Produtos</a></li>\n"
                + "      <li><a href=\"ControleCarrinho?acao=visualizar\">Carrinho</a></li>\n"
                + "    </ul>\n"
                + "  </div>\n"
                + "</nav>";
        return menu;
    }
}
