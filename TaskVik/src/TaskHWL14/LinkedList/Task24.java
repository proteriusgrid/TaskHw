package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task24 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");
        linkedList1.add("Porsche");

        LinkedList<String> linkedList2 =new LinkedList<String>();
        linkedList2.add("Bugatti");
        linkedList2.add("Tesla");
        linkedList2.add("Porsche");


        LinkedList<String> linkedList3 =new LinkedList<String>();

        for (String t: linkedList1)
            linkedList3.add(linkedList2.contains(t) ? "yes":"no");
        System.out.println(linkedList3);
    }
}
