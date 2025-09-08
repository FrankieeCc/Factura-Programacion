package unicesar.edu.co.facturaprogramacion;

public class Cliente {
    private String TipoDeCliente;

    public Cliente(String TipoDeCliente) {
        this.TipoDeCliente = TipoDeCliente;
    }
    public String getTipoDeCliente() {
        return TipoDeCliente;
    }

    public void setTipoDeCliente(String TipoDeCliente) {
        this.TipoDeCliente = TipoDeCliente;
    }
}
