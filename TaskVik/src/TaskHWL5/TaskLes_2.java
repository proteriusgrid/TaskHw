package TaskHWL5;

public class TaskLes_2 {

    static int accumulate(int []array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int array[] = {12, 3, 4, 15};
        int n = array.length;

        // calling accumulate function, passing first, last element and
        // initial sum, which is 0 in this case.
        System.out.print("Sum of given array is " +  accumulate(array));
    }




}
