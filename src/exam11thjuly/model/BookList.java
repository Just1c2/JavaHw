package exam11thjuly.model;

import exam11thjuly.entity.Book;
import mqltest.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
    private static int id;
    private static String name;
    private static String author;
    private static int price;
    private static final String SQL_SELECT = "SELECT * FROM book";
    private static final String SQL_INSERT = "insert into book values(?,?,?,?)";
    static Connection conn;
    List<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static final String SQL_SELECT_ALL = "select * from product";
    public List<Product> getAll() throws SQLException {
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        List<Product> products = new ArrayList<>();

        preparedStatement = conn.prepareStatement(SQL_SELECT_ALL);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id1 = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double author = resultSet.getDouble("author");
            int price = resultSet.getInt("price");
            System.out.println("Id :" + id1 + " Name: " + name + " Author: " + author + " Price: " + price);
        }
        return products;
    }
    public void add(Book book){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter author");
        String author = sc.next();
        System.out.println("Enter price");
        int price = sc.nextInt();
        book = new Book(id,name,author,price);
    }
    public int insert(Book book) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int result = 0;
        preparedStatement = conn.prepareStatement(SQL_INSERT);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, author);
        preparedStatement.setInt(4, price);
        result = preparedStatement.executeUpdate();
        return result;
    }
}
