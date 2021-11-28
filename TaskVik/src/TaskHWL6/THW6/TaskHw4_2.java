package TaskHWL6.THW6;

public class TaskHw4_2 {
    public static void main( String[] args ) {
        int count=0;
        boolean word= false;
        String[] arr =  {"how ma ny wo rds are th ere in th is sente nce"} ;
//        char[] ch = arr.toString();
        for(int i =0;i<arr.length;i++)
            if (!(arr[i] == " ")) {
                for (int j = i; j < arr.length; j++, i++) {
                    if (!(arr[j] == " ")) {
                        word = true;
                        if (j == arr.length - 1) {
                            count++;
                        }
                        continue;
                    } else {
                        if (word) {
                            count++;
                        }
                        word = false;
                    }
                }
            } else {
                continue;
            }
        System.out.println("there are "+ (count) +" words");
    }
}
