package TaskHWL3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number: ");
        int number=sc.nextInt();

//        int number=26;

        if (number % 2 == 0){
            System.out.println(number + " Even Number");
        } else {
            System.out.println(number + " Odd Numbe");
        }
        System.out.println("BYE");
    }
}
