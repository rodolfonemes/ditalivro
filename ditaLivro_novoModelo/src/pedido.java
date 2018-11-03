/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnsilva
 */
public class pedido {
    private int cod_pedido;
    private int cod_venda_pedido;
    private int cod_livros_isbn_pedido;
    private String data_pedido;
    private String quant_pedido;
    
    
    public pedido(int cod_pedido, int cod_venda_pedido, int cod_livros_isbn_pedido, String data_pedido, String quant_pedido) {
        this.cod_pedido = 0;
        this.cod_venda_pedido = 0;
        this.cod_livros_isbn_pedido = 0;
        this.data_pedido = "";
        this.quant_pedido = "";
    }
    
    public pedido() {
        this.cod_pedido = 0;
        this.cod_venda_pedido = 0;
        this.cod_livros_isbn_pedido = 0;
        this.data_pedido = "";
        this.quant_pedido = "";
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public int getCod_venda_pedido() {
        return cod_venda_pedido;
    }

    public void setCod_venda_pedido(int cod_venda_pedido) {
        this.cod_venda_pedido = cod_venda_pedido;
    }

    public int getCod_livros_isbn_pedido() {
        return cod_livros_isbn_pedido;
    }

    public void setCod_livros_isbn_pedido(int cod_livros_isbn_pedido) {
        this.cod_livros_isbn_pedido = cod_livros_isbn_pedido;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public String getQuant_pedido() {
        return quant_pedido;
    }

    public void setQuant_pedido(String quant_pedido) {
        this.quant_pedido = quant_pedido;
    }
    
      
}
