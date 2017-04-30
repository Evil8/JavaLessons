package service.impl;

import dao.DAOException;
import service.ServiceException;
import service.serviceinterface.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder(int id) throws ServiceException {
        if ((id <= 0) || name == null || name.equals("") || price <= 0 || amount < 0) {
            throw new ServiceException("Add SPortGoodItem: Invalid parameters");
        }
        SportGood sportGood = new SportGood();
        sportGood.setActive(active);
        sportGood.setAmount(amount);
        sportGood.setId(id);
        sportGood.setPrice(price);

        try {
            sportItemDAOProcessor.add(sportGood);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateOrder(int id) throws ServiceException {

    }

    @Override
    public void removeOrder(int id) throws ServiceException {

    }

    @Override
    public String findOrderById(String name) throws ServiceException {
        return null;
    }
}
