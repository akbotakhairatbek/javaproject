package com.company;

public class Main {

    public static void main(String[] args) {
    Controller contr=new Controller(rep);
    Registration reg=new Registration(contr);
    reg.loginStart();
    }
}
