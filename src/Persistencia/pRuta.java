/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class pRuta extends clsPersistencia{
    String tabla="";
    
    public String buscarRecorrido(String barrio){ //Busca ruta por barrio en el recorrido
        String resultado="";
        ResultSet rs;

        try {
            rs = selectQuery("select * from ruta where zonas like '%" + barrio + "%';");
            rs.next();
            resultado = rs.getString("zonas");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public ArrayList<String> buscarRuta(int pDia, int altaObaja){ //Busca ruta por día de semana del 1 al 7
         ArrayList<String> resultado = new ArrayList<String>();
         ResultSet rs;
            if(altaObaja==0) {
                   tabla = "frecuencia_bt";
            } else {
                   tabla = "frecuencia_at";
            }
         
            try {
                rs = selectQuery("select numRuta from "+ tabla +" where frecuencia=" + pDia + ";");
                rs.first();
                while (rs.next()){
                resultado.add(rs.getString("numRuta"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        return resultado;
    }
    
    public int buscarTurno(String pRuta, int altaObaja){ //Busca Turno al que pertenece una ruta dada
        int resultado=0;
        ResultSet rs;
        
            if(altaObaja==0) {              //Yo se que no se usa pero lo dejo por si se necesita
                   tabla = "frecuencia_bt";
            } else {
                   tabla = "frecuencia_at";
            }
           
            try {
                rs = selectQuery("select turno from ruta where numRuta=" + pRuta + ";");
                rs.next();
                resultado = rs.getInt("turno");

            } catch (SQLException e) {
                e.printStackTrace();    
            }
       return resultado;
    }
    
    public int buscarFrecuencia(String pRuta, int altaObaja){ //Busca la frecuencia Semanal de una ruta
         int resultado=0;
           ResultSet rs;
        
            if(altaObaja==0) {              
                   tabla = "frecuencia_bt";
            } else {
                   tabla = "frecuencia_at";
            }
           
            try {
                rs = selectQuery("select frecuencia from " + tabla + " where numRuta=" + pRuta + ";");
                rs.next();
                resultado = rs.getInt("turno");

            } catch (SQLException e) {
                e.printStackTrace();    
            }
        return resultado;
    }
}
