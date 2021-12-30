package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task17 {
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
        arrList1.removeAll(arrList1);
        System.out.println("Array list after remove all elements: " + arrList1);
    }
}
