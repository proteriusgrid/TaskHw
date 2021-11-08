import java.util.Scanner;

public class TaskHW_2 {
    public static void main( String[] args ) {
        int hour=60;
        int day= 24;
        int year =365;

        int minutes_in_day = hour*day;
        int minutes_in_year = hour*day*year;


        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the number of minutes:  ");

        int minutes = scanner.nextInt();
        int days =(minutes / minutes_in_day)%year;
        int years = (minutes / minutes_in_year);

        System.out.println("The "+ minutes + " minutes is approximately " + years +" years and " + days +" days.");
    }
}
