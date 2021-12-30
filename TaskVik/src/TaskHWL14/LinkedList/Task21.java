package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task21 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");
        linkedList1.add("Porsche");

        System.out.println("Original linked list:" + linkedList1);

        String p=linkedList1.peekLast();
        System.out.println("Last element in the list: " + p);
        System.out.println("Original linked list:" + linkedList1);

    }
}
