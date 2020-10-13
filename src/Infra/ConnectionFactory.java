package Infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory() {
    }

    public static Connection conectaBanco() throws Exception {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/FastFood",
                    "postgres",
                    "12345"
            );

            if (con != null) {
                System.out.println("Conexão efetuada com sucesso!");
            } else {
                System.out.println("Problemas com a conexão!");
            }

            return con;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
            return null;
        }
    }
}
