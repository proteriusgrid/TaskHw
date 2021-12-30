package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task26 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");


        System.out.println("Original linked list:" + linkedList1);

        linkedList1.set(2,"Porsche");
        System.out.println("The value of third element changed.");
        System.out.println("New linked list: "+ linkedList1);
    }
}
