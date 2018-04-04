package ru.kai.models;

import java.time.LocalDate;

public class User {
    private String name;
    private String password;
    private LocalDate birthDate;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.birthDate = LocalDate.now();
    }
    public User(String name, String password, LocalDate birthDate) {
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User)obj;
        return name.equals(user.getName()) && password.equals(user.getPassword());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
