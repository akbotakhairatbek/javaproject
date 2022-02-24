package com.company;

import java.util.Scanner;

public class Registration {
    private final Controller contr;
    private Scanner sc;

    public Registration(Controller contr) {
        this.contr = contr;
        sc = new Scanner(System.in);
    }

        public void loginStart() {
            System.out.println();
            System.out.println("Welcome to Login Page");
            System.out.println("Please enter email: ");
            String login=sc.nextLine();
            System.out.println("Please enter password: ");
            String pass=sc.nextLine();
            String final1=contr.createUser(login,pass);
            System.out.println("Thank you for signing in!");
    }
}
