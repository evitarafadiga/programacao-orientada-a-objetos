package sample;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAO {
    private static final String URL = "jdbc:mariadb://localhost:3306/petdb?allowMultiQueries=true";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public LivroDAOImpl() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void adicionar(Livro p) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "INSERT INTO pet (nome, raca, peso, nascimento) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getTitulo());
            stmt.setString(2, p.getAutor());
            stmt.setDouble(3, p.getPreco());
            stmt.setDate(4, java.sql.Date.valueOf(p.getDataPublicacao()));
            stmt.executeUpdate();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Livro> pesquisarPorNome(String nome) {
        List<Livro> lista = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "SELECT * FROM pet WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Livro p = new Livro();
                p.setTitulo(rs.getString("nome"));
                p.setAutor(rs.getString("raca"));
                p.setPreco(rs.getDouble("peso"));
                p.setDataPublicacao(rs.getDate("nascimento").toLocalDate());

                lista.add(p);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void remover(long id) {
    }

}
