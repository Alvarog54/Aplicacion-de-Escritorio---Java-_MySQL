
package formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
   public static Connection conectar(){
       Connection cn = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen","root","");
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Conexion fallida");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
       return cn;
   } 
}
