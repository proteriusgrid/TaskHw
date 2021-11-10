package TaskHWL3;

import java.util.Scanner;

public class CheckPassFail {
    public static void main( String[] args ) {

        Scanner sc= new Scanner(System.in);
        System.out.print("mark: ");

        int mark = sc.nextInt();
//        int  mark= 48;


        if (mark>=50){
            System.out.println("PASS"+" Done");
        }else {
            System.out.println("FAIL"+" Done");
        }

    }
}
