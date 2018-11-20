package Model;

/**
 *
 * @author Eduardo
 */
public class Colaborador {
    private int cod_Colaborador;
    private String nome;
    private String funcao;
    private String tipo;
    private String usuario;
    private String senha;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getCod_Colaborador() {
        return cod_Colaborador;
    }

    public void setCod_Colaborador(int cod_Colaborador) {
        this.cod_Colaborador = cod_Colaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
