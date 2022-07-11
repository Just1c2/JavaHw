package connection;

import java.sql.*;

public class ConnectionExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = getCon();
        if (connection != null) {
            System.out.println("ket noi thanh cong");
        }
//        createProduct();
        updateProduct();
        readProductData();
        deleteProduct();
    }

    public static Connection getCon() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/dbtest";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(dbURL, username, password);

        /*try{
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            if (connection != null) {
                System.out.println("ket noi thanh cong");
            }
        } catch (SQLException e) {
            e.printStackTrace();*/
        return connection;
    }
    public static void createProduct() throws SQLException {
        Connection con = getCon();
        String query = "insert into product values(?, ?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, 6);
        preparedStatement.setString(2, "samsing");
        preparedStatement.setString(3, "new product");
        preparedStatement.setDouble(4, 1000);
        int rowInserted = preparedStatement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("create thanh cong");
        }
    }
    public static void readProductData() throws SQLException {
        Connection con = getCon();
        String query = "select * from product";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString("proName");
            String desc = resultSet.getString(3);
            double price = resultSet.getDouble("price");
            System.out.println(id + " " + name + " " + desc + " " + price);
        }
    }
    public static void updateProduct() throws SQLException {
        Connection con = getCon();
        String query = "update product set proName = ? WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, "iphone");
        preparedStatement.setInt(2, 1);
        int rowUpdated = preparedStatement.executeUpdate();
        if (rowUpdated > 0) {
            System.out.println("update thanh cong");
        }
    }
    public static void deleteProduct() throws SQLException {
        Connection con = getCon();
        String query = "DELETE FROM product WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, 4);
        int rowDeleted = preparedStatement.executeUpdate();
        if (rowDeleted > 0) {
            System.out.println("delete thanh cong");
        }
    }
}
