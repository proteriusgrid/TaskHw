package TaskHWL6;

public class TaskHW7 {

    // Print all the rotated string.
    static void printRotatedString(String str)
    {
        int len = str.length();

        StringBuffer stringBuffer;

        for (int i = 0; i < len; i++)
        {
            stringBuffer = new StringBuffer();

            int j = i;
            int k = 0;

            for (int k2 = j; k2 < str.length(); k2++) {
                stringBuffer.insert(k, str.charAt(j));
                k++;
                j++;
            }
            j = 0;
            while (j < i)
            {
                stringBuffer.insert(k, str.charAt(j));
                j++;
                k++;
            }

            System.out.println(stringBuffer);
        }
    }

    public static void main(String[] args)
    {
        String  str = new String("hello ");
        printRotatedString(str);
    }
}
