
public class Usuario {

    //Atributos
    private String nome;
    private String usuario;
    private String senha;

    public Usuario() {
        this.nome = "";
        this.usuario = "";
        this.senha = "";

    }

    public Usuario(String nome, String usuario, String senha) {
        this.nome = "";
        this.usuario = "";
        this.senha = "";
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
}
