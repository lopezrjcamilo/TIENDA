import java.sql.*;
import java.util.ArrayList;

public class GestionProductos {
    Conexion con = new Conexion();
    private ArrayList<Productos> datos = new ArrayList<>();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec= null;

    public ArrayList<Productos> conultarProductos() {
        try {
            String sql = "select*from Productos";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);
            while (res.next()){
                Productos pro = new Productos(res.getInt(1), res.getDouble(2),res.getString(3),res.getString(4),res.getDouble(5),res.getDouble(6) );
                datos.add(pro);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
