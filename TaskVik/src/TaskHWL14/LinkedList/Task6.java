package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Ford");
        linkedList1.add("Tesla");
        linkedList1.add("GMC");
        System.out.println("Original linked list: " + linkedList1);

        linkedList1.addFirst("Bugatti");
        linkedList1.addLast("Porsche");
        System.out.println("Final linked list: " + linkedList1);
    }
}
