package TaskHWL6.THW6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class TaskLes3_1 {

//    public void givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect() {
//        int leftLimit = 48; // numeral '0'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
//        Random random = new Random();
//
//        String generatedString = random.ints(leftLimit, rightLimit + 1)
//                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
//                .limit(targetStringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//
//        System.out.println(generatedString);
//    }
//    public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
//        Random random = new Random();
//
//        String generatedString = random.ints(leftLimit, rightLimit + 1)
//                .limit(targetStringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//
//        System.out.println(generatedString);
//    }

    static final String alphabeticNumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String alphabetic = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String numeric = "0123456789";
    static SecureRandom rnd = new SecureRandom();

    static String randomAlphabeticNumericString( int len ){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(alphabeticNumeric.charAt(rnd.nextInt(alphabeticNumeric.length())));
        return sb.toString();
    }

    static String randomAlphabeticString( int len ){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(alphabetic.charAt(rnd.nextInt(alphabetic.length())));
        return sb.toString();
    }

    static String randomNumericString( int len ){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(numeric.charAt(rnd.nextInt(numeric.length())));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int Array [] = new int[number];
//        System.out.println(generatedString());
        System.out.println(randomAlphabeticNumericString());
        System.out.println(randomAlphabeticString());
        System.out.println(randomNumericString());
    }

    private static long randomNumericString() {
        return 0;
    }

    private static long randomAlphabeticString() {
        return 0;
    }

    private static long randomAlphabeticNumericString() {
        return 0;
    }


//    private static String generatedString() {
//        return null;
//    }
}
