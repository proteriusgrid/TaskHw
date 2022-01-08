package TaskHWL13New;

import java.util.regex.*;

public class Login {

    public static boolean
    isValid( String login, String password, String confirmPassword ) throws WrongLoginException, WrongPasswordException {
        boolean isValid = true;


        String acceptableCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";


        if (login.length() <= 20) {
            isValid = false;
            throw new WrongLoginException(1);
        }
        char[] loginChars = login.toCharArray();

        // Printing array
        for (char ch : loginChars) {

            if (acceptableCharacters.indexOf(ch) == -1) {
                isValid = false;
                throw new WrongLoginException(2);
            }
        }


        if (password.length() <= 20) {
            isValid = false;
            throw new WrongPasswordException(1);
        }
        char[] passwordChars = password.toCharArray();


        for (char ch : passwordChars) {

            if (acceptableCharacters.indexOf(ch) == -1)
            {
                isValid = false;
                throw new WrongPasswordException(2);
            }
        }


        if (!confirmPassword.equals(password)) {
            isValid = false;
            throw new WrongPasswordException(3);
        }

        return isValid;
    }


}
