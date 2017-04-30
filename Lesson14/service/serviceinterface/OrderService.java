package service.serviceinterface;

import service.ServiceException;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public interface OrderService {
    void addOrder(int id) throws ServiceException;

    void updateOrder(int id) throws ServiceException;

    void removeOrder(int id) throws ServiceException;

    String findOrderById(String name) throws ServiceException;
}
