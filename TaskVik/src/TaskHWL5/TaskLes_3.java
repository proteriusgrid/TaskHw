package TaskHWL5;
import java.util.Scanner;


public class TaskLes_3 {
    public static void main(String[] args)
    {
        System.out.print("Inpust string: ");
        Scanner scanner = new Scanner(System.in);
        String value= scanner.next();
//       //Convert string to a char array.
        char[] array = value.toCharArray();

//Loop over chars in the array.
        for(Character c : array) {

            System.out.print( c + 0 );
            System.out.println(" = " + (char)(c + 0) + ";");
        }
    }
}