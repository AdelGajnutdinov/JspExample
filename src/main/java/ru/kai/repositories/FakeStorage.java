package ru.kai.repositories;

import ru.kai.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        this.users.add(new User("Adel", "qwerty", LocalDate.now()));
        this.users.add(new User("Pavel", "qwerty", LocalDate.now()));
        this.users.add(new User("Sasha", "qwerty", LocalDate.now()));
    }
    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
