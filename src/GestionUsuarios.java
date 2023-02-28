import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;

public class GestionUsuarios {

    Conexion con=new Conexion();
    private ArrayList<Usuarios> datos = new ArrayList<>();

    Statement st = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec = null;

    public ArrayList<Usuarios> consultarUsuarios() {
        try {
            String sql="select*from Usuarios";
            conec = con.Conecta();
            st = con.conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()){
                Usuarios usu= new Usuarios(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
                datos.add(usu);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
