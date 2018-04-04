package ru.kai.repositories;

import ru.kai.models.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void saveUser(User user);
    boolean isExist(String name, String password);

}
