
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //conexao com o banco de dados
    protected Connection Conecta() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/database";
        String user = "root";
        String pass = "";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println("erro na classe" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("erro" + ex.getMessage());
        }
        return null;
    }
}
