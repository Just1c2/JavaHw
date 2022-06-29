package mqltest.dao;

import mqltest.entities.Person;
import mqltest.entities.Product;

import java.sql.SQLException;
import java.util.List;

public interface DaoPerson {
    public int insert(Person person) throws SQLException;
    public int update(Person person) throws SQLException;
    public int delete(Person person) throws SQLException;
    public Person select(int id) throws SQLException;
    public List<Person> getAllPerson() throws SQLException;
}
