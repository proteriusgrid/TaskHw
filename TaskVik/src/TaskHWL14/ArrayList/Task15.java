package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");
        arrList1.add("GMC");
        arrList1.add("Tesla");
        arrList1.add("Porsche");
        System.out.println("List of first array: " + arrList1);

        ArrayList<String> arrList2= new ArrayList<String>();

        arrList2.add("Audi");
        arrList2.add("BMW");
        arrList2.add("Bugatti");
        arrList2.add("Tesla");
        arrList2.add("Porsche");
        System.out.println("List of second array: " + arrList2);

        ArrayList<String> arrList3= new ArrayList<String>();

        arrList3.addAll(arrList1);
        arrList3.addAll(arrList2);
        System.out.println("New array: " + arrList3);

    }
}
