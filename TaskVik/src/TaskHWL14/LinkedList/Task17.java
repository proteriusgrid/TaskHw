package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task17 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Ford");
        linkedList1.add("GMC");

        System.out.println("List of first linked list: "+ linkedList1);

        LinkedList<String> linkedList2 =new LinkedList<String>();
        linkedList2.add("Bugatti");
        linkedList2.add("Tesla");
        linkedList2.add("Porsche");
        System.out.println("List of second linked list:" + linkedList2);

        LinkedList<String> linkedList3 =new LinkedList<String>();
        linkedList3.addAll(linkedList1);
        linkedList3.addAll(linkedList2);
        System.out.println("New linked list: " + linkedList3);
    }
}
