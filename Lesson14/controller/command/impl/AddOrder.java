package controller.command.impl;

import controller.command.Command;
import service.ServiceException;
import service.ServiceFactory;
import service.serviceinterface.OrderService;


public class AddOrder implements Command {
    @Override
    public String execute(String request) {
        int id = 1;
        String response = null;      // get parameters from request and initialize the variables login and password
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        OrderService orderService = serviceFactory.getOrderService();
        try {
            orderService.addOrder(id);
            response = "Added";
        } catch (ServiceException e) {    // write log
            response = "Error add procedure";
        }
        return response;
    }
}
