package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task22 {
    public static void main(String[] args) {
        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");
        arrList1.add("GMC");
        arrList1.add("Tesla");
        arrList1.add("Porsche");

        System.out.println("\nOriginal array list: " + arrList1);
        System.out.println("\nPrint using index of an element: ");

        int noOfElements = arrList1.size();
        for (int i=0; i <noOfElements; i++)
            System.out.println(arrList1.get(i));
    }
}
