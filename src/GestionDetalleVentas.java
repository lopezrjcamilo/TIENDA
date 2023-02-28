import java.sql.*;
import java.util.ArrayList;

public class GestionDetalleVentas {
    Conexion con = new Conexion();
    private ArrayList<detalle_ventas> datos = new ArrayList<>();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec = null;

    public ArrayList<detalle_ventas> consultarDetalleVentas() {
        try {
            String sql = "select*from detalle_ventas";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);
            while (res.next()){
                detalle_ventas detv = new detalle_ventas(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getDouble(5),res.getDouble(6),res.getDouble(7));
                datos.add(detv);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    //METODOS PARA CONSULTAR

    //productos de una venta
    public ArrayList<detalle_ventas> buscarProductos(int producto) {
        datos.clear();
        try {
            conec = con.Conecta();
            String sql = "select * from detalle_ventas where codigo_venta=?";
            ps = conec.prepareStatement(sql);
            ps.setInt (1, producto);
            res = ps.executeQuery();
            while (res.next()){
                detalle_ventas detv = new detalle_ventas(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getDouble(5),res.getDouble(6),res.getDouble(7));
                datos.add(detv);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    //Cantidad de productos por cada venta

    public ArrayList<detalle_ventas> buscarCantidad(int cantidad) {
        datos.clear();
        try {
            conec = con.Conecta();
            String sql = "select * from detalle_ventas where codigo_producto=?";
            //String sql = "select cantidad_producto, codigo_producto, codigo_venta from detalle_ventas where codigo_producto=?";
            //String sql = "select codigo_producto, codigo_venta from detalle_ventas where codigo_producto=?";
            ps = conec.prepareStatement(sql);
            ps.setInt(1, cantidad);
            res = ps.executeQuery();
            while (res.next()){
                detalle_ventas detv = new detalle_ventas(res.getInt(1),res.getInt(2),res.getInt(3),res.getInt(4),res.getDouble(5),res.getDouble(6),res.getDouble(7));
                datos.add(detv);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
