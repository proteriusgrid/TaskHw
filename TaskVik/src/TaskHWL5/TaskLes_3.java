package TaskHWL5;
import java.util.Scanner;


public class TaskLes_3 {
    public static void main(String[] args)
    {

        // character whose ASCII value to be found
//        char ch1 = 'a';
//        char ch2 = 'A';
//        // variable that stores the integer value of the character
//        int asciivalue1 = ch1;
//        int asciivalue2 = ch2;
//        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
//        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);



        Scanner scanner = new Scanner(System.in);
        String value= scanner.next();
//       //Convert string to a char array.
        char[] array = value.toCharArray();

//Loop over chars in the array.
        for(Character c : array) {

            System.out.println(c + 0);
            System.out.println( (char)(c + 0) );
        }
    }
}