package TaskHWL13New;

import static TaskHWL13New.Login.*;

public class Main {
    public static void main(String args[])
    {

//        first
        String login = "Geeksport_123456789123";
        String password = "Geeksport_123456789123";
        String confirmPassword = "Geeksport_123456789123" ;




//        1. The login has less than 20 characters
//        a) The login has less than 20 characters, with a cricket password and a confirmation password.
//        String login = "Geeksport_123456789";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geeksport_123456789123" ;

//         b) The login has less than 20 characters, with an incorrect password or confirmation password.
//        String login = "Geeksport_123456789";
//        String password = "Geeksport_123456789";
//        String confirmPassword = "Geeksport_123456789123" ;

//
//        2. The login has incorrect characters.
//            a) The login has incorrect characters, with a correct password and a confirmation password.
//        String login = "Geeksport_123456789123$";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geeksport_123456789123" ;

//            b) The login has incorrect characters, with an incorrect password or confirmation password.
//        String login = "Geeksport_123456789123$";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geeksport_123456789123?" ;


//        3. The password is less than 20 characters
//        a) The password has less than 20 characters, with a correct login and confirmation password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789";
//        String confirmPassword = "Geeksport_123456789123" ;
//
//        b)) The password has less than 20 characters, with an incorrect login or confirmation password.
//         String login = "Geeksport_123456789123";
//         String password = "Geeksport_123456789";
//         String confirmPassword = "Geeksport_123456789" ;

//        4. The password has incorrect characters.
//        a) The password has incorrect characters, with a correct login and confirmation password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123*";
//        String confirmPassword = "Geeksport_123456789123" ;

//        b) The password has incorrect characters with an incorrect login or confirmation password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123*!";
//        String confirmPassword = "Geeksport_123456789123%" ;
//
//        5. The confirmation password has less than 20 characters
//        a) The confirmation password has less than 20 characters, with a correct login and password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geekspor123456789" ;
//
//        b) The confirmation password has less than 20 characters, with an incorrect login or password.
//        String login = "Geeksport_123456789123";
//        String password = "Geekspo_123456789123";
//        String confirmPassword = "Geeks_123456789123" ;

//        6. Confirmation password has incorrect characters.
//            a) The confirmation password has incorrect characters, with a correct login and password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geeksport_!123456789123" ;

//            b) The confirmation password has incorrect characters with an incorrect login or password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_!123456789123";
//        String confirmPassword = "Geeksport_123456789123@" ;
//
//        7. Password and confirmation password must be equal.
//            a) The password and the confirmation password must have (correct data) identical data.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "Geeksport_123456789123" ;
//
//        b) The password has incorrect characters, with a correct login and confirmation password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123AbC";
//        String confirmPassword = "Geeksport_123456789123" ;
//
//        c) The confirmation password has incorrect characters, with a correct login and password.
//        String login = "Geeksport_123456789123";
//        String password = "Geeksport_123456789123";
//        String confirmPassword = "GeeksportQ1_123456789123" ;










        try {
            System.out.println("Result of authorization:: "+ isValid( login, password, confirmPassword));
        }
        catch (WrongLoginException e) {
            e.printStackTrace();
        }
        catch (WrongPasswordException e) {
            e.printStackTrace();
        }



    }
}
