
public class Usuario {

    //Atributos
    private int usuario;
    private String senha;

    public Usuario() {
        this.usuario = 0;
        this.senha = "";

    }

    public Usuario(int usuario, String senha) {
        this.usuario = 0;
        this.senha = "";
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
