package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String stringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "root123";

        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
