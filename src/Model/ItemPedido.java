package Model;

/**
 *
 * @author Eduardo
 */
public class ItemPedido {
   public int cod_Item_Pedido; 
   public int cod_Item_Estoque; 
   public Pedido objPedido;

    public int getCod_Item_Pedido() {
        return cod_Item_Pedido;
    }

    public void setCod_Item_Pedido(int cod_Item_Pedido) {
        this.cod_Item_Pedido = cod_Item_Pedido;
    }

    public int getCod_Item_Estoque() {
        return cod_Item_Estoque;
    }

    public void setCod_Item_Estoque(int cod_Item_Estoque) {
        this.cod_Item_Estoque = cod_Item_Estoque;
    }

    public Pedido getObjPedido() {
        return objPedido;
    }

    public void setObjPedido(Pedido objPedido) {
        this.objPedido = objPedido;
    }
    
}
