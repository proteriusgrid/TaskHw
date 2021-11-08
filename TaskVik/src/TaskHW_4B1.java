import java.util.Scanner;

public class TaskHW_4B1 {
    public static void main( String[] args ) {


        Scanner scanner = new Scanner(System.in);

        float timeSec;
        float mps,kph;

        System.out.print("Input distance in meters: ");

        float meters=scanner.nextFloat();

        System.out.print("Input hour: ");

        float hours = scanner.nextFloat();
        System.out.print("Input minutes: ");

        float minutes = scanner.nextFloat();
        System.out.print("Input seconds: ");

        float seconds=scanner.nextFloat();
        float result=(hours*3600)+(minutes*60)+seconds;

        timeSec = (hours*3600) + (minutes*60) + seconds;
        mps = meters / timeSec;
        kph = ( meters/1000.0f ) / ( timeSec/3600.0f );

        System.out.println("Your speed in meters per second (meters/second) is "+ mps);
        System.out.println("Your speed in kilometers per hour (km/h) is "+ kph);
    }
}
