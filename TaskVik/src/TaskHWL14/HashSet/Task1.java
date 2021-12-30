package TaskHWL14.HashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> hashSet1 =new HashSet<String>();
        hashSet1.add("Audi");
        hashSet1.add("BMW");
        hashSet1.add("Bugatti");
        hashSet1.add("Ford");
        hashSet1.add("GMC");
        hashSet1.add("Tesla");
        hashSet1.add("Porsche");
        System.out.println("Original Hash Set: "+ hashSet1);

        String[] new_arr = new String[hashSet1.size()];
        hashSet1.toArray(new_arr);

        System.out.println("Array elements: ");
        for (String e :new_arr){
            System.out.println(e);
        }
    }
}


//    (Task 7 - Write a Java program to convert a hash set to an array.)