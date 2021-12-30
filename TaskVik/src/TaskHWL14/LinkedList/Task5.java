package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");


        System.out.println("Original linked list: ");
        System.out.println("Let add the brand Porsche after the brand Audi: " + linkedList1);

        linkedList1.add(1, "Porsche");
        System.out.println("The linked list: " + linkedList1);
    }
}
