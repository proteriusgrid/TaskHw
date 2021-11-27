package TaskHWL6;

public class TaskLes2 {
    static String getNumericString(int n)
    {

        // chose a Character random from this String
        String NumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"+ "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of NumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to NumericString variable length
            int index = (int)(NumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(NumericString.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        // Get the size n
        int n = 50;
        // Get and display the numeric string
        System.out.println(TaskLes2.getNumericString(n));
    }
}
