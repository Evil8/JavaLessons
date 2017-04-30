package service;


import service.impl.CustomerServiceImpl;
import service.impl.OrderServiceImpl;
import service.impl.SportGoodServiceImpl;
import service.serviceinterface.CustomerService;
import service.serviceinterface.OrderService;
import service.serviceinterface.SportGoodService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final CustomerService customerServImpl = new CustomerServiceImpl();
    private final OrderService orderServImpl = new OrderServiceImpl();
    private final SportGoodService sportgoodServImpl = new SportGoodServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public SportGoodService getSportGoodService() {
        return sportgoodServImpl;
    }


    public CustomerService getCustomerService() {
        return customerServImpl;
    }


    public OrderService getOrderService() {
        return orderServImpl;
    }
}
