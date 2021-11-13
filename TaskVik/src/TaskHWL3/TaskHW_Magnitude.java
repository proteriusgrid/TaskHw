package TaskHWL3;

import java.util.Scanner;

public class TaskHW_Magnitude {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a=sc.nextInt();

        System.out.print("b = ");
        int b=sc.nextInt();

        if (Math.abs(a) > Math.abs(b)){
            System.out.println("a > b");
        }else if (Math.abs(a) < Math.abs(b)){
            System.out.println("a < b");
        }else {
            System.out.println("a = b");
        }
    }
}
