package webServiceBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Veronica Risueño Arancibia <lauri.lro4@gmail.com>
 */
public class conexion {
   Connection Conn = null;
    String url = "jdbc:postgresql://localhost:5432/";
    String user = "postgres";
    String password = "Mnovember@23";
    
    public Connection databaseConn()
    {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Conn;
    }
    
    public static void main(String [] args){
        conexion conndatabase = new conexion();
        conndatabase.databaseConn();
    } 
}


