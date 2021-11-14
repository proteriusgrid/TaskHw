package TaskHWL3;

import java.util.Scanner;

public class TaskHW_5   {

    public static void main( String[] args ) {

        Scanner sc=new Scanner(System.in);

        System.out.print("a = ");
        int a=sc.nextInt();

        System.out.print("b = ");
        int b=sc.nextInt();

        double x;

        if (a == 0){
            System.out.println("x is not defined");
        }else if (b == 0){
            System.out.println("x = 0");
        }else  {
            x=-b / a;
            System.out.println("x= " + x);
        }
    }
}

