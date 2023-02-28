import java.sql.*;
import java.util.ArrayList;

public class GestionClientes {

    Conexion con = new Conexion();
    private ArrayList<Clientes> datos = new ArrayList<>();
    Statement st = null ;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec = null;

    public ArrayList<Clientes> consultarClientes(){
        try {
            String sql="select*from Clientes";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()){
                Clientes cli= new Clientes(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5) );
                datos.add(cli);
            }

        }catch (SQLException ex){
            System.out.println("error al consultar: "+ex);
        }
        return datos;
    }
}
