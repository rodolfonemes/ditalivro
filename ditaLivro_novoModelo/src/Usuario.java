
public class Usuario {

    //Atributos
    private String nome;
    private String usuario;
    private String senha;
    private boolean trocaSenha;

    public Usuario() {
        this.nome = "";
        this.usuario = "";
        this.senha = "";
        this.trocaSenha = false;

    }

    public Usuario(String nome, String usuario, String senha, boolean trocaSenha) {
        this.nome = "";
        this.usuario = "";
        this.senha = "";
        this.trocaSenha = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isTrocaSenha() {
        return trocaSenha;
    }

    public void setTrocaSenha(boolean trocaSenha) {
        this.trocaSenha = trocaSenha;
    }
}
