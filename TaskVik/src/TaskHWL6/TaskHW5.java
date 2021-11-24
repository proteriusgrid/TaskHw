package TaskHWL6;

public class TaskHW5 {
    static void removeChar(String string, char c)
    {
        int j;
        int  count = 0;
        int n = string.length();
        char []k = string.toCharArray();
        for (int i = j = 0 ; i < n; i++)
        {
            if (k[i] != c)
                k[j++] = k[i];
            else
                count++;
        }

        while(count > 0)
        {
            k[j++] = '\0';
            count--;
        }

        System.out.println(k);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String string = "Hello world ";
        removeChar(string, 'l');
    }
}
