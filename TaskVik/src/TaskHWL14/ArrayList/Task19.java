package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task19 {
    public static void main(String[] args) {
        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");
        arrList1.add("GMC");
        arrList1.add("Tesla");
        arrList1.add("Porsche");

        System.out.println("Original array list: " + arrList1);
        System.out.println("Let trim to size the above array: ");
        arrList1.trimToSize();
        System.out.println(arrList1);
    }
}
