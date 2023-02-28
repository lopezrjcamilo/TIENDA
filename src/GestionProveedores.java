import java.sql.*;
import java.util.ArrayList;

public class GestionProveedores {
    Conexion con = new Conexion();
    private ArrayList<Proveedores> datos = new ArrayList<>();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    Connection conec = null;

    public ArrayList<Proveedores> consultarProveedores(){
        try {
            String sql = "selec*from Proveedores";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);
            while (res.next()){
                Proveedores pro = new Proveedores(res.getString(1), res.getString(2),res.getString(3), res.getString(4) );
                datos.add(pro);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }

    //METODOS PARA BUSCAR

    //consulta proveedor por CIUDAD
    public ArrayList<Proveedores> buscarCiudad (String ciudad) {
        datos.clear();
        try {
            conec = con.Conecta();
            String sql = "select*from proveedores where ciudad_proveedor=?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, ciudad);
            res = ps.executeQuery();
            while (res.next()){
                Proveedores pro = new Proveedores(res.getString(1), res.getString(2),res.getString(3), res.getString(4) );
                datos.add(pro);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return datos;
    }
}
