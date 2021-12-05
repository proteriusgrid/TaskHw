package TaskHWL8;

import java.util.Scanner;

public class Login {
    public static void main( String[] args ) {

        String Username;
        String Password;
        int mode = 0;
        Password = "123456";
        Username = "Student";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

        if (mode == 1) {
            EvenNumber evenNumber = new EvenNumber();
            evenNumber.isEven();
        }

        if (mode == 2) {
            Armstrong armstrong = new Armstrong();
            armstrong.isArmstrong();
        }
        if (mode == 3)

        {
            Reverse reverse = new Reverse();
            reverse.main();
        }
        if (mode == 4)

        {
            Fibonacci fibonacci = new Fibonacci();
            fibonacci.printFibonacciNumbers();

        }
        if (mode == 4)

        {
            Replace replace = new Replace();
            Replace.main();

        }




        //        ???????
        try {
            throw new IllegalAccessException("This is a custom message");
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }


    }
}

