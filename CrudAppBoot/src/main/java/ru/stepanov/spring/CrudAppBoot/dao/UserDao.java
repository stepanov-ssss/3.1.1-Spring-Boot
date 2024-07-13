package ru.stepanov.spring.CrudAppBoot.dao;



import ru.stepanov.spring.CrudAppBoot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User showUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUserById(long id, User user);
}
