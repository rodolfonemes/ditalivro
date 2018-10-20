
public class Usuario {

    //Atributos
    private String usuario;
    private String senha;

    public Usuario() {
        this.usuario = "";
        this.senha = "";

    }

    public Usuario(String usuario, String senha) {
        this.usuario = "";
        this.senha = "";
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
