package TaskHWL6.THW6;

import java.util.Scanner;

public class TaskHw4_1 {
    public static void main( String[] args ) {


//    File file = new File("C:\\Users\\hp\\Desktop\\TextReader.txt");
//    FileInputStream fileInputStream = new FileInputStream(file);
//    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Scanner str = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter string:");

        String string = str.nextLine();  // Read user input

//        System.out.print("Input string: ");
//        Scanner scanner = new Scanner(System.in);
//        String value= scanner.next();
//
//        char[] array = value.toCharArray();

    String line;
    int wordCount = 0;
    int characterCount = 0;
    int paraCount = 0;
//    int whiteSpaceCount = 0;
    int sentenceCount = 0;

        while ((line = str.nextLine()) != null) {
        if (line.equals("")) {
            paraCount += 1;
        }
        else {
            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;
//            whiteSpaceCount += wordCount - 1;

            String sentence[] = line.split("[!?.:]+");
            sentenceCount += sentence.length;
        }
    }
        if (sentenceCount >= 1) {
        paraCount++;
    }
        System.out.println("Total word count = "+ wordCount);
//        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
//        System.out.println("Number of paragraphs = "+ paraCount);
//        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
}
}
