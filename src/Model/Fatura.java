package Model;

/**
 *
 * @author Eduardo
 */
public class Fatura {
    public int cod_Fatura;
    public int qtde_Parcelas;
    public int valor_Fatura;
    public int cod_Pedido;
    public String descricao_Fatura;

    public int getCod_Fatura() {
        return cod_Fatura;
    }

    public void setCod_Fatura(int cod_Fatura) {
        this.cod_Fatura = cod_Fatura;
    }

    public int getQtde_Parcelas() {
        return qtde_Parcelas;
    }

    public void setQtde_Parcelas(int qtde_Parcelas) {
        this.qtde_Parcelas = qtde_Parcelas;
    }

    public int getValor_Fatura() {
        return valor_Fatura;
    }

    public void setValor_Fatura(int valor_Fatura) {
        this.valor_Fatura = valor_Fatura;
    }

    public int getCod_Pedido() {
        return cod_Pedido;
    }

    public void setCod_Pedido(int cod_Pedido) {
        this.cod_Pedido = cod_Pedido;
    }

    public String getDescricao_Fatura() {
        return descricao_Fatura;
    }

    public void setDescricao_Fatura(String descricao_Fatura) {
        this.descricao_Fatura = descricao_Fatura;
    }
}
