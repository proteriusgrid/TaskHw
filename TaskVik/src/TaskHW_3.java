import java.util.Scanner;

public class TaskHW_3 {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        int pounds = input.nextInt();

        System.out.print("Input height in inches: ");
        int inches = input.nextInt();

        double  conversionFactor1=0.45359237;
        double  conversionFactor2=0.0254;
        double BMI = pounds *  conversionFactor1/(inches*conversionFactor2*inches*conversionFactor2);
        System.out.print("Body Mass Index is " + BMI);

    }
}
