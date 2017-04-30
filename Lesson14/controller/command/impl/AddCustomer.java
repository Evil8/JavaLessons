package controller.command.impl;

import controller.command.Command;
import service.ServiceException;
import service.ServiceFactory;
import service.serviceinterface.CustomerService;


/**
 * Created by Anton_Khmyzov on 4/20/2017.
 */
public class AddCustomer implements Command {
    @Override
    public String execute(String request) {
        int id = 1;
        String response = null;      // get parameters from request and initialize the variables login and password
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        CustomerService customerService = serviceFactory.getCustomerService();
        try {
            customerService.addCustomer(id, "abcdeds Killer");
            response = "Added";
        } catch (ServiceException e) {    // write log
            response = "Error add procedure";
        }
        return response;
    }
}
