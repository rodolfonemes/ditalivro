


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class BDprodutos {
    
PreparedStatement pstmt;
    Connection con = null;

    public void adicionarProduto(Produto p) throws SQLException {
           
        String sInsert;
        sInsert = "INSERT INTO livros("
                + "livro_isbn, "
                + "livro_titulo, "
                + "livro_autor, "
                + "livro_editora, "
                + "livro_ano, "
                + "livro_tipo, "
                + "livro_estante, "
                + "livro_descricao, "
                + "livro_quantidade, "
                + "Livro_VALOR)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setString   (1, p.getIsbn());
            pstmt.setString(2, p.getTitulo());
            pstmt.setString(3, p.getAutor());
            pstmt.setString(4, p.getEditora());
            pstmt.setInt   (5, p.getAno());
            pstmt.setString(6, p.getTipo());
            pstmt.setString(7, p.getEstante());
            pstmt.setString(8, p.getDescricao());
            pstmt.setInt   (9, p.getQuant());
            pstmt.setDouble(10, p.getValor());
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar cliente" + ex.getMessage());
        }
    }        
   

    public void atualizarProduto(Produto p) throws SQLException {
        String sInsert;        
        
        sInsert = "update livros set  "
                + "livro_titulo = ?, "
                + "livro_autor = ?, "
                + "livro_editora = ?, "
                + "livro_ano = ?, "
                + "livro_tipo = ?, "
                + "livro_estante = ?, "
                + "livro_descricao = ?, "
                + "livro_quantidade = ?, "
                + "livro_VALOR = ? "
                + "where livro_isbn = ?";
        //JOptionPane.showMessageDialog(null, sInsert);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sInsert);
            pstmt.setString   (10, p.getIsbn());
            pstmt.setString(1, p.getTitulo());
            pstmt.setString(2, p.getAutor());
            pstmt.setString(3, p.getEditora());
            pstmt.setInt   (4, p.getAno());
            pstmt.setString(5, p.getTipo());
            pstmt.setString(6, p.getEstante());
            pstmt.setString(7, p.getDescricao());
            pstmt.setInt   (8, p.getQuant());
            pstmt.setDouble(9, p.getValor());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar cliente" + ex.getMessage());
        }
    }
    
    
    public Produto procurarProdutos(String pCodigo) throws SQLException {
        String sSelect;
        ResultSet rs;
        Produto pr = null;
        sSelect = "SELECT * FROM livros WHERE livro_isbn = ? ";
//JOptionPane.showMessageDialog(null,sSelect);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pCodigo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                pr = new Produto();
                pr.setIsbn(rs.getString("livro_isbn"));
                pr.setTitulo(rs.getString("livro_titulo"));
                pr.setAutor(rs.getString("livro_autor"));
                pr.setEditora(rs.getString("livro_editora"));
                pr.setAno(rs.getInt("livro_ano"));
                pr.setTipo(rs.getString("livro_tipo"));
                pr.setEstante(rs.getString("livro_estante"));
                pr.setDescricao(rs.getString("livro_descricao"));
                pr.setQuant(rs.getInt("livro_quantidade"));
                pr.setValor(rs.getDouble("livro_VALOR"));
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

   public void excluirProduto(int pCodigo) {
        String sSelect;
        sSelect = "DELETE FROM livros WHERE livro_isbn = ? ";
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setInt(1, pCodigo);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro excluído com Sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Atenção !!!" + "\n" + "Erro ao Excluir o Livro." + ex.getMessage());
        }
    }

    public List consultarProduto(String pcodigo) {
        String sSelect;
        ResultSet rs;
        Produto pr; //, cli1;
        List<Produto> listaProduto;
        listaProduto = new ArrayList<>();
        pcodigo = "%" + pcodigo + "%";
        sSelect = "SELECT * FROM livros WHERE livro_isbn like ? ";
//JOptionPane.showMessageDialog(null,sSelect);
//JOptionPane.showMessageDialog(null,pnome);
        try {
            con = CriarConexao.getConexao();
            pstmt = con.prepareStatement(sSelect);
            pstmt.setString(1, pcodigo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                pr = new Produto();
                pr.setIsbn(rs.getString("livro_isbn"));
                pr.setTitulo(rs.getString("livro_titulo"));
                pr.setAutor(rs.getString("livro_autor"));
                pr.setEditora(rs.getString("livro_editora"));
                pr.setAno(rs.getInt("livro_ano"));
                pr.setTipo(rs.getString("livro_tipo"));
                pr.setEstante(rs.getString("livro_estante"));
                pr.setDescricao(rs.getString("livro_descricao"));
                pr.setQuant(rs.getInt("livro_quantidade"));
                pr.setValor(rs.getDouble("livro_VALOR"));
                listaProduto.add(pr);
                //JOptionPane.showMessageDialog(null, "nome " + op.getNome());
            }
            Produto pr1 = new Produto();
            for (int i = 0; i < listaProduto.size(); i++) {
                pr1 = listaProduto.get(i);
                //System.out.println(pr1.getNome());
            }
            return listaProduto;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado"
                    + ex.getMessage());
            return null;
        }
    }
}

