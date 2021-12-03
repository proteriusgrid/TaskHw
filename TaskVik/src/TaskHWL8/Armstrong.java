package TaskHWL8;

import java.util.Scanner;

public class Armstrong {

    //    public void isArmstrong(String n)
// char[] s=n.toCharArray();
//    int size=s.length;
//    int sum=0;
//    for(char num:s)
//    {int temp=1;
//        int i=Integer.parseInt(Character.toString(num));
//        for(int j=0;j<=size-1;j++)
//
//        { temp *=i;}
//        sum +=temp;
//    }
//    if(sum==Integer.parseInt(n))
//    {
//        System.out.println("True");
//    }
//    else
//    {
//        System.out.println("False");
//    }
//}
//    public static void main(String[] args)
//    {
//        Armstrong amrmstrong= new Armstrong();
//        amrmstrong.isArmstrong("73");
//        amrmstrong.isArmstrong("371");
//        amrmstrong.isArmstrong("8208");
//
//
//    }

public static void main(String[] args) {

    int number ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    number= sc.nextInt();
    int originalNumber;
    int remainder;
    int result = 0;

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, 3);
        originalNumber /= 10;
    }

    if(result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");


    }
}

