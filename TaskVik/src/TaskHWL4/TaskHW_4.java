package TaskHWL4;

public class TaskHW_4 {
    public static void main(String args[])
    {
        int array[] = { 55, 34, 26, 13, 21, 9, 72 };
        int n = array.length;
        bubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array, array.length);
    }

    public static void bubbleSort( int array[] )
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < array.length - 1; i++)
        {
            swapped = false;
            for (j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }

    public static void printArray(int array[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }



}

