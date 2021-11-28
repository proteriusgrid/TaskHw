package TaskHWL6;

import java.util.Scanner;

public class TaskHW2 {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String string = sc.nextLine();

        int count;
        int j = 1;
        char var = 'a';
        char ch[] = string.toCharArray();
        while (j <= 26) {
            count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (ch[i] == var || ch[i] == var - 32) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Frequency of " + var + " is " + count);
            }
            var++;
            j++;

        }
    }
}
