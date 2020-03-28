package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionFactory {
    
    public Connection conecta() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/livraria";
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
    
    public void closeConnection(Connection conn, Statement st, ResultSet rs)
            throws Exception{
        close(conn, st, rs);
    }
    public void closeConnection(Connection conn, Statement st)
            throws Exception{
        close(conn, st, null);
    }
    public void closeConnection(Connection conn)
            throws Exception{
        close(conn, null, null);
    }
    
    public void close(Connection conn, Statement st, ResultSet rs)
            throws Exception{
        try{
            if(rs != null) rs.close();
            if(st != null) st.close();
            if(conn != null) conn.close();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}