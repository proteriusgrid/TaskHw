package TaskHWL6.THW6_old;

public class TaskHW1_no {
    static String convert(String string)
    {

        // Create a char array of given String
        char ch[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {

            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                    ch[i] != ' ' && ch[i - 1] == ' ') {

                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {

                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z')

                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');
        }

        // Convert the char array to equivalent String
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args)
    {
        String string = "hELLO wORLD !!!";
        System.out.println(convert(string));
    }
}
