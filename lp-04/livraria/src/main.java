import Utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().conecta();
        
        String sql = "Insert into livros" + 
                "(titulo,edicao,publicacao, descricao)" +
                "values (?,?,?,?)";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, "A Teoria de Tudo");
        stmt.setInt(2, 1);
        stmt.setInt(3, 123);
        stmt.setString(4, "HIstória de Jane e Stepehen Hawking");
        
        stmt.execute();
        stmt.close();
        
        System.out.println("Gravado!");
        
        con.close();
    }
    
}
