package TaskHWL8;

import java.util.Scanner;

public class EvenNumber {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        if (isEven(number) == true)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }

    public static boolean isEven(int number) {

        return (number % 2 == 0);
    }
}
