
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEO
 */
public class DbConnection {
    static String bd = "horario";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" + bd;
    
    Connection conn = null;
    
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, login, password);
            if(conn!=null){
                System.out.println("Conectado database ["+conn+"] EXITOSO");
            }
        } catch (SQLException e) {
            System.out.println("Exception conexion: "+e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Exception Driver: "+e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void disconect(){
        System.out.println("Cerrando database: ["+conn+"] FALLIDO");
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        DbConnection conn = new DbConnection();
    }
}
