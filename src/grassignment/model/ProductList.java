package grassignment.model;

import grassignment.entity.Product;

import java.sql.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductList {
    static Scanner sc = new Scanner(System.in);

    public static void addProduct() throws SQLException {
        int id;
        String proName;
        String proDesc;
        int price;
        Connection con = getCon();
        String query = "insert into product values(?, ?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("Enter product id: ");
        id = sc.nextInt();
        preparedStatement.setInt(1, id);
        System.out.println("Enter product name: ");
        proName = sc.next();
        preparedStatement.setString(2, proName);
        System.out.println("Enter product description: ");
        proDesc = sc.next();
        preparedStatement.setString(3, proDesc);
        System.out.println("Enter product price: ");
        price = sc.nextInt();
        preparedStatement.setInt(4, price);
        preparedStatement.executeUpdate();
    }

    public static void deleteProduct() throws SQLException {
        int id;
        Connection con = getCon();
        String query = "DELETE FROM product WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("Enter product id you want to delete: ");
        id = sc.nextInt();
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public static void showListProduct() throws SQLException {
        Connection con = getCon();
        String query = "SELECT * FROM product";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String proName = resultSet.getString(2);
            String proDesc = resultSet.getString(3);
            int price = resultSet.getInt(4);
            System.out.println(id + " " + proName + " " + proName + " " + price);
        }
    }

    public static void updateProduct() throws SQLException {
        Connection con = getCon();
        String proName;
        int id;
        String query = "UPDATE product SET proName = ? WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("Enter name you want to change to: ");
        proName = sc.next();
        preparedStatement.setString(1, proName);
        System.out.println("Enter product id you want to change: ");
        id = sc.nextInt();
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public static void findProductById() throws SQLException {
        Connection con = getCon();
        int id;
        String query = "SELECT * FROM product WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("Enter product id you want to find: ");
        id = sc.nextInt();
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public static void findProductByName() throws SQLException {
        String proName;
        Connection con = getCon();
        String query = "SELECT * FROM product WHERE proName = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("Enter product name you want to find: ");
        proName = sc.next();
        preparedStatement.setString(1, proName);
        preparedStatement.executeUpdate();
    }

    public static Connection getCon() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/productmanagement";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(dbURL, username, password);

        return connection;
    }
}
