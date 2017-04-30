package dao;

import dao.daoInterface.CustomerDAO;
import dao.daoInterface.OrderDAO;
import dao.daoInterface.SportGoodDAO;
import dao.impl.CustomerDAOProcessor;
import dao.impl.OrderDAOProcessor;
import dao.impl.SportGoodDAOProcessor;


public class DAOFactory {
    private final static DAOFactory instance = new DAOFactory();

    private final SportGoodDAOProcessor sportGoodDAOProcessor = new SportGoodDAOProcessor();
    private final CustomerDAOProcessor customerDAOProcessor = new CustomerDAOProcessor();
    private final OrderDAOProcessor orderDAOProcessor = new OrderDAOProcessor();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public SportGoodDAO getSportGoodDAOProcessor() {
        return sportGoodDAOProcessor;
    }

    public CustomerDAO getCustomerDAOProcessor() {
        return customerDAOProcessor;
    }

    public OrderDAO getOrderDAOProcessor() {
        return orderDAOProcessor;
    }
}
