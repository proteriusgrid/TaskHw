package TaskHWL14.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");
        linkedList1.add("Porsche");

        Iterator p = linkedList1.listIterator(1);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}