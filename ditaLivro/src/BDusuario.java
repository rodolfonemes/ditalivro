
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BDusuario {

PreparedStatement pstmt;
    Connection con = null;

    public void adicionarUsuario(Usuario p) throws SQLException {
     
        String sInsert;
        sInsert = "INSERT INTO usuario("
                + "cpf, "
                + "senha) "
                + " VALUES(?, ?)";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setInt(1, p.getUsuario());
            pstmt.setString(2, p.getSenha());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar cliente" + ex.getMessage());
        }
    }        
   

    public void atualizarUsuario(Usuario p) throws SQLException {
        String sInsert;        
        
        sInsert = "update usuario set  "
                + "senha = ? "
                + "where cpf = ?";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setString   (1, p.getSenha());
            pstmt.setInt   (2, p.getUsuario());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar cliente" + ex.getMessage());
        }
    }
    
    
    public Usuario procurarUsuario(String pCodigo) throws SQLException {
        String sSelect;
        ResultSet rs;
        Usuario pr = null;
        sSelect = "SELECT * FROM usuario WHERE cpf = ? ";
//JOptionPane.showMessageDialog(null,sSelect);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pCodigo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                pr = new Usuario();
                pr.setSenha(rs.getString("senha"));
                pr.setUsuario(rs.getInt("cpf"));
                
               return pr;
            } else {
                return pr;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar Operador"
                    + ex.getMessage());
            return pr;
        }
    }

 }