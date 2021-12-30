package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task21 {
    public static void main(String[] args) {

        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");

        System.out.println("Original array list: " + arrList1);
        String new_arrList = "Tesla";
        arrList1.set(3,new_arrList);

        int brand=arrList1.size();
        System.out.println("Replace the fourth brand with 'Tesla'.");
        for (int i = 0; i<brand; i++)
            System.out.println(arrList1.get(i));

    }
}
