package com.company;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        setLogin(login);
        setPassword(password); 
         //sets the login and password of the user
    }
    public String getLogin() {
        return login;
    } 

    public void setLogin(String login) {
        this.login = login;
    } 

    public String getPassword() {
        return password; 
    }

    public void setPassword(String password) {
        this.password = password;
    }
//using this, it refers to the current object
}
