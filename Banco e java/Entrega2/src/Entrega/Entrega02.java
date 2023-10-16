package Entrega;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Entrega02 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/agencia";
        String usuario = "root";
        String senha = "root";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement statement = conexao.createStatement();
            String sql = "SELECT * FROM agencia.cliente"; 
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("idCliente"); 
                String nome = resultSet.getString("nomeCliente"); 
                System.out.println("idCliente: " + id + ", nomeCliente: " + nome);
            }

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao executar a consulta: " + e.getMessage());
        }
    }
}
