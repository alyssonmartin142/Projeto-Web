package ecommerce.control;

import ecommerce.connection.Mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Alysson Martin
 */
public class LoginController extends Mysql {

    public static Boolean login(String usuario, String senha) {
        return (usuario != null && senha != null && LoginController.existe(usuario, senha));
    }

    public static Cookie getCookie(String nome, String valor) {
        Cookie cookie = new Cookie(nome, valor);
        return cookie;
    }

    public static Boolean estaLogado(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String usuario = cookies[1].getValue();
        String senha = cookies[2].getValue();
        return login(usuario, senha);
    }

    public static Boolean existe(String usuario, String senha) {
        try {
            String usuarioBd = null;
            String senhaBd = null;

            Connection con = Mysql.getConexaoMySQL();

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuarios WHERE nome_usuario = ? AND senha = ? LIMIT 1");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuarioBd = rs.getString("nome_usuario");
                senhaBd = rs.getString("senha");
            }
            Mysql.FecharConexao();
            return (usuario.equals(usuarioBd) && senha.equals(senhaBd));
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
}
