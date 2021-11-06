import java.util.Scanner;

public class TaskHM_1 {
    public static void main( String[] args ) {
        System.out.println("Input a value for inch: ");
        Scanner scanner=new Scanner(System.in);
        int inch ;
        inch = scanner.nextInt();
        double meter;
        meter = inch *  0.0254;
        System.out.println(inch + ".0 inch is " + meter + " meters");
    }
}
