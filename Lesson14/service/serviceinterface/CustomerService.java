package service.serviceinterface;

import service.ServiceException;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public interface CustomerService {
    void addCustomer(int id, String name) throws ServiceException;

    void updateCustomer(int id, String name) throws ServiceException;

    void removeCustomer(int id) throws ServiceException;

    String findCustomerByName(String name) throws ServiceException;
}
