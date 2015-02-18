package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class clsPersistencia {

	public static String usuarioMySQL = "root";
	public static String passwordMySQL = "jupiter24";
	public static String conexionMySQL = "jdbc:mysql://198.144.180.217:3306/operaciones";
	/***
	 * Consultas a la DB 
	 * @param consulta: Es la consulta que se le en             viará a la base de datos
	 * @param tipoConsulta: Si este valor es 1 la consulta es un select, sino es un insert
	 */
	public static ResultSet selectQuery(String consulta) {
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conMySQL = DriverManager.getConnection(conexionMySQL, usuarioMySQL, passwordMySQL);
			Statement stMS = conMySQL.createStatement();

			rs = stMS.executeQuery(consulta);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public static boolean executeQuery(String consulta) {
		boolean result=true;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conMySQL = DriverManager.getConnection(conexionMySQL, usuarioMySQL, passwordMySQL);
			Statement stMS = conMySQL.createStatement();


			stMS.execute(consulta);

			conMySQL.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=false;
		}
		return result;
	}
}
  

