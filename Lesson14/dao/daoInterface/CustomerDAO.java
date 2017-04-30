package dao.daoInterface;

/**
 * Created by Anton_Khmyzov on 4/18/2017.
 */

import bean.Customer;
import dao.DAOException;

import java.util.List;

public interface CustomerDAO {
    void add(Customer customer) throws DAOException;

    void update(Customer customer) throws DAOException;

    void remove(Customer customer) throws DAOException;

    Customer find(Customer customer) throws DAOException;

    List<Customer> findAll() throws DAOException;
}