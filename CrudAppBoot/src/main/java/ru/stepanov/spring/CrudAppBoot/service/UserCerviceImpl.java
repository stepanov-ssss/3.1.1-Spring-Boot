package ru.stepanov.spring.CrudAppBoot.service;


import org.springframework.stereotype.Service;
import ru.stepanov.spring.CrudAppBoot.dao.UserDao;
import ru.stepanov.spring.CrudAppBoot.models.User;

import java.util.List;

@Service
public class UserCerviceImpl implements UserService {

    private UserDao userDao;

    public UserCerviceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User showUserById(Long id) {
        return userDao.showUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUserById(long id, User user) {
        userDao.updateUserById(id, user);
    }
}
