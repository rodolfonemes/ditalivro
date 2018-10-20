
public class Produto {

    //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private String tipo;
    private String estante;
    private String descricao;
    private double valor;
    private int quant;
    private int ano;

    public Produto() {
        this.isbn = "";
        this.titulo = "";
        this.valor = 0.0;
        this.quant = 0;
        this.autor = "";
        this.editora = "";
        this.tipo = "";
        this.estante = "";
        this.descricao = "";
        this.ano = 0;
    }

    public Produto(String isbn, String titulo, double valor, int quant,
            String autor, String editora, String tipo, String estante, String descricao, int ano) {
        this.isbn = "";
        this.titulo = "";
        this.valor = 0.0;
        this.quant = 0;
        this.autor = "";
        this.editora = "";
        this.tipo = "";
        this.estante = "";
        this.descricao = "";
        this.ano = 0;

    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstante() {
        return estante;
    }
    public void setEstante(String estante) {
        this.estante = estante;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }

}
