package TaskHWL8;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumber {

    public static void main( String[] args )throws ArithmeticException {
    }

    public  void checkEvenNumber() throws ArithmeticException{
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH.US);
        System.out.print("number: ");
        double number = sc.nextDouble();

        if ((number % 1) == 0) {
            if (isEven(number) == true) {
                System.out.print("Even");
            }else {
                System.out.print("Odd");
            }

        } else  {
            throw new ArithmeticException("The number entered is not an integer. ");
        }

    }


    public static boolean isEven(double number)   {
        return (number % 2 == 0);

    }



}
