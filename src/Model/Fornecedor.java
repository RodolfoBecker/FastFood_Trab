
package Model;

/**
 *
 * @author Eduardo
 */
public class Fornecedor {
    public int cod_Fornecedor;
    public String nome;
    public String tipo_Grupo;

    public int getCod_Fornecedor() {
        return cod_Fornecedor;
    }

    public void setCod_Fornecedor(int cod_Fornecedor) {
        this.cod_Fornecedor = cod_Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_Grupo() {
        return tipo_Grupo;
    }

    public void setTipo_Grupo(String tipo_Grupo) {
        this.tipo_Grupo = tipo_Grupo;
    }
}
