


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class BDusuario {

PreparedStatement pstmt;
    Connection con = null;

    public void adicionarUsuario(Usuario p) throws SQLException {
     
        String sInsert;
        sInsert = "INSERT INTO usuario("
                + "cpf, "
                + "senha,"
                + "nome, "
                + "trocarSenha) "
                + " VALUES(?, ?, ?, ?)";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setString(1, p.getUsuario());
            pstmt.setString(2, p.getSenha());
            pstmt.setString(3, p.getNome());
            pstmt.setBoolean(4, p.isTrocaSenha());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cpf já cadastrado");
        }
    }        
   

    public void atualizarUsuario(Usuario p) throws SQLException {
        String sInsert;        
        
        sInsert = "update usuario set  "
                + "senha = ?, "
                + "nome = ?, "
                + "trocarSenha = ? "
                + "where cpf = ?";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setString(1, p.getSenha());
            pstmt.setString(2, p.getNome());
            pstmt.setBoolean(3, p.isTrocaSenha());
            pstmt.setString(4, p.getUsuario());
            pstmt.executeUpdate();
                      //JOptionPane.showMessageDialog(null, "Cadastro atualizado");
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
                pr.setUsuario(rs.getString("cpf"));
                pr.setNome(rs.getString("nome"));
                pr.setTrocaSenha(rs.getBoolean("trocarSenha"));
                
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
    
    public List consultarUsuario(String pcodigo) {
        String sSelect;
        ResultSet rs;
        Usuario pr; //, cli1;
        List<Usuario> listaUsuario;
        listaUsuario = new ArrayList<>();
        pcodigo = "%" + pcodigo + "%";
        sSelect = "SELECT * FROM usuario WHERE cpf like ? ";
//JOptionPane.showMessageDialog(null,sSelect);
//JOptionPane.showMessageDialog(null,pnome);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pcodigo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                pr = new Usuario();
                pr.setUsuario(rs.getString("cpf"));
                pr.setSenha(rs.getString("senha"));
                pr.setNome(rs.getString("nome"));
                pr.setTrocaSenha(rs.getBoolean("trocarSenha"));
                listaUsuario.add(pr);
                //JOptionPane.showMessageDialog(null, "nome " + op.getNome());
            }
            Usuario pr1 = new Usuario();
            for (int i = 0; i < listaUsuario.size(); i++) {
                pr1 = listaUsuario.get(i);
                //System.out.println(pr1.getNome());
            }
            return listaUsuario;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado"
                    + ex.getMessage());
            return null;
        }
    }

 }