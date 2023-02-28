public class Productos {
    private int codigo_producto;
    private Double iva_producto;
    private String nit_proveedor;
    private String nombre_proveedor;
    private Double precio_compra;
    private Double precio_venta;

    public Productos(int codigo_producto, Double iva_producto, String nit_proveedor, String nombre_proveedor, Double precio_compra, Double precio_venta) {
        this.codigo_producto = codigo_producto;
        this.iva_producto = iva_producto;
        this.nit_proveedor = nit_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }

    public Productos() {
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public Double getIva_producto() {
        return iva_producto;
    }

    public String getNit_proveedor() {
        return nit_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public Double getPrecio_compra() {
        return precio_compra;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setIva_producto(Double iva_producto) {
        this.iva_producto = iva_producto;
    }

    public void setNit_proveedor(String nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "\n codigo_producto= " + codigo_producto +
                "\n iva_producto= " + iva_producto +
                "\n nit_proveedor= " + nit_proveedor +
                "\n nombre_proveedor= " + nombre_proveedor +
                "\n precio_compra= " + precio_compra +
                "\n precio_venta= " + precio_venta +
                '}';
    }
}
