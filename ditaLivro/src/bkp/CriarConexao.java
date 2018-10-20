import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CriarConexao {
    static String usuario = "root";
    static String senha = "12345678";
    static String caminho = "jdbc:mysql://localhost:3306/ditalivros?useTimezone=true&serverTimezone=UTC";
   
public static Connection getConexao() throws SQLException {
try {
Class.forName("com.mysql.jdbc.Driver");
//JOptionPane.showMessageDialog(null,"Conexão efetuada com sucesso...");
return (DriverManager.getConnection(caminho, usuario, senha));
//return (DriverManager.getConnection("jdbc:mysql://localhost:3306/pdv", "root", "12345678"));
} catch (ClassNotFoundException ex) {
JOptionPane.showMessageDialog(null,"Erro ao conectar ao banco: " + ex.getMessage());
}
return null;
} 
}
