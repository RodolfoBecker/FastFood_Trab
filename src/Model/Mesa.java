package Model;

/**
 *
 * @author Eduardo
 */
public class Mesa {
    public int cod_Mesa;
    public String tipo_Mesa;
    public String status;

    public int getCod_Mesa() {
        return cod_Mesa;
    }

    public void setCod_Mesa(int cod_Mesa) {
        this.cod_Mesa = cod_Mesa;
    }

    public String getTipo_Mesa() {
        return tipo_Mesa;
    }

    public void setTipo_Mesa(String tipo_Mesa) {
        this.tipo_Mesa = tipo_Mesa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
