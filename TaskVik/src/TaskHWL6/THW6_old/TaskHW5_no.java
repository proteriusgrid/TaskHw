package TaskHWL6.THW6_old;

import java.util.Scanner;

public class TaskHW5_no {
    public static void main(String[] args)
    {
        System.out.print("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
//
//        char []k = string.toCharArray();
//        String string = "Hello world ";
//        removeChar(string, 'Hello');

//        String str = "abcdABC123";

        System.out.println("Removing 'b' = "+str.replace("b", ""));

        System.out.println("Removing First 'ab' = "+str.replaceFirst("ab", ""));

        System.out.println("Replacing all small letters = "+str.replaceAll("([a-z])", ""));
    }
}
