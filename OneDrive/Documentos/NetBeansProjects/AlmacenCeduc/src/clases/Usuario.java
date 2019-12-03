
package clases;

import conexion.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Usuario {
    private int _id_usuario;
    private String _apodo;
    private String _clave;
    private int _vigente;
    
    public Usuario() {  

    }
   /**
    * 
    * @param usuario
    * @param clave
    * @return 
    */ 
public static boolean conectar (String usuario,String clave){
    boolean valido = false ;
    ConexionMySQL sql = new ConexionMySQL();
    String query = "SELECT * FROM usuario WHERE";
    query += " apodo = '"+usuario+"'";
    query += " AND clave = '"+clave+"'; ";
    try{
    Statement s = sql.conn.createStatement(); 
    ResultSet rs = s.executeQuery(query);
    int filas = 0;
    while (rs.next()){
        filas++;
    }
    if (filas == 1){
        valido = true ;
    }
   }catch (SQLException e){
       
   }
    return valido ;
}
}