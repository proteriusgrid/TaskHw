import java.util.Scanner;

public class TaskHW_2 {
    public static void main( String[] args ) {
        int minsInHour=60;
        int hourInDay= 24;
        int dayInYear =365;

        int minutesInDay = minsInHour*hourInDay;
        int minutesInYear = minsInHour*hourInDay*dayInYear;


        Scanner scanner= new Scanner(System.in);
        System.out.print("Input the number of minutes:  ");

        int minutes = scanner.nextInt();
        int days =(minutes / minutesInDay)%dayInYear;
        int years = (minutes / minutesInYear);

        System.out.println("The "+ minutes + " minutes is approximately " + years +" years and " + days +" days.");
    }
}
