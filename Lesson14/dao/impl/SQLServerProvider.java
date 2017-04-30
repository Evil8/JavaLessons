package dao.impl;

import java.sql.Connection;
import java.sql.SQLException;


public class SQLServerProvider {
    public Connection getConnection() throws SQLException {
        try {
            Connection conn = DbConnectionPool.getConnection();
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
