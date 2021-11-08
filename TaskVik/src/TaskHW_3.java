import java.util.Scanner;

public class TaskHW_3 {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        int pounds = input.nextInt();

        System.out.println("Input height in inches: ");
        int inches = input.nextInt();

        double constant1=0.45359237;
        double constant2=0.0254;
        double BMI = pounds * constant1 / (inches * constant2* inches * constant2);
        System.out.print("Body Mass Index is " + BMI);


    }
}
