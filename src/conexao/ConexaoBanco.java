
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ademar
 */
public class ConexaoBanco { 
  Connection conexaoBanco=null;
    public static Connection conexaoBD() throws ClassNotFoundException, SQLException{    
            Connection conexaoBanco =  DriverManager.getConnection("jdbc:mysql://localhost/_aula_06-05","root","");
            return conexaoBanco;        
    }  
}
