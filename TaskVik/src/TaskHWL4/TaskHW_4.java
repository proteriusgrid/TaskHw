package TaskHWL4;

import java.util.Arrays;

public class TaskHW_4 {
    public static void main( String[] args ) {

        int [] array = {1, 4, 30, 50, 20, 8, 9, 18};
        Arrays.sort(array);

        int[] minimumMaximumSorted= new int[array.length];
        for (int i = 0, min = 0, max = array.length - 1; i < array.length; i += 2, min++, max--){
            minimumMaximumSorted[i] = array[min];
            if (i + 1<minimumMaximumSorted.length){
                minimumMaximumSorted[i +1] = array[max];
            }
        }
        System.out.println(Arrays.toString(minimumMaximumSorted));
    }
}
