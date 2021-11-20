package TaskHWL5;

import java.util.Scanner;

public class TaskLes_1 {

//        Scanner sc= new Scanner(System.in);
//        System.out.print("number: ");
//        int number=sc.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println(number + " Even Number");
//        } else {
//            System.out.println(number + " Odd Number");
//        }
//        System.out.println("BYE");
//
//    }
//    public  static  boolean
//    public static boolean   amountOfInstans(boolean firstBoolean,boolean secondBoolean){
//        return firstBoolean+secondBoolean ;

        public static boolean evenCheck(int x){
            if(x % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean primeCheck(int y){
            for(int i=2;i<y;i++){
                if(y % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("x: ");
        int x=sc.nextInt();
        System.out.println(evenCheck(x));


        System.out.print("y: ");
        int y=sc.nextInt();
        System.out.println(primeCheck(y));
        }


}


