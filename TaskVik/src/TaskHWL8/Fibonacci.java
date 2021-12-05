package TaskHWL8;

import java.util.Scanner;

public class Fibonacci {
    static void printFibonacciNumbers(long n)
    {
        long f1 = 0;
        long f2 = 1;
        long  i;

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


    }

    public void doFibonacciNumbers() {

        Scanner sc= new Scanner(System.in);
        System.out.print("number: ");
        long n= sc.nextLong();

        printFibonacciNumbers(n);
    }
}
