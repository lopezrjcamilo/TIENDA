import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x = 0, opcion = 0;

        while (x == 0) {

            System.out.println("1 = Usuarios");
            System.out.println("2 = Clientes");
            System.out.println("3 = Ventas");
            System.out.println("4 = Proveedores");
            System.out.println("5 = Productos");
            System.out.println("6 = Detalle de ventas");
            System.out.println("7 = Consultar proveeodres por ciudad");
            System.out.println("8 = Consultar productos de una venta");
            System.out.println("9 = Cantidad de productos por cada venta");
            System.out.println("0 = Salir");

            System.out.println("Elija una opción");
            opcion= entrada.nextInt();

            if (opcion == 1) {
                GestionUsuarios Usuarios = new GestionUsuarios();
                ArrayList<Usuarios> resultado = new ArrayList<>();
                resultado = Usuarios.consultarUsuarios();
                System.out.println(resultado);
                for (Usuarios r : resultado) {
                    System.out.println(r.toString());
                }
            } else if (opcion == 2) {
                GestionClientes clientes = new GestionClientes();
                ArrayList<Clientes> resultado = new ArrayList<>();
                resultado = clientes.consultarClientes();
                System.out.println(resultado);
                for (Clientes r : resultado) {
                    System.out.println(r.toString());
                }
            } else if (opcion == 3) {
                GestionVentas ventas = new GestionVentas();
                ArrayList<Ventas> resultado = new ArrayList<>();
                resultado = ventas.consultarVentas();
                System.out.println(resultado);
                for (Ventas r : resultado) {
                    System.out.println(r.toString());
                }

            } else if (opcion == 4) {
                GestionProveedores proveedores = new GestionProveedores();
                ArrayList<Proveedores> resultado = new ArrayList<>();
                resultado = proveedores.consultarProveedores();
                System.out.println(resultado);
                for (Proveedores r : resultado) {
                    System.out.println(r.toString());
                }
            } else if (opcion == 5) {
                GestionProductos productos = new GestionProductos();
                ArrayList<Productos> resultado = new ArrayList<>();
                resultado = productos.conultarProductos();
                System.out.println(resultado);
                for (Productos r : resultado) {
                    System.out.println(r.toString());
                }
            } else if (opcion == 6) {
                GestionDetalleVentas detalleVentas = new GestionDetalleVentas();
                ArrayList<detalle_ventas> resultado = new ArrayList<>();
                resultado = detalleVentas.consultarDetalleVentas();
                System.out.println(resultado);
                for (detalle_ventas r : resultado) {
                    System.out.println(r.toString());
                }
            } else if (opcion == 7) { //consultar proveedores por ciudad
                GestionProveedores proveedores = new GestionProveedores();
                ArrayList<Proveedores> resultado = new ArrayList<>();
                System.out.println("Ingrese la ciudad que quiere buscar: ");
                String ciudad = entrada.next();
                if (proveedores.buscarCiudad(ciudad).size()<=0){
                    System.out.println("La ciudad no se encontro.");
                } else {
                    resultado = proveedores.buscarCiudad(ciudad);
                    for (Proveedores r : resultado){
                        System.out.println(r.toString()+"\n");
                    }
                }
            } else if (opcion == 8) { //consultar productos de una venta
                GestionDetalleVentas detalleVentas = new GestionDetalleVentas();
                ArrayList<detalle_ventas> resultado = new ArrayList<>();
                System.out.println("Ingrese el codigo de la venta a consultar: ");
                int venta = entrada.nextInt();
                if (detalleVentas.buscarProductos(venta).size()<=0){
                    System.out.println("El codigo de venta no existe.");
                } else {
                    resultado = detalleVentas.buscarProductos(venta);
                    for (detalle_ventas r : resultado){
                        System.out.println(r.toString()+"\n");
                    }
                }

            } else if (opcion == 9) { //Cantidad de productos por cada venta
                GestionDetalleVentas detalleVentas = new GestionDetalleVentas();
                ArrayList<detalle_ventas> resultado = new ArrayList<>();
                System.out.println("Ingrese el codigo de producto a consultar la cantidad vendida");
                int codigo = entrada.nextInt();
                if (detalleVentas.buscarCantidad(codigo).size()<=0){
                    System.out.println("El codigo del producto no existe.");
                } else {
                    resultado = detalleVentas.buscarCantidad(codigo);
                    for (detalle_ventas r : resultado){
                        System.out.println(r.toString()+"\n");
                    }
                }
            } else if (opcion == 0) {
                x = 1;
            } else {
                System.out.println("Seleccone una opción correcta");
            }

        }
    }


}