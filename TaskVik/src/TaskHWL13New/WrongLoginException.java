package TaskHWL13New;

public class WrongLoginException extends Throwable {
    //int loginConditionViolated = 0;
    private String detail;


    public WrongLoginException( int conditionViolated ) {
        detail = printMessage(conditionViolated);
    }

    public String printMessage(int loginConditionViolated) {


        switch (loginConditionViolated) {


            case 1:
                return ("Login  length should be equal or more than 20 characters");


            case 2:
                return ("Login should contain only acceptable symbols");


        }

        return ("");

    }




    public WrongLoginException() {
        detail = "Incorrect login";
    }


    @Override
    public String toString() {
        return "Wrong Login Exception: " + detail;
    }


}

