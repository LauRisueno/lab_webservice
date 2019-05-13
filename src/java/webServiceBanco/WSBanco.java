/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServiceBanco;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Laura Veronica Risueño Arancibia <lauri.lro4@gmail.com>
 */
@WebService(serviceName = "WSBanco")
public class WSBanco {

    PreparedStatement pst = null;
    ResultSet rst = null;
    Connection conndbc = null;
    conexion dbc = new conexion();

    /**
     * Web service operation
     */
     private double obtenercotizacion(String fecha){
        try {
            conndbc = dbc.databaseConn();
            String sql = "SELECT *FROM cotizacion where fecha='"+fecha+"'";
            pst = conndbc.prepareStatement(sql);
            rst = pst.executeQuery();
            String aux="";
            while(rst.next()){
                int id_cotizacion = Integer.parseInt(rst.getString("id_cotizacion"));
                String fecha_cotizacion = rst.getString("fecha");
                double valor = Double.parseDouble(rst.getString("valor"));
                return valor;
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(WSBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
}

    /**
     * Web service operation
     */
    public Double getCotizacion(String fecha) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    public Boolean setCotizacion(String fecha, double valor) {
        //TODO write your implementation code here:
        return null;
    }
     

}