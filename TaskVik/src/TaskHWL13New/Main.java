package TaskHWL13New;

import static TaskHWL13New.Login.*;

public class Main {
    public static void main(String args[])
    {


        String login = "Geeksport123456789_";
        String password = "Geeksport123456789_";
        String confirmPassword = "Geeksport123456789_" ;

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
