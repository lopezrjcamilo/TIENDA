import java.sql.*;
import java.util.ArrayList;

public class GestionVentas {
    Conexion con= new Conexion();
    private ArrayList<Ventas> datos = new ArrayList<>();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec=null;

    public ArrayList<Ventas> consultarVentas() {
        try {
            String sql="select*from Ventas";
            conec = con.Conecta();
            st = con.Conecta().createStatement();
            res = st.executeQuery(sql);
            while (res.next()){
                Ventas ven= new Ventas(res.getString(1),res.getInt(2),res.getInt(3),res.getDouble(4),res.getDouble(5),res.getDouble(6));
                datos.add(ven);
            }
        }catch (SQLException ex){
            System.out.printf("Error al consulta: "+ex);
        }
        return datos;
    }
}
