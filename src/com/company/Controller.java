package com.company;

public class Controller {
    private final IUserRepository repo;

    public Controller(IUserRepository repo) {
        this.repo=repo;
    }

    public String createUser(String login,String password) {
        User user=new User(login, password);

        boolean created=repo.createLogin(user);

        return ( created ? "User is created" : "User is not created");
    }
}
