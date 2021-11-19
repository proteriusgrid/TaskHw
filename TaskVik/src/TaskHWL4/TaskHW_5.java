package TaskHWL4;

public class TaskHW_5 {
    public static void reverse(char string[])
    {
        int i = string.length - 1;
        int j = 0;
        while (j < i)
        {
            if (!Character.isAlphabetic(string[j]))
                j++;
            else if(!Character.isAlphabetic(string[i]))
                i--;
            else
            {
                char temp = string[j];
                string[j] = string[i];
                string[i] = temp;
                j++;
                i--;
            }
        }
    }

    public static void main(String[] args)
    {
        String string = "dlrow olleH";
        char[] charArray = string.toCharArray();

        System.out.println("Input string: " + string);
        reverse(charArray);
        String reverseString = new String(charArray);

        System.out.println("Output string: " + reverseString);
    }
}
