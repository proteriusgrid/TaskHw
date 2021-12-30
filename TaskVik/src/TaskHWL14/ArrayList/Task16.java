package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");
        arrList1.add("GMC");
        arrList1.add("Tesla");
        arrList1.add("Porsche");

        System.out.println("Original ArrayList 1 = "  + arrList1);
        ArrayList arrayList2 = (ArrayList)arrList1.clone();

        System.out.println("Clone ArrayList 2 = "+ arrayList2);
    }
}
