package TaskHWL3;

import java.util.Scanner;

public class TaskHW_4 {
    public static void main( String[] args ) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x = ");
        int x=sc.nextInt();

        System.out.print("y = ");
        int y=sc.nextInt();

        if (x > y){
            System.out.println("The number x has the greatest value.");

        }else if (x < y){
            System.out.println("The number x has the lowest value.");

        }else {
            System.out.println("The numbers x and y are equal.");
        }

    }
}
