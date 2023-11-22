package JDBC;

import java.io.IOException;
import java.sql.SQLException;

public class DAOTeste {
    public static void main(String[] args) throws SQLException, IOException {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql, "João da Silva");
        dao.incluir(sql, "Ana Julia");
        dao.incluir(sql, "Djalma Pereira");

        dao.close();
    }
}
