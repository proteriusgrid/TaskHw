package TaskHWL3;

import java.util.Scanner;

public class TaskHW_5   {

    public static void main( String[] args ) {


//       ?
        Scanner sc=new Scanner(System.in);

        System.out.print("a = ");
        int a=sc.nextInt();

        System.out.print("b = ");
        int b=sc.nextInt();
//        int a=0;
//        int b=0;


        int x=-b%a;

        if (a == 0){
            System.out.println(x);
        }else if (b == 0){
            System.out.println(x);
        }else {
            System.out.println(x);
        }
    }
}

