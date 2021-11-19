package Exp_one;
public class TaskFive {
//    public static void reverse(char string[])
//    {
//
//
//    }


    public static void main(String[] args)
    {

        String String = new String(System.in);
        String string = "dlrow olleH";
        char[] charArray = string.toCharArray();


        System.out.println("Input string: " + string);
        int i = string.length() - 1, j = 0;


        while (j < i)
        {

            if (Character.isAlphabetic(string[j])) {
                if (Character.isAlphabetic(string[i])) {
                    char temp = string[j];
                    string[j] = string[i];
                    string[i] = temp;
                    j++;
                }
                i--;
            } else {
                j++;
            }
        }
        String reverseString = new String(charArray);

        System.out.println("Output string: " + reverseString);
    }
}
