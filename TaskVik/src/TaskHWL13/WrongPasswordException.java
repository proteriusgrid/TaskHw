package TaskHWL13;

public class WrongPasswordException {

    private String detail;

    public WrongPasswordException() {
        detail = "Incorrect password";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }


}
