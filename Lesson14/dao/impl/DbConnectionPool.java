package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbConnectionPool {
    static JdbcConnectionPool pool = new JdbcConnectionPool();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = pool.getConnectionFromPool();
        return connection;
    }

    public static void returnConnection(Connection connection) {
        pool.returnConnectionToPool(connection);
    }
}

class Configuration {

    public String DB_USER_NAME;

    public String DB_PASSWORD;

    public String DB_URL;

    public String DB_DRIVER;

    public Integer DB_MAX_CONNECTIONS;

    public Configuration() {
        init();
    }

    private static Configuration configuration = new Configuration();

    public static Configuration getInstance() {
        return configuration;
    }

    private void init() {
        DB_USER_NAME = "sa";
        DB_PASSWORD = "Carekey1!";
        DB_URL = "jdbc:sqlserver://EPBYMINW1463\\MSSQLSERVER2012:1433;databaseName=SportGoodsRent";
        DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        DB_MAX_CONNECTIONS = 5;
    }
}

class JdbcConnectionPool {

    List<Connection> availableConnections = new ArrayList<Connection>();

    public JdbcConnectionPool() {
        initializeConnectionPool();
    }

    private void initializeConnectionPool() {
        while (!checkIfConnectionPoolIsFull()) {
            availableConnections.add(createNewConnectionForPool());
        }
    }

    private synchronized boolean checkIfConnectionPoolIsFull() {
        final int MAX_POOL_SIZE = Configuration.getInstance().DB_MAX_CONNECTIONS;

        return availableConnections.size() >= MAX_POOL_SIZE;
    }

    //Creating a connection
    private Connection createNewConnectionForPool() {
        Configuration config = Configuration.getInstance();
        try {
            Class.forName(config.DB_DRIVER);
            Connection connection = DriverManager.getConnection(
                    config.DB_URL, config.DB_USER_NAME, config.DB_PASSWORD);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public synchronized Connection getConnectionFromPool() {
        Connection connection = null;
        if (availableConnections.size() > 0) {
            connection = availableConnections.get(0);
            availableConnections.remove(0);
        }
        return connection;
    }

    public synchronized void returnConnectionToPool(Connection connection) {
        availableConnections.add(connection);
    }
}
