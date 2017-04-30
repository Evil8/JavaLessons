package dao.impl;

import bean.SportGood;
import dao.DAOException;
import dao.daoInterface.SportGoodDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SportGoodDAOProcessor implements SportGoodDAO {
    private SQLServerProvider sqlConn = new SQLServerProvider();

    public void add(SportGood sportGood) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.setsportgood   @sportgoodsname  = ?, @priceperday = ?,@totalamount =?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setNString(1, sportGood.getName());
            stmt.setDouble(2, sportGood.getPrice());
            stmt.setInt(3, sportGood.getAmount());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(SportGood sportGood) throws DAOException {

        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifysportgood  @sportgoodname = ?, @priceperday = ?, @totalamount = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setNString(1, sportGood.getName());
            stmt.setDouble(2, sportGood.getPrice());
            stmt.setInt(3, sportGood.getAmount());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(SportGood sportGood) throws DAOException {
        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.modifysportgood  @id = ?,@active = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, sportGood.getId());
            stmt.setBoolean(2, sportGood.isActive());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SportGood find(SportGood sportGood) throws DAOException {

        try {
            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getsportgoods  @id = ?,@all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setInt(1, sportGood.getId());
            stmt.setBoolean(2, false);
            ResultSet resultSet = stmt.getResultSet();
            while (resultSet.next()) {
                sportGood.setPrice(resultSet.getDouble(2));
                sportGood.setAmount(resultSet.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sportGood;
    }

    @Override
    public List<SportGood> findAll() throws DAOException {
        List<SportGood> listSportGoods = new ArrayList<>();
        try {

            Connection conn = sqlConn.getConnection();
            String call = "exec dbo.getsportgoods  @all = ?";
            PreparedStatement stmt = conn.prepareCall(call);
            stmt.setBoolean(1, true);
            boolean isResultSet = stmt.execute();
            int count = 0;
            while (true) {
                if (isResultSet) {
                    SportGood sportGood = new SportGood();
                    ResultSet resultSet = stmt.getResultSet();
                    while (resultSet.next()) {
                        sportGood.setId(resultSet.getInt(1));
                        sportGood.setName(resultSet.getNString(2));
                        sportGood.setPrice(resultSet.getDouble(3));
                        sportGood.setAmount(resultSet.getInt(4));
                        sportGood.setActive(resultSet.getBoolean(5));
                    }
                    listSportGoods.add(sportGood);
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
        return listSportGoods;
    }
}
