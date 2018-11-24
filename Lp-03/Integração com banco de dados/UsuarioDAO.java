
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private Conexao con;

    public UsuarioDAO() {
        con = new Conexao();
    }

    public void inserir(Usuario user) {
        String sql = "Insert into Entidade values (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ptmt = con.Conecta().prepareStatement(sql);

            ptmt.setInt(1, user.getId());
            ptmt.setString(2, user.getNome());
            ptmt.setString(3, user.getSobrenome());
            ptmt.setString(4, user.getEmail());
            ptmt.setString(5, user.getTelefone());
            ptmt.setString(6, user.getTipo());
            ptmt.setString(7, user.getUsuario());
            ptmt.setString(8, user.getSenha());

            ptmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void alterar(int id, Usuario user) {
        String sql = "Update Entidade set nome=?, sobrenome=?, email=?, telefone=?, tipo=?, usuario=?, senha=? where id = ?";

        try {
            PreparedStatement ptmt = con.Conecta().prepareStatement(sql);

            ptmt.setString(1, user.getNome());
            ptmt.setString(2, user.getSobrenome());
            ptmt.setString(3, user.getEmail());
            ptmt.setString(4, user.getTelefone());
            ptmt.setString(5, user.getTipo());
            ptmt.setString(6, user.getUsuario());
            ptmt.setString(7, user.getSenha());
            ptmt.setInt(8, id);

            ptmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Usuario selecionarId(int id) {
        String sql = "Select * from Entidade Where id = ?";

        Usuario user = null;
        try {
            PreparedStatement stmt = con.Conecta().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                user = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("email"), rs.getString("telefone"), rs.getString("tipo"), rs.getString("usuario"), rs.getString("senha"));
            }
            return user;
        } catch (SQLException ex) {
            System.out.println("Erro SQL: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return null;

    }

    public void excluir(int id) {
        String sql = "Delete from Entidade where id=?";

        try {
            PreparedStatement ptmt = con.Conecta().prepareStatement(sql);

            ptmt.setInt(1, id);

            ptmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
