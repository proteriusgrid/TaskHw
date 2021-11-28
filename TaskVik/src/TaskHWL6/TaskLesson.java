package TaskHWL6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class TaskLesson {

    static final String alphabeticNumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String alphabetic = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String numeric = "0123456789";
    static SecureRandom rnd = new SecureRandom();

    static String randomString(int mode, int length){
        StringBuilder sb = new StringBuilder(length);

        if(mode == 1) {
            for(int i = 0; i < length; i++)
            {
                sb.append(alphabeticNumeric.charAt(rnd.nextInt(alphabeticNumeric.length())));
            }
        }
        if(mode == 2) {
            for(int i = 0; i < length; i++) {
                sb.append(alphabetic.charAt(rnd.nextInt(alphabetic.length())));
            }
        }
        if(mode == 3) {
            for(int i = 0; i < length; i++) {
                sb.append(numeric.charAt(rnd.nextInt(numeric.length())));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mode(1 - alphabeticNumeric; 2 - alphabetic; 3 - numeric): ");
        int mode = sc.nextInt();

        System.out.print("Enter string size: ");
        int length = sc.nextInt();

        String output = randomString(mode, length);
        System.out.println("Random string: " + output);
    }

}
