package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;


public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }
}
