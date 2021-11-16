package TaskHWL4;

import java.util.Scanner;

public class TaskHW_3 {
    public static void main( String[] args ) {
        int i;
        int size;
        int small;
        int nmberArray [] = new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        size = sc.nextInt();


        System.out.print("Enter array elements : ");
        for (i = 0; i <size; i++ ){
            nmberArray[i]= sc.nextInt();
        }
        System.out.println("Searching for the Smallest Element....\\n\\n");

        small=nmberArray[0];
        for (i = 0; i < size; i++ ){
            if (small > nmberArray[i]){
                small = nmberArray[i];
            }
        }
        System.out.println("Smallest Element = " + small);

    }
}
