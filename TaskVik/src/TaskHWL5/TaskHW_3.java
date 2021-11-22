package TaskHWL5;

import java.util.Scanner;

public class TaskHW_3 {

    static void numberArray( int numberArray[], int size ){
        int i;
        int minValue;
        minValue = numberArray[0];
        for (i = 0; i < size; i++) {
            if (minValue > numberArray[i]) {
                minValue = numberArray[i];
            }
        }
        System.out.println("Searching for the Smallest Element....\\n\\n");
        System.out.println("Smallest Element = " + minValue);
    }

    public static void main( String[] args ) {
        int i;
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        size = sc.nextInt();

        int numberArray[] = new int[size];

        System.out.print("Enter array elements : ");
        for (i = 0; i < size; i++) {
            numberArray[i] = sc.nextInt();
        }

        numberArray(numberArray, numberArray.length);
    }
}













