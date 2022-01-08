package TaskHWL13New;

public class WrongPasswordException extends Throwable  {
    private String detail;


    public WrongPasswordException( int conditionViolated ) {
        detail = printMessage(conditionViolated);
    }

    public String printMessage(int passwordConditionViolated) {


        switch (passwordConditionViolated) {

            case 1:
                return ("Password  length should be equal or more than 20 characters");


            case 2:
                return ("Password should contain only acceptable symbols");

            case 3:
                return ("password or password confirmation do not match");
        }

        return ("");

    }




    public WrongPasswordException( ) {
        detail = "Incorrect password";
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail+ "} ";
    }








}
