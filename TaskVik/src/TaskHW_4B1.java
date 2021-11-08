import java.util.Scanner;

public class TaskHW_4B1 {
    public static void main( String[] args ) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");

        float meters=scanner.nextFloat();
        System.out.print("Input hour: ");

        float hours = scanner.nextFloat();
        System.out.print("Input minutes: ");

        float minutes = scanner.nextFloat();
        System.out.print("Input seconds: ");

        float seconds=scanner.nextFloat();
        float result=(hours*3600)+(minutes*60)+seconds;

        System.out.println("Your speed in meters per second (meters/second) is "+(meters/result));
        System.out.println("Your speed in kilometers per hour (km/h) is "+(meters*3600)/(result*1000));
    }
}
