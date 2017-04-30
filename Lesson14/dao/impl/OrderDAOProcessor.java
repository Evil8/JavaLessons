package dao.impl;

import bean.Order;
import dao.DAOException;
import dao.daoInterface.OrderDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public class OrderDAOProcessor implements OrderDAO {
    private SQLServerProvider sqlConn = new SQLServerProvider();

    @Override
    public void add(Order order) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.setfactorder   @customerid =?" +
                    ",@sportgoodid = ?" +
                    ",@sportgoodtakendate =?" +
                    ",@sportgoodreturndate = ?" +
                    ",@totaltopay = ?" +
                    ",@paid = ?" +
                    ",@totalsportgoodstaken = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, order.getCustomerId());
            stmt.setInt(2, order.getSportGoodId());
            stmt.setDate(3, Date.valueOf(order.getGoodTakenDate()));
            stmt.setDate(4, Date.valueOf(order.getGoodReturnDate()));
            stmt.setDouble(5, order.getTotalToPay());
            stmt.setBoolean(6, order.isPaid());
            stmt.setInt(7, order.getTotalGoodTaken());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Order order) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifyfactorder  @id =?" +
                    ",@customerid =?" +
                    ",@sportgoodid =?" +
                    ",@sportgoodtakendate =?" +
                    ",@sportgoodreturndate =?" +
                    ",@totaltopay =?" +
                    ",@paid =?" +
                    ",@totalsportgoodstaken =?" +
                    ",@closed =?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, order.getCustomerId());
            stmt.setInt(2, order.getSportGoodId());
            stmt.setDate(3, Date.valueOf(order.getGoodTakenDate()));
            stmt.setDate(4, Date.valueOf(order.getGoodReturnDate()));
            stmt.setDouble(5, order.getTotalToPay());
            stmt.setBoolean(6, order.isPaid());
            stmt.setInt(7, order.getTotalGoodTaken());
            stmt.setBoolean(8, order.isClosed());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(Order order) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifyfactorder  @id = ?,@active = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, order.getId());
            stmt.setBoolean(2, order.isActive());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Order find(Order order) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getfactorder  @id = ?,@all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, order.getId());
            stmt.setBoolean(2, false);
            ResultSet resultSet = stmt.getResultSet();
            while (resultSet.next()) {
                order.setSportGoodId(resultSet.getInt(1));
                order.setCustomerId(resultSet.getInt(2));
                order.setTotalGoodTaken(resultSet.getInt(3));
                order.setPaid(resultSet.getBoolean(4));
                order.setClosed(resultSet.getBoolean(5));
                order.setTotalToPay(resultSet.getDouble(6));
                order.setGoodTakenDate(resultSet.getDate(7).toLocalDate());
                order.setGoodReturnDate(resultSet.getDate(8).toLocalDate());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }


    @Override
    public List<Order> findAll() throws DAOException {
        List<Order> listOrders = new ArrayList<>();
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getfactorder  @all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setBoolean(1, true);
            boolean isResultSet = stmt.execute();
            int count = 0;
            while (true) {
                if (isResultSet) {
                    Order order = new Order();
                    ResultSet resultSet = stmt.getResultSet();
                    while (resultSet.next()) {
                        order.setId(resultSet.getInt(1));
                        order.setSportGoodId(resultSet.getInt(2));
                        order.setCustomerId(resultSet.getInt(3));
                        order.setTotalGoodTaken(resultSet.getInt(4));
                        order.setPaid(resultSet.getBoolean(5));
                        order.setClosed(resultSet.getBoolean(6));
                        order.setTotalToPay(resultSet.getDouble(7));
                        order.setGoodTakenDate(resultSet.getDate(8).toLocalDate());
                        order.setGoodReturnDate(resultSet.getDate(9).toLocalDate());
                    }
                    listOrders.add(order);
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
        return listOrders;
    }
}
