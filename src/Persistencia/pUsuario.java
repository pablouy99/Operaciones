package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class pUsuario extends clsPersistencia {

    public int ultimoIndice() {
        int id = 0;
        ResultSet rs;

        try {
            rs = selectQuery("select MAX(id) as id from Usuarios");
            rs.next();
            id = rs.getInt("id");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public boolean ingresarUsuario(String nombre, String pass) {
        boolean bool=false;
        int id = ultimoIndice() + 1;
        System.out.println("id" + id);

        executeQuery("insert into Usuarios (id, nombre, pass, avatar, online)  values(" + id + ", '" + nombre + "', " + pass + ", 0, 0 )");
        return bool;
    }
    
    public boolean loguearUsuario(String nombre, String password) {
        boolean b = false;
        ResultSet rs;

        rs = selectQuery("select * from Usuarios where nombre='" + nombre + "'");
        try {
            rs.next();
            if(rs.getString("pass").equals(password))
                b=true;
        } catch (SQLException ex) {
            Logger.getLogger(pUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    public ArrayList<String> traerContactos(String nombre) {
        ResultSet rs;
        ArrayList<String> contactos = new ArrayList<String>();
        try {

            rs = selectQuery("select nombre, avatar, online from ListaContactos inner join Usuarios on idContacto=id and idUsuario=(select id as id from Usuarios where nombre='" + nombre + "')");            rs.next();
            rs.first();
            while(rs.next()){
               contactos.add(rs.getString("online") +" "+ rs.getString("nombre")+" "+ rs.getString("avatar"));
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(pUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contactos;
    }

  }
