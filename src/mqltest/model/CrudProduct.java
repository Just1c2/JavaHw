package mqltest.model;

import connection.SqlSv;
import mqltest.dao.DaoProduct;
import mqltest.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static connection.SqlSv.getCon;

public class CrudProduct implements DaoProduct {
    Connection conn = SqlSv.getCon();


    private static final String SQL_SELECT = "select * from product";
    private static final String SQL_SELECT_ONE = "select * from product where id = ?";
    private static final String SQL_INSERT = "insert into product values(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "update product set name = ?, price = ?, quantity = ?, description = ?" + "where id = ?";
    private static final String SQL_DELETE = "delete from product where id = ?";


    public CrudProduct() throws SQLException {
        super();//constructor goi phuong thuc cua cha
    }

    @Override
    public int insert(Product product) throws SQLException {
        if (product.getName() == null) {
            return 0;
        }
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int result = 0;
        preparedStatement = conn.prepareStatement(SQL_INSERT);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setString(4, product.getDescription());
        result = preparedStatement.executeUpdate();

        return result;
    }

    @Override
    public int update(Product product) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Product product) throws SQLException {
        return 0;
    }

    @Override
    public Product select(int id) throws SQLException {
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        List<Product> product = new ArrayList<>();

        preparedStatement = conn.prepareStatement(SQL_SELECT_ONE);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            product.add(new Product(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getDouble("price"),
                    resultSet.getInt("quantity"),
                    resultSet.getString("description")));
        }
        return (Product) product;
    }

    @Override
    public List<Product> getAll() throws SQLException {
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        List<Product> products = new ArrayList<>();

        preparedStatement = conn.prepareStatement(SQL_SELECT);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            products.add(new Product(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getDouble("price"),
                    resultSet.getInt("quantity"),
                    resultSet.getString("description")));
        }
        return products;
    }
}
