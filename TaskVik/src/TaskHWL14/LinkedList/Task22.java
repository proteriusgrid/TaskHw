package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task22 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Porsche");

        System.out.println("Original linked list:" + linkedList1);

        if (linkedList1.contains("Tesla")) {
            System.out.println("Brand Tesla is present in the linked list. ");
        }else {
            System.out.println("Brand Tesla is not present in the linked list.");
        }


        if (linkedList1.contains("Bugatti")) {
            System.out.println("Brand Bugatti is present in the linked list. ");
        }else {
            System.out.println("Brand Bugatti is not present in the linked list.");
        }



    }
}
