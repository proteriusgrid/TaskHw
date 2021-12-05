package TaskHWL8;

import java.util.Arrays;

public class Replace {
    public static void main( String[] args ) {}

    public void doReplace() {
        String Str = new String("Welcome Program Hello world ");

        System.out.print("After replacing all a with @ and  o with 0 : ");

        if (Str.length() < 30) {
            System.out.println(Str.replace('a', '@').replace('o', '0'));
        }
    }
}


