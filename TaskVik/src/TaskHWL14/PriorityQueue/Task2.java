package TaskHWL14.PriorityQueue;

import java.util.PriorityQueue;

public class Task2 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();

        priorityQueue1.add("Nissan");
        priorityQueue1.add("Audi");
        priorityQueue1.add("BMW");
        priorityQueue1.add("Volvo");
        priorityQueue1.add("Bugatti");

        System.out.println("Original Priority Queue: "+ priorityQueue1);

        String string;
        string = priorityQueue1.toString();
        System.out.println("String representation of the Priority Queue: " + string);

    }
}
