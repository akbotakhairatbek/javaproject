package com.company;

public class Main {

    public static void main(String[] args) {
	IDB db=new DBPostgres();
    IUserRepository rep=new LoginRepository(db);
    Controller contr=new Controller(rep);
    Registration reg=new Registration(contr);
    reg.loginStart();
    }
}
