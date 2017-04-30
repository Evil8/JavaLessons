package dao.daoInterface;

/**
 * Created by Anton_Khmyzov on 4/18/2017.
 */

import bean.Order;
import dao.DAOException;

import java.util.List;

public interface OrderDAO {
    void add(Order order) throws DAOException;

    void update(Order order) throws DAOException;

    void remove(Order order) throws DAOException;

    Order find(Order order) throws DAOException;

    List<Order> findAll() throws DAOException;
}