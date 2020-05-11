package com.machine.service;

import com.machine.DAO.DAOFactory;
import com.machine.DAO.UserDAO;
import com.machine.models.user.User;

public class UserService {

    public static User findUser(String login, String password) {
        UserDAO<User> userDAO = DAOFactory.getUserDAO();
        return userDAO.findByLoginAndPassword(login,password);
    }


    public static Boolean registerUser(String username, String password,String fullName,int roleId) {

        UserDAO<User> userDAO = DAOFactory.getUserDAO();
        if (userDAO.findByLoginAndPassword(username,password) != null) {
            return false;
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFullName(fullName);
        user.setUserRoleId(roleId);
        userDAO.create(user);
        return true;
    }
}
