public class detalle_ventas {
    private int codigo_detalle;
    private int cantidad_producto;
    private int codido_producto;
    private int conido_venta;
    private Double valor_venta;
    private Double valor_iva;
    private Double valor_total;

    public detalle_ventas(int codigo_detalle, int cantidad_producto, int codido_producto, int conido_venta, Double valor_venta, Double valor_iva, Double valor_total) {
        this.codigo_detalle = codigo_detalle;
        this.cantidad_producto = cantidad_producto;
        this.codido_producto = codido_producto;
        this.conido_venta = conido_venta;
        this.valor_venta = valor_venta;
        this.valor_iva = valor_iva;
        this.valor_total = valor_total;
    }

    public detalle_ventas() {
    }

    public int getCodigo_detalle() {
        return codigo_detalle;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public int getCodido_producto() {
        return codido_producto;
    }

    public int getConido_venta() {
        return conido_venta;
    }

    public Double getValor_venta() {
        return valor_venta;
    }

    public Double getValor_iva() {
        return valor_iva;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setCodigo_detalle(int codigo_detalle) {
        this.codigo_detalle = codigo_detalle;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setCodido_producto(int codido_producto) {
        this.codido_producto = codido_producto;
    }

    public void setConido_venta(int conido_venta) {
        this.conido_venta = conido_venta;
    }

    public void setValor_venta(Double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public void setValor_iva(Double valor_iva) {
        this.valor_iva = valor_iva;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        return "detalle_ventas{" +
                "\n codigo_detalle=" + codigo_detalle +
                "\n cantidad_producto=" + cantidad_producto +
                "\n codido_producto=" + codido_producto +
                "\n conido_venta=" + conido_venta +
                "\n valor_venta=" + valor_venta +
                "\n valor_iva=" + valor_iva +
                "\n valor_total=" + valor_total +
                '}';
    }
}
