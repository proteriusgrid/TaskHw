package TaskHWL6;

public class TaskHW7 {
    static void printRotatedString(String string)
    {
        int len = string.length();
        StringBuffer stringBuffer;

        for (int i = 0; i < len; i++)
        {
            stringBuffer = new StringBuffer();
            int j = i;
            int k = 0;
            for (int k2 = j; k2 < string.length(); k2++) {
                stringBuffer.insert(k, string.charAt(j));
                k++;
                j++;
            }
            j = 0;
            while (j < i)
            {
                stringBuffer.insert(k, string.charAt(j));
                j++;
                k++;
            }
            System.out.println(stringBuffer);
        }
    }

    public static void main(String[] args)
    {
        String  string = new String("help");
        printRotatedString(string);
    }
}
