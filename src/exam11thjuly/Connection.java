package exam11thjuly;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
        public static java.sql.Connection getConnection() throws SQLException {
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Book;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "sa";
            java.sql.Connection connection = DriverManager.getConnection(dbURL, username, password);
            return connection;
        }
    public static void main(String[] args) throws SQLException {
        if (getConnection() != null) {
            System.out.println("ket noi thanh cong");
        }
    }
}
