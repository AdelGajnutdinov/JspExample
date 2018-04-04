package ru.kai.repositories;

import ru.kai.models.User;

import java.time.LocalDate;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository{

    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void saveUser(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        return FakeStorage.storage().users().contains(new User(name, password));
    }
}
