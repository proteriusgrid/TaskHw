package TaskHWL13New;

import java.util.Scanner;

public class Login {


        private String login;
        private String password;
        private  String confirmPassword;


    public Login(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void isValid(String login, String password, String confirmPassword)
            throws WrongLoginException , WrongPasswordException{

             throws  WrongLoginException;

            {

                // for checking if login length
                // is between 8 and 20
                if (!((login.length() >= 6)
                        && (login.length() <= 20))) {
                    throw new WrongLoginException(1);
                }

                // to check space
                if (login.contains(" ")) {
                    throw new WrongLoginException(2);
                }
                if (true) {
                    int count = 0;

                    // check digits from 0 to 9
                    for (int i = 0; i <= 9; i++) {

                        // to convert int to string
                        String str1 = Integer.toString(i);

                        if (login.contains(str1)) {
                            count = 1;
                        }
                    }
                    if (count == 0) {
                        throw new WrongLoginException(3);
                    }
                }

                // for special characters
                if (!(login.contains("-"))) {
                    throw new WrongLoginException(4);
                }

                if (true) {
                    int count = 0;

                    // checking capital letters
                    for (int i = 65; i <= 90; i++) {

                        // type casting
                        char c = (char)i;

                        String str1 = Character.toString(c);
                        if (login.contains(str1)) {
                            count = 1;
                        }
                    }
                    if (count == 0) {
                        throw new WrongLoginException(5);
                    }
                }

                if (true) {
                    int count = 0;

                    // checking small letters
                    for (int i = 90; i <= 122; i++) {

                        // type casting
                        char c = (char)i;
                        String str1 = Character.toString(c);

                        if (login.contains(str1)) {
                            count = 1;
                        }
                    }
                    if (count == 0) {
                        throw new WrongLoginException(6);
                    }
                }

                // The Login is valid



                throws WrongPasswordException
                {

                    // for checking if password length
                    // is between 8 and 15
                    if (!((password.length() >= 8)
                            && (password.length() <= 20))) {
                        throw new WrongPasswordException(1);
                    }

                    // to check space
                    if (password.contains(" ")) {
                        throw new WrongPasswordException(2);
                    }
                    if (true) {
                        int count = 0;

                        // check digits from 0 to 9
                        for (int i = 0; i <= 9; i++) {

                            // to convert int to string
                            String str1 = Integer.toString(i);

                            if (password.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(3);
                        }
                    }

                    // for special characters
                    if (!(password.contains("-")
                          )) {
                        throw new WrongPasswordException(4);
                    }

                    if (true) {
                        int count = 0;

                        // checking capital letters
                        for (int i = 65; i <= 90; i++) {

                            // type casting
                            char c = (char)i;

                            String str1 = Character.toString(c);
                            if (password.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(5);
                        }
                    }

                    if (true) {
                        int count = 0;

                        // checking small letters
                        for (int i = 90; i <= 122; i++) {

                            // type casting
                            char c = (char)i;
                            String str1 = Character.toString(c);

                            if (password.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(6);
                        }
                    }
            }



                throws WrongPasswordException
                {

                    // for checking if password length
                    // is between 8 and 15
                    if (!((confirmPassword.length() >= 8)
                            && (password.length() <= 20))) {
                        throw new WrongPasswordException(1);
                    }

                    // to check space
                    if (confirmPassword.contains(" ")) {
                        throw new WrongPasswordException(2);
                    }
                    if (true) {
                        int count = 0;

                        // check digits from 0 to 9
                        for (int i = 0; i <= 9; i++) {

                            // to convert int to string
                            String str1 = Integer.toString(i);

                            if (password.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(3);
                        }
                    }

                    // for special characters
                    if (!(confirmPassword.contains("-")
                    )) {
                        throw new WrongPasswordException(4);
                    }

                    if (true) {
                        int count = 0;

                        // checking capital letters
                        for (int i = 65; i <= 90; i++) {

                            // type casting
                            char c = (char)i;

                            String str1 = Character.toString(c);
                            if (confirmPassword.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(5);
                        }
                    }

                    if (true) {
                        int count = 0;

                        // checking small letters
                        for (int i = 90; i <= 122; i++) {

                            // type casting
                            char c = (char)i;
                            String str1 = Character.toString(c);

                            if (confirmPassword.contains(str1)) {
                                count = 1;
                            }
                        }
                        if (count == 0) {
                            throw new WrongPasswordException(6);
                        }
                    }
                }



        }
 }

    public static void main(String[] args) {

        String login = "Student";
        try {
            System.out.println("Is Login "
                    + login + " valid?");
            isValid(login);
            System.out.println("Valid Login");
        }
        catch (WrongLoginException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password = "Abc_1234567890";
        try {
            System.out.println("\nIs Password "
                    + password + " valid?");
            isValid(password);
            System.out.println("Valid Password");
        }
        catch (WrongPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }


        String confirmPassword =  "Abc_1234567890";
        try {
            System.out.println("\nIs confirm Password "
                    + confirmPassword + " valid?");
            isValid(confirmPassword);
            System.out.println("Valid Password");
        }
        catch (WrongPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }






    }

