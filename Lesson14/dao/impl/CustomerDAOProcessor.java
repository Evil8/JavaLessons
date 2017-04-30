package dao.impl;

import bean.Customer;
import dao.DAOException;
import dao.daoInterface.CustomerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public class CustomerDAOProcessor implements CustomerDAO {
    private SQLServerProvider sqlConn = new SQLServerProvider();

    @Override
    public void add(Customer customer) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.setcustomer   @name =?, @passportnumber =?,@address =?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setNString(1, customer.getName());
            stmt.setNString(2, customer.getPassportNum());
            stmt.setNString(3, customer.getAddress());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Customer customer) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifycustomer  @id = ?, @name = ?, @passportnumber = ?, @address = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, customer.getId());
            stmt.setNString(2, customer.getName());
            stmt.setNString(3, customer.getPassportNum());
            stmt.setNString(4, customer.getAddress());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Customer customer) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifycustomer  @id = ?,@active = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, customer.getId());
            stmt.setBoolean(2, customer.isActive());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer find(Customer customer) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getcustomer  @id = ?,@all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, customer.getId());
            stmt.setBoolean(2, false);
            ResultSet resultSet = stmt.getResultSet();
            while (resultSet.next()) {
                customer.setName(resultSet.getNString(1));
                customer.setAddress(resultSet.getNString(2));
                customer.setPassportNum(resultSet.getNString(3));
                customer.setActive(resultSet.getBoolean(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> findAll() throws DAOException {
        List<Customer> listCustomer = new ArrayList<>();
        try {

            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getcustomer  @all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setBoolean(1, true);
            boolean isResultSet = stmt.execute();
            int count = 0;
            while (true) {
                if (isResultSet) {
                    Customer customer = new Customer();
                    ResultSet resultSet = stmt.getResultSet();
                    while (resultSet.next()) {
                        customer.setId(resultSet.getInt(1));
                        customer.setName(resultSet.getNString(2));
                        customer.setPassportNum(resultSet.getNString(3));
                        customer.setAddress(resultSet.getNString(4));
                        customer.setActive(resultSet.getBoolean(5));
                    }
                    listCustomer.add(customer);
                } else {
                    if (stmt.getUpdateCount() == -1) {
                        break;
                    }
                }
                count++;
                isResultSet = stmt.getMoreResults();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }
}
