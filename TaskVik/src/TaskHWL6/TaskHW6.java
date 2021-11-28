package TaskHWL6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskHW6 {

    public static void main(String[] args){
        System.out.println("Your code validation is");
        System.out.println(randomString());
    }

    public static String randomString() {
        String newString = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
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
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp1 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp1;
        }
        for (int i = 0; i < 3; i++) {
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp2 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp2;
        }
        for (int i = 0; i < 1; i++) {
            sTemp3 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp3;
        }
        for (int i = 0; i < 2; i++) {
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp4 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp4;
        }
        for (int i = 0; i < 2; i++) {
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp5 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp5;
        }
        for (int i = 0; i < 3; i++) {
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
        }
        for (int i = 0; i < 1; i++) {
            sTemp6 += digits.charAt((int) (Math.random() * digits.length() + 0));
            newString += sTemp6;
        }
        for (int i = 0; i < 2; i++) {
            newString += letters.charAt((int) (Math.random() * letters.length() + 0));
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
