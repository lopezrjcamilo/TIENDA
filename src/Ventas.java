public class Ventas {
    private String codigo_venta;
    private int cedula_cliente;
    private int cedula_usuario;
    private Double iva_venta;
    private Double total_venta;
    private Double valor_venta;

    public Ventas(String codigo_venta, int cedula_cliente, int cedula_usuario, Double iva_venta, Double total_venta, Double valor_venta) {
        this.codigo_venta = codigo_venta;
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.iva_venta = iva_venta;
        this.total_venta = total_venta;
        this.valor_venta = valor_venta;
    }

    public Ventas() {
    }

    public String getCodigo_venta() {
        return codigo_venta;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public int getCedula_usuario() {
        return cedula_usuario;
    }

    public Double getIva_venta() {
        return iva_venta;
    }

    public Double getTotal_venta() {
        return total_venta;
    }

    public Double getValor_venta() {
        return valor_venta;
    }

    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCedula_usuario(int cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public void setIva_venta(Double iva_venta) {
        this.iva_venta = iva_venta;
    }

    public void setTotal_venta(Double total_venta) {
        this.total_venta = total_venta;
    }

    public void setValor_venta(Double valor_venta) {
        this.valor_venta = valor_venta;
    }
}
