package TaskHWL14.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task4 {
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

        Iterator iterator =linkedList1.descendingIterator();
        System.out.println("Elements in reverse order: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
