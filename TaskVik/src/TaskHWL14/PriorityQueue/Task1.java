package TaskHWL14.PriorityQueue;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();

        priorityQueue1.add(12);
        priorityQueue1.add(24);
        priorityQueue1.add(38);
        priorityQueue1.add(26);
        priorityQueue1.add(13);
        priorityQueue1.add(72);
        priorityQueue1.add(87);
        priorityQueue1.add(98);
        priorityQueue1.add(18);

        System.out.println("Original Priority Queue:: " +priorityQueue1);
        System.out.println("The first element of the Queue: "+ priorityQueue1.peek());
    }
}

//(Task 8 - Write a Java program to retrieve the first element of the priority queue.)