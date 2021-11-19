package Exp_one;

public class TaskFour {

    public static void main(String args[])
        {
            int array[] = { 55, 34, 26, 13, 21, 9, 72 };
            int n = array.length;
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
            System.out.println("Sorted array: ");
//            int i;
            int size=array.length;
            for (i = 0; i < size; i++)
                System.out.print(array[i] + " ");
            System.out.println();
        }

//        public static void bubbleSort( int array[] )
//        {
//
//        }
//
//        public static void printArray(int array[], int size)
//        {
//
//        }

    }









