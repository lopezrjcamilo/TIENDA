public class Proveedores {
    private String nit_proveedor;
    private String ciudad_proveedor;
    private String nombre_proveedor;
    private String telefono_proveedor;

    public Proveedores(String nit_proveedor, String ciudad_proveedor, String nombre_proveedor, String telefono_proveedor) {
        this.nit_proveedor = nit_proveedor;
        this.ciudad_proveedor = ciudad_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.telefono_proveedor = telefono_proveedor;
    }

    public Proveedores() {
    }

    public String getNit_proveedor() {
        return nit_proveedor;
    }

    public String getCiudad_proveedor() {
        return ciudad_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setNit_proveedor(String nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public void setCiudad_proveedor(String ciudad_proveedor) {
        this.ciudad_proveedor = ciudad_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    @Override
    public String toString() {
        return "Proveedores{" +
                "\n nit_proveedor= " + nit_proveedor +
                "\n ciudad_proveedor= " + ciudad_proveedor +
                "\n nombre_proveedor= " + nombre_proveedor +
                "\n telefono_proveedor= " + telefono_proveedor +
                '}';
    }
}
