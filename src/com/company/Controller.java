package com.company;

public class Controller {
    private final IUserRepository repo;

    public Controller(IUserRepository repo) {
        this.repo=repo; //
    }

    public String createUser(String login,String password) {
        User user=new User(login, password); //allocating memory for the class User

        boolean created=repo.createLogin(user); //an account is created and added to the database

        return ( created ? "User is created" : "User is not created");
        //if account created, it is deduced "User is created"
        // if it is not created, it is deduced "User is not created"
    }
}
