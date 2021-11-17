package TaskHWL4;

import java.util.Scanner;

public class TaskHW_3 {
    public static void main( String[] args ) {
        int i;
        int size;
        int minValue;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        size = sc.nextInt();

        int nmberArray [] = new int[size];

        System.out.print("Enter array elements : ");
        for (i = 0; i <size; i++ ){
            nmberArray[i]= sc.nextInt();
        }
        System.out.println("Searching for the Smallest Element....\\n\\n");

        minValue=nmberArray[0];
        for (i = 0; i < size; i++ ){
            if (minValue > nmberArray[i]){
                minValue = nmberArray[i];
            }
        }
        System.out.println("Smallest Element = " + minValue);

    }
}
