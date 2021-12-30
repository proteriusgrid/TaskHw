package TaskHWL14.TreeSet;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_number = new TreeSet<Integer>();
        TreeSet <Integer>treeHeadSet = new TreeSet<Integer>();

        tree_number.add(12);
        tree_number.add(24);
        tree_number.add(38);
        tree_number.add(26);
        tree_number.add(13);
        tree_number.add(72);
        tree_number.add(87);
        tree_number.add(98);
        tree_number.add(18);
        System.out.println("Original tree set: "+tree_number);

        System.out.println("Removes the first (lowest) element: "+tree_number.pollFirst());
        System.out.println("Tree set after removing first element: "+tree_number);
    }
}


//(Task 14 - Write a Java program to retrieve and remove the first element of a tree set. )