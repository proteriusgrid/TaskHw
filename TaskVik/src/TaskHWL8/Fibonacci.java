package TaskHWL8;

import java.util.Scanner;

public class Fibonacci {
    static void printFibonacciNumbers(long n)
    {
        long f1 = 0, f2 = 1, i;

        if (n < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < n; i++)
        {
            System.out.print(f2 + " ");
            long next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
         System.out.print("number: ");
         long n= sc.nextLong();
////            long n = 12;
//            System.out.println(Armstrong(n));
        printFibonacciNumbers(n);

    }
}
