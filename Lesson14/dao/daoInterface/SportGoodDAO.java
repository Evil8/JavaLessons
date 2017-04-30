package dao.daoInterface;

/**
 * Created by Anton_Khmyzov on 4/18/2017.
 */

import bean.SportGood;
import dao.DAOException;

import java.util.List;

public interface SportGoodDAO {
    void add(SportGood sportGood) throws DAOException;

    void update(SportGood sportGood) throws DAOException;

    void remove(SportGood sportGood) throws DAOException;

    SportGood find(SportGood sportGood) throws DAOException;

    List<SportGood> findAll() throws DAOException;
}