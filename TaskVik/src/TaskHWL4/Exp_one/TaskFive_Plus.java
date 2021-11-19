
package Exp_one;
import java.lang.*;
import java.io.*;
import java.util.*;
public class TaskFive_Plus {

    public static void main(String[] args)
    {
        {
            String input = "dlrow olleH";

            // convert String to character array
            // by using toCharArray
            char[] string = input.toCharArray();

            for (int i = string.length - 1; i >= 0; i--)
                System.out.print(string[i]);
        }
    }
}
