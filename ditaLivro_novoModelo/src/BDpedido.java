


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class BDpedido {

PreparedStatement pstmt;
    Connection con = null;

    public void adicionarPedido(pedido p) throws SQLException {
     
        String sInsert;
        sInsert = "INSERT INTO pedido("
                +"cod_pedido,"
                + "cod_venda_pedido, "
                + "cod_livros_isbn_pedido, "
                + "data_pedido, "
                + "quant_pedido)"
                + " VALUES(?, ?, ?, ?, ?)";
        //JOptionPane.showMessageDialog(null, sInsert);
        //System.out.println(sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setInt(1, p.getCod_pedido());
            pstmt.setInt(2, p.getCod_venda_pedido());
            pstmt.setInt(3, p.getCod_livros_isbn_pedido());
            pstmt.setString(4, p.getData_pedido());
            pstmt.setString(5, p.getQuant_pedido());
            pstmt.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Venda gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro pedido");
        }
    }        
   
    
    public List consultarPedido(String pcodigo) {
        String sSelect;
        ResultSet rs;
        pedido pe; //, cli1;
        List<pedido> listaPedido;
        listaPedido = new ArrayList<>();
        pcodigo = "%" + pcodigo + "%";
        sSelect = "SELECT * FROM pedido WHERE cod_venda_pedido like ?  ";
//JOptionPane.showMessageDialog(null,sSelect);
//JOptionPane.showMessageDialog(null,pnome);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pcodigo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                pe = new pedido();
                pe.setCod_pedido(rs.getInt("cod_pedido"));
                pe.setCod_venda_pedido(rs.getInt("cod_venda_pedido"));
                pe.setCod_livros_isbn_pedido(rs.getInt("cod_livros_isbn_pedido"));
                pe.setData_pedido(rs.getString("data_pedido"));
                pe.setQuant_pedido(rs.getString("quant_pedido"));
                listaPedido.add(pe);
                //JOptionPane.showMessageDialog(null, "nome " + op.getNome());
            }
            pedido pr1 = new pedido();
            for (int i = 0; i < listaPedido.size(); i++) {
                pr1 = listaPedido.get(i);
                //System.out.println(pr1.getNome());
            }
            return listaPedido;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "pedido não encontrado"
                    + ex.getMessage());
            return null;
        }
    }
public pedido procurarPedido(String pCodigo) throws SQLException {
        String sSelect;
        ResultSet rs;
        pedido pr = null;
        sSelect = "SELECT * FROM pedido WHERE cod_venda_pedido = ? ";
//JOptionPane.showMessageDialog(null,sSelect);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pCodigo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                pr = new pedido();
                pr.setCod_pedido(rs.getInt("cod_pedido"));
                pr.setCod_venda_pedido(rs.getInt("cod_venda_pedido"));
                pr.setCod_livros_isbn_pedido(rs.getInt("cod_livros_isbn_pedido"));
                pr.setData_pedido(rs.getString("data_pedido"));
                pr.setQuant_pedido(rs.getString("quant_pedido"));
                //JOptionPane.showMessageDialog(null, pr);
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

//public vendas procurarUltimoRegistro() throws SQLException {
//        String sSelect;
//        ResultSet rs;
//        vendas pr = null;
//        sSelect = "SELECT cod_vendas FROM vendas ORDER BY cod_vendas DESC LIMIT 1";
////JOptionPane.showMessageDialog(null,sSelect);
//        try {
//            con = CriarConexao.getConexao();
//            pstmt = con.prepareStatement(sSelect);
//            //pstmt.setString(1, pCodigo);
//            rs = pstmt.executeQuery();
//            if (rs.next()) {
//                pr = new vendas();
//                pr.setCod_vendas(rs.getString("cod_vendas"));
//                
//               return pr;
//            } else {
//                return pr;
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao gravar Operador"
//                    + ex.getMessage());
//            return pr;
//        }
//    }
 }


 
    

