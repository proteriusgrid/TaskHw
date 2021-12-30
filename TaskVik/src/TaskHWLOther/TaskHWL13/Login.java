package TaskHWL13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Login {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Login : ");
        String login = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Confirm Password :");
        String confirmPassword = input3.next();

        new Login();

        if (login.equals(login) && password.equals(password)) {
            {

            }

        } else if (login.equals(login)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }


    }
    public static boolean isValidLogin(String name)
    {

        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";
        String login = "";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (login == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(login);

        // Return if the username
        // matched the ReGex
        return m.matches();
    }


    // Function to validate the password.
    public static boolean isValidPassword(String password)
    {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
//                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }


        Matcher m = p.matcher(password);


        return m.matches();
    }

    public static boolean isValidConfirmPassword(String confirmPassword)
    {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
//                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);

        if (confirmPassword == null) {
            return false;
        }


        Matcher m = p.matcher(confirmPassword);


        return m.matches();
    }



    public void actionPerformed() {
        try {
            checkLogInInfo(isValidLogin("Bob"), isValidPassword("123456"), isValidConfirmPassword("123456"), "[\\w]{1,20}");
            isValidLogin("Bob").showMessageDialog(this, "Login and password are correct!",
                    "User login&password confirmation", isValidLogin().PLAIN_MESSAGE);
        } catch (WrongLoginException | WrongPasswordException e) {
            isValidLogin().showMessageDialog(this, e.getMessage(),
                    "UserException", isValidLogin().ERROR_MESSAGE);
        }
    }


    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }

}
