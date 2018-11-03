


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class BDvendas {

PreparedStatement pstmt;
    Connection con = null;

    public void adicionarVendas(vendas v) throws SQLException {
     
        String sInsert;
        sInsert = "INSERT INTO vendas("
                + "cod_vendas, "
                + "nome_vendas,"
                + "cpf_vendas) "
                + " VALUES(?, ?, ?)";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setInt(1, v.getCod_vendas());
            pstmt.setString(2, v.getNome_vendas());
            pstmt.setString(3, v.getCpf_vendas());
            pstmt.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Venda gravado com sucesso2");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro vendas");
        }
    }        
   
    
    public List consultarVendas(String pcodigo) {
        String sSelect;
        ResultSet rs;
        vendas pr; //, cli1;
        List<vendas> listaVendas;
        listaVendas = new ArrayList<>();
        pcodigo = "%" + pcodigo + "%";
        sSelect = "SELECT * FROM vendas WHERE cod_vendas like ?  ";
//JOptionPane.showMessageDialog(null,sSelect);
//JOptionPane.showMessageDialog(null,pnome);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pcodigo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                pr = new vendas();
                pr.setCod_vendas(rs.getInt("cod_vendas"));
                pr.setNome_vendas(rs.getString("nome_vendas"));
                pr.setCpf_vendas(rs.getString("cpf_vendas"));
                listaVendas.add(pr);
                //JOptionPane.showMessageDialog(null, "nome " + op.getNome());
            }
            vendas pr1 = new vendas();
            for (int i = 0; i < listaVendas.size(); i++) {
                pr1 = listaVendas.get(i);
                //System.out.println(pr1.getNome());
            }
            return listaVendas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado"
                    + ex.getMessage());
            return null;
        }
    }
public vendas procurarVendas(String pCodigo) throws SQLException {
        String sSelect;
        ResultSet rs;
        vendas pr = null;
        sSelect = "SELECT * FROM vendas WHERE cod_vendas = ? ";
//JOptionPane.showMessageDialog(null,sSelect);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pCodigo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                pr = new vendas();
                pr.setCod_vendas(rs.getInt("cod_vendas"));
                pr.setNome_vendas(rs.getString("nome_vendas"));
                pr.setCpf_vendas(rs.getString("cpf_vendas"));
                JOptionPane.showMessageDialog(null, pr);
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

public vendas procurarUltimoRegistro() throws SQLException {
        String sSelect;
        ResultSet rs;
        vendas pr = null;
        sSelect = "SELECT cod_vendas FROM vendas ORDER BY cod_vendas DESC LIMIT 1";
//JOptionPane.showMessageDialog(null,sSelect);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            //pstmt.setString(1, pCodigo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                pr = new vendas();
                pr.setCod_vendas(rs.getInt("cod_vendas"));
                
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


 
    

