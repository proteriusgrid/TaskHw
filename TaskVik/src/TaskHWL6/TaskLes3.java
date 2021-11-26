package TaskHWL6;
import java.util.*;

import java.util.Random;
public class TaskLes3 {

    // Version 1.0
    private static final String dCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String uCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String sChar = "!@#$%^&*";
    private static final String intChar = "0123456789";
    private static Random r = new Random();
    private static StringBuilder pass = new StringBuilder();

    public static void main (String[] args) {
        System.out.println("Generating pass...");
        while (pass.length() != 16) {
            int rPick = r.nextInt(4);
            if (rPick == 0) {
                int spot = r.nextInt(26);
                pass.append(dCase.charAt(spot));
            } else if (rPick == 1) {
                int spot = r.nextInt(26);
                pass.append(uCase.charAt(spot));
            } else if (rPick == 2) {
                int spot = r.nextInt(8);
                pass.append(sChar.charAt(spot));
            } else {
                int spot = r.nextInt(10);
                pass.append(intChar.charAt(spot));
            }
        }
        System.out.println("Generated  " + pass.toString());

    }}
