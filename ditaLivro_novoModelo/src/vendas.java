/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnsilva
 */
public class vendas {

    private int cod_vendas;
    private String nome_vendas;
    private String cpf_vendas;
    
    public vendas() {
        this.cod_vendas = 0;
        this.nome_vendas = "";
        this.cpf_vendas = "";
    }
    
    public vendas(String cod_vendas, String nome_vendas, String cpf_vendas) {
        this.cod_vendas = 0;
        this.nome_vendas = "";
        this.cpf_vendas = "";
    }

    public int getCod_vendas() {
        return cod_vendas;
    }

    public void setCod_vendas(int cod_vendas) {
        this.cod_vendas = cod_vendas;
    }

    public String getNome_vendas() {
        return nome_vendas;
    }

    public void setNome_vendas(String nome_vendas) {
        this.nome_vendas = nome_vendas;
    }

    public String getCpf_vendas() {
        return cpf_vendas;
    }

    public void setCpf_vendas(String cpf_vendas) {
        this.cpf_vendas = cpf_vendas;
    }
    
    
}
