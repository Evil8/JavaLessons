package service.impl;

import bean.SportGood;
import dao.DAOException;
import dao.DAOFactory;
import dao.daoInterface.SportGoodDAO;
import service.ServiceException;
import service.serviceinterface.SportGoodService;

import java.util.ArrayList;
import java.util.List;

public class SportGoodServiceImpl implements SportGoodService {
    private final SportGoodDAO sportItemDAOProcessor = DAOFactory.getInstance().getSportGoodDAOProcessor();

    @Override
    public void addSportGood(int id, String name, double price, int amount, boolean active) throws ServiceException {
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
    public void updateSportGood(int id, String name, double price, int amount, boolean active) throws ServiceException {
        if ((id <= 0) || name == null || name.equals("") || price <= 0 || amount < 0) {
            throw new ServiceException("Update SportGoodItem: Invalid parameters");
        }
        SportGood sportGood = new SportGood();
        sportGood.setAmount(amount);
        sportGood.setId(id);
        sportGood.setPrice(price);
        sportGood.setActive(active);

        try {
            sportItemDAOProcessor.update(sportGood);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeSportGood(int id) throws ServiceException {
        if (id <= 0) {
            throw new ServiceException("Update SportGoodItem: Invalid parameters");
        }
        SportGood sportGood = new SportGood();
        sportGood.setId(id);
        sportGood.setActive(false);

        try {
            sportItemDAOProcessor.update(sportGood);
        } catch (DAOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public SportGood findSportGoodById(int id) throws ServiceException {
        if (id <= 0) {
            throw new ServiceException("Find SportGoodItem: Invalid parameters");
        }
        SportGood sportGood = new SportGood();
        sportGood.setId(id);
        SportGood result = new SportGood();
        try {
            result = sportItemDAOProcessor.find(sportGood);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<SportGood> findSportGoodAll() throws ServiceException {
        List<SportGood> sportGood = new ArrayList<>();
        try {
            sportGood = sportItemDAOProcessor.findAll();
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return sportGood;
    }
}
