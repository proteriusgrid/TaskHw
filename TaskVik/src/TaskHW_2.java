import java.util.Scanner;

public class TaskHW_2 {
    public static void main( String[] args ) {
        int minutes_in_day = 60*24;
        int minutes_in_year = 60*24*365;


        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the number of minutes:  ");

        int minutes = scanner.nextInt();
        int days =(minutes / minutes_in_day)%365;
        int years = (minutes / minutes_in_year);

        System.out.println("The "+ minutes + " minutes is approximately " + years +" years and " + days +" days.");
    }
}
