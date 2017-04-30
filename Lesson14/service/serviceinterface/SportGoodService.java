package service.serviceinterface;

import bean.SportGood;
import service.ServiceException;

import java.util.List;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public interface SportGoodService {
    void addSportGood(int id, String name, double price, int amount, boolean active) throws ServiceException;

    void updateSportGood(int id, String name, double price, int amount, boolean active) throws ServiceException;

    void removeSportGood(int id) throws ServiceException;

    SportGood findSportGoodById(int id) throws ServiceException;

    List<SportGood> findSportGoodAll() throws ServiceException;

}
