package TaskHWL5;

import java.util.Scanner;

public class TaskLes_1 {

    static boolean evenCheck(int x){

        if(x % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("x: ");
        int x=sc.nextInt();
        System.out.println(evenCheck(x));
        }

}


