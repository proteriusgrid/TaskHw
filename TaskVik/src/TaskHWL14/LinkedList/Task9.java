package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task9 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Ford");
        linkedList1.add("GMC");


        LinkedList<String> linkedList2 =new LinkedList<String>();
        linkedList2.add("Bugatti");
        linkedList2.add("Tesla");
        linkedList2.add("Porsche");

        linkedList1.addAll(2,linkedList2);
        System.out.println("LinkedList: " + linkedList1);
    }
}
