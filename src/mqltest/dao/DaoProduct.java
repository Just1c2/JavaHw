package mqltest.dao;

import mqltest.entities.Person;
import mqltest.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface DaoProduct {
    public int insert(Product product) throws SQLException;
    public int update(Product product) throws SQLException;
    public int delete(int id) throws SQLException;
    public Product select(int id) throws SQLException;
    public List<Product> getAll() throws SQLException;
}
