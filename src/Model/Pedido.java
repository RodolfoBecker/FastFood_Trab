package Model;

import java.sql.Date;

/**
 *
 * @author Eduardo
 */
public class Pedido {
    public int cod_Pedido;
    public Date data_Pedido;
    public String status;
    public int cod_Mesa;
    public int valor_Pedido_Bruto;
    public int valor_Pedido_Liquido;
    public int valor_Pedido_Desconto;
    public String tipo;
    public int cod_Fornecedor;
    public int cod_Colaborador;

    public int getCod_Pedido() {
        return cod_Pedido;
    }

    public void setCod_Pedido(int cod_Pedido) {
        this.cod_Pedido = cod_Pedido;
    }

    public Date getData_Pedido() {
        return data_Pedido;
    }

    public void setData_Pedido(Date data_Pedido) {
        this.data_Pedido = data_Pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCod_Mesa() {
        return cod_Mesa;
    }

    public void setCod_Mesa(int cod_Mesa) {
        this.cod_Mesa = cod_Mesa;
    }

    public int getValor_Pedido_Bruto() {
        return valor_Pedido_Bruto;
    }

    public void setValor_Pedido_Bruto(int valor_Pedido_Bruto) {
        this.valor_Pedido_Bruto = valor_Pedido_Bruto;
    }

    public int getValor_Pedido_Liquido() {
        return valor_Pedido_Liquido;
    }

    public void setValor_Pedido_Liquido(int valor_Pedido_Liquido) {
        this.valor_Pedido_Liquido = valor_Pedido_Liquido;
    }

    public int getValor_Pedido_Desconto() {
        return valor_Pedido_Desconto;
    }

    public void setValor_Pedido_Desconto(int valor_Pedido_Desconto) {
        this.valor_Pedido_Desconto = valor_Pedido_Desconto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCod_Fornecedor() {
        return cod_Fornecedor;
    }

    public void setCod_Fornecedor(int cod_Fornecedor) {
        this.cod_Fornecedor = cod_Fornecedor;
    }

    public int getCod_Colaborador() {
        return cod_Colaborador;
    }

    public void setCod_Colaborador(int cod_Colaborador) {
        this.cod_Colaborador = cod_Colaborador;
    }
    
}
