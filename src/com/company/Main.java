package com.company;

public class Main {

    public static void main(String[] args) {
    IUserRepository rep=new LoginRepository(db);
    Controller contr=new Controller(rep); //allocating memory for the class  Controller
    Registration reg=new Registration(contr); //allocating memory for the class  Registration
    reg.loginStart(); //starting the project
    }
}
