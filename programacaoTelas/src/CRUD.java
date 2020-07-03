import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CRUD {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
   
    private static final String USER = "ufnprojetomove";

    private static final String PASS = "USc5KrG_77nwVC";
    
    private static final String URL = "jdbc:mysql://ufnprojetomove.mysql.dbaas.com.br:3306/ufnprojetomove?useTimeZone=true&serverTimezone=UTC&user="+USER+"&password="+PASS;
    
    Connection c;
    Statement stmt = null;
    
    public void connect() {
        try {
            Class.forName(DRIVER).newInstance();
             c = DriverManager.getConnection(URL);
            System.out.println("Conectado!");           
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        }
    }
    
    ResultSet getPedidos() throws SQLException {
        try {
            connect();
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `Pedidos`"); 
           
            return rs;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return null;
    }

    int[] addFinanca(String codigo, String movimento, String descricao, float valor) {
        try {
            connect();
            stmt = c.createStatement();
            int[] result = new int[2];
            int codigoInt = Integer.parseInt(codigo);
            if(codigoInt>=1 && codigoInt <= 99){
                result[0] = stmt.executeUpdate("INSERT INTO `Financas`( `CODIGO`, `MOVIMENTO`, `DESCRICAO`, `ENTRADA`, `SAIDA`) VALUES ("+
                    codigo+",'"+movimento+"','"+descricao+"',"+valor+",'"+(valor-valor)+"')" , Statement.RETURN_GENERATED_KEYS);
            }
            else if(codigoInt>=100){
                result[0] = stmt.executeUpdate("INSERT INTO `Financas`( `CODIGO`, `MOVIMENTO`, `DESCRICAO`, `ENTRADA`, `SAIDA`) VALUES ("+
                    codigo+",'"+movimento+"','"+descricao+"',"+(valor-valor)+",'"+valor+"')" , Statement.RETURN_GENERATED_KEYS);
            }
            System.out.println("Result:" + result);
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()) {
                System.out.println("rs: " +rs.getString(1));
                result[1] = Integer.parseInt(rs.getString(1));
            } else {
                result[1] = -1;
            }
               return result;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return null;
    }
}