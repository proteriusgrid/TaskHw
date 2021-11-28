package TaskHWL6.THW6;

import java.util.Arrays;

public class Taskhw4_3 {
    // Function to count total number
    // of words in the string
    public static int
    countWords(String[] arr)
    {

        // Check if the string is null
        // or empty then return zero
        if(!(arr != null && ! Arrays.stream(arr).isParallel())) {
            return 0;
        }

        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = arr.length- 1;

        // Converting the given string
        // into a character array
//        char[] ch = arr.toString();

        for (int i = 0; i < arr.length; i++) {

            // Check if the character is a letter
            // and index of character array doesn't
            // equal to end of line that means, it is
            // a word and set isWord by true
            if (Character.isLetter(Integer.parseInt(arr[i]))
                    && i != endOfLine) {
                isWord = true;
            }

                // Check if the character is not a letter
                // that means there is a space, then we
                // increment the wordCount by one and set
                // the isWord by false
            else if (!Character.isLetter(Integer.parseInt(arr[i]))
                    && isWord) {

                wordCount++;
                isWord = false;
            }

            // Check for the last word of the
            // sentence and increment the wordCount
            // by one
            else if (Character.isLetter(Integer.parseInt(arr[i]))
                    && i == endOfLine)
                wordCount++;
        }

        // Return the total number of
        // words in the string
        return wordCount;

    }

    // Driver Code
    public static void main(String args[])
    {

        // Given String str
        String[] arr ={"One two three\n four\tfive "};

        // Print the result
        System.out.println("No of words : " +countWords(arr));
    }
}


