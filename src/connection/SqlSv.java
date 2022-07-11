package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlSv {
    public static Connection getCon() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ProductManagement;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "hieu123";
        Connection connection = DriverManager.getConnection(dbURL, username, password);
        return connection;
    }

    public static void main(String[] args) throws SQLException {
        if (getCon() != null) {
            System.out.println("ket noi thanh cong");
        }
    }
}


