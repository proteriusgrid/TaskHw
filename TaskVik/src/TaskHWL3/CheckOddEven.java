package TaskHWL3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main( String[] args ) {

        Scanner sc= new Scanner(System.in);
        System.out.print("number: ");
        int number=sc.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " Even Number");
        } else {
            System.out.println(number + " Odd Number");
        }
        System.out.println("BYE");
    }
}
