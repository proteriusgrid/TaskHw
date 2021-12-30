package TaskHWL14.ArrayList;

import java.util.ArrayList;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> arrList1= new ArrayList<String>();

        arrList1.add("Audi");
        arrList1.add("BMW");
        arrList1.add("Bugatti");
        arrList1.add("Ford");
        arrList1.add("GMC");
        arrList1.add("Tesla");
        arrList1.add("Porsche");

        ArrayList<String> arrList2= new ArrayList<String>();

        arrList2.add("Audi");
        arrList2.add("BMW");
        arrList2.add("Bugatti");

        arrList2.add("Tesla");
        arrList2.add("Porsche");

        ArrayList<String> arrList3= new ArrayList<String>();

        for (String object: arrList1)
            arrList3.add(arrList2.contains(object) ? "Yes" : "No");
        System.out.println(arrList3);



    }


}
