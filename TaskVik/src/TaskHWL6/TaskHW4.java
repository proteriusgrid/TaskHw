package TaskHWL6;

import java.util.Scanner;

public class TaskHW4 {
    static  String countWordsLength(String string) {

        String words[] = string.split("\\s+");
        int wordCount = words.length;
        System.out.println("Words counter:  " + wordCount);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();;
            sb.append(words[i] + " : " + ch.length + "\n");

        }
        return sb.toString();
    }

    public static void main( String[] args )
    {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter string:");

        String text = str.nextLine();
        System.out.println(countWordsLength(text));
    }
}


