
package Dao;

import Interface.ICarrera;
import Models.Carrera;
import Models.Carrera;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LEO
 */
public class DaoCarrera implements ICarrera{
    
    private Carrera carrera;
    private CallableStatement object;
    private ResultSet rs;
    private String query;
    private Connection cn;
    private DbConnection conn;

    @Override
    public ArrayList<Carrera> listCarrera() {
        ArrayList<Carrera> list = new ArrayList<>();
        
        conn = new DbConnection();
        cn = conn.getConnection();
        
        query = "{CALL sp_listarcategorias()}";
        
        if(cn != null){
            try {
                object = conn.getConnection().prepareCall(query);
                rs = object.executeQuery();
                
                while(rs.next()){
                    carrera = new Carrera();
                    carrera.setIdCarrera(rs.getInt(""));
                    carrera.setDescription(rs.getString(""));
                    carrera.setState(rs.getString("").charAt(0));
                    list.add(carrera);
                }
            } catch (SQLException e) {
                System.out.println("Error al listar " + e.getMessage());
            }finally{
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error "+e.getMessage());
                }
            }
        }
        return list;
    }

    @Override
    public boolean insertCarrera(Carrera carrera) {
        boolean insert = false;
        int res;
        
        conn = new DbConnection();
        cn = conn.getConnection();
        
        if(cn != null){
            try {
                object = cn.prepareCall("CALL sp_insertcategorias(?,?,?)");
                object.setString(1, carrera.getDescription());
                object.setString(2, "A");
                res = object.executeUpdate();
                if(res == 1){
                    insert = true;
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar " + ex.getMessage());
            }finally{
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
        return insert;
    }

    @Override
    public boolean updateCarrera(Carrera carrera) {
        boolean update = false;
        int res;
        
        conn = new DbConnection();
        cn = conn.getConnection();
        
        if(cn != null){
            try {
                object = cn.prepareCall("CALL sp_insertcategorias(?,?,?)");
                object.setInt(1, carrera.getIdCarrera());
                object.setString(1, carrera.getDescription());
                object.setString(2, String.valueOf(carrera.getState()));
                res = object.executeUpdate();
                if(res == 1){
                    update = true;
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar " + ex.getMessage());
            }finally{
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
        return update;
    }

    @Override
    public boolean deleteCarrera(int idCarrera) {
        boolean delete = false;

        conn = new DbConnection();
        cn = conn.getConnection();
        
        if(cn != null){
            try {
                CallableStatement cs = cn.prepareCall("CALL sp_eliminarcategoria(?)");
                cs.setInt(1, idCarrera);
                cs.executeUpdate();
                
                delete = true;
            } catch (SQLException ex) {
                System.out.println("Error al eliminar " + ex.getMessage());
            }finally{
                try {
                    cn.close();
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
        return delete;
    }
    
    public static void main(String[] args) {
        
    }
}
