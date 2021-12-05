package TaskHWL8;

import java.util.Scanner;

public class Login {
    public static void main( String[] args ) {

        String Username;
        String Password;
        int mode;
        mode = 0;
        Password = "123456";
        Username = "Student";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {
            {

                System.out.println("Access Granted! Welcome!");

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter mode(1 - Even Number ; 2 - Armstrong ; 3 -  Reverse  ; 4 - Fibonacci; 5 - Replace ): ");
                mode = sc.nextInt();

                if (mode == 1) {
                    EvenNumber evenNumber = new EvenNumber();
                    evenNumber.checkEvenNumber();
                }

                if (mode == 2) {
                    Armstrong armstrong = new Armstrong();
                    armstrong.checkArmstrong();
                }
                if (mode == 3) {
                    Reverse reverse = new Reverse();
                    reverse.doReverse();
                }
                if (mode == 4) {
                    Fibonacci fibonacci = new Fibonacci();
                    fibonacci.doFibonacciNumbers();

                }
                if (mode == 5) {
                    Replace replace = new Replace();
                    replace.doReplace();

                }
                else{
                    throw new StringIndexOutOfBoundsException("An attempt was made to use an index outside of a string. ");
                }

            }
            return ;

        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }
}

