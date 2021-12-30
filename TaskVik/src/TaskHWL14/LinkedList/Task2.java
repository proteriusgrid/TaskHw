package TaskHWL14.LinkedList;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");
        linkedList1.add("Porsche");

        for (String e :linkedList1){
            System.out.println(e);
        }
    }
}
