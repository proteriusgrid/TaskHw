import java.util.Scanner;

public class TaskHW_3 {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        int pounds = input.nextInt();

        System.out.println("Input height in inches: ");
        int inches = input.nextInt();

        double BMI = pounds * 0.45359237 / (inches * 0.0254* inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI);


    }
}
