package TaskHWL6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskHW6 {
//    v0.9

//    public static void main( String[]args){
//    Scanner kb=new Scanner(System.in);//creates Scanner for user input
//    String userentry=kb.nextLine();   //Takes users input as a string
//    String result="Valid";            //Variable for if the code is Valid
//
//    int DoubleCounter=0;              //Counter for number of ints
//    double newdouble;
//    List<Double> NumberList =  new ArrayList<Double>(); //Creates Array List for tracking Doubles
//
//    for(int i=0;i<userentry.length();i++){              //checks length of Users input
//        if(Character.isLowerCase(userentry.codePointAt(i))){  //checks if its a Lowercase letter
//            result="Fail";                              //Changes result variable
////            if (!Integer.parseInt(userentry, i)) {
//                continue;
//            }              //checks if character from input is a valid integer
//            DoubleCounter+=1;                           //Adds to DoubleCounter
//            newdouble=userentry.charAt(i);              //Isolates character
//            NumberList.add(newdouble);                  //Adds it to List of doubles
//        }
//    }
//  }

//    v1.1

    public static void main(String[] args){
        System.out.println("Your product code validation is");
        System.out.println(randomString());
    }

    public static String randomString() {
        String newString = "";
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2 = "0123456789";
        String sTemp1 = "";
        String sTemp2 = "";
        String sTemp3 = "";
        String sTemp4 = "";
        String sTemp5 = "";
        String sTemp6 = "";
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        for (int i = 0; i < 2; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }

        for (int i = 0; i < 1; i++) {
            sTemp1 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp1;
        }
        for (int i = 0; i < 3; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp2 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp2;
        }
        for (int i = 0; i < 1; i++) {
            sTemp3 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp3;
        }
        for (int i = 0; i < 2; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp4 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp4;
        }
        for (int i = 0; i < 2; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp5 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp5;
        }
        for (int i = 0; i < 3; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp6 += str2.charAt((int) (Math.random() * str2.length() + 0));
            newString += sTemp6;
        }
        for (int i = 0; i < 2; i++) {
            newString += str1.charAt((int) (Math.random() * str1.length() + 0));
        }
        sTemp1 += sTemp2;
        sTemp3 += sTemp4;
        sTemp5 += sTemp6;
        temp1 = Integer.parseInt(sTemp1);
        temp2 = Integer.parseInt(sTemp3);
        temp3 = Integer.parseInt(sTemp5);
        int temp4 = temp1 * temp2 * temp3;

        newString += " " + Integer.toString(temp4);

        return newString;
    }




}
