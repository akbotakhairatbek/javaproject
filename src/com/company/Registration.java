package com.company;

import java.util.Scanner;

public class Registration {
    private final Controller contr; //declaring an entity, that means that the value can't be modified in the future
    private Scanner sc;

    public Registration(Controller contr) {
        this.contr = contr;
        sc = new Scanner(System.in);
    }
//In general here the work with the console is described
        public void loginStart() {
            System.out.println();
            System.out.println("Welcome to Login Page"); //output to the console "Welcome to Login Page"
            System.out.println("Please enter email: "); //output to the console "Please enter email: "
            String login=sc.nextLine();
            System.out.println("Please enter password: "); //output to the console "Please enter password: "
            String pass=sc.nextLine();
            String final1=contr.createUser(login,pass);
            System.out.println("Thank you for signing in!"); //output to the console "Thank you for signing in!"
    }
}
