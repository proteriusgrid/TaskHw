package TaskHWL14.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task23 {
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
        List<String> newList = new ArrayList<String>(linkedList1);

        for (String string : newList){
            System.out.println(string);
        }

    }
}
