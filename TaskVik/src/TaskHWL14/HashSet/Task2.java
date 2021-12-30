package TaskHWL14.HashSet;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        HashSet<String> hashSet1 =new HashSet<String>();
        hashSet1.add("Audi");
        hashSet1.add("BMW");
        hashSet1.add("Bugatti");
        hashSet1.add("Ford");
        hashSet1.add("GMC");
        hashSet1.add("Tesla");
        hashSet1.add("Porsche");
        System.out.println("Frist HashSet content:  "+ hashSet1);

        HashSet<String> hashSet2 =new HashSet<String>();
        hashSet1.add("Audi");
        hashSet1.add("BMW");
        hashSet1.add("Bugatti");
        hashSet1.add("Alfa Romeo");
        hashSet1.add("Jaguar");
        hashSet1.add("Mazda");
        hashSet1.add("Volvo");


        System.out.println("Second HashSet content:  " + hashSet2);
        hashSet1.retainAll(hashSet2);
        System.out.println("HashSet content: ");
        System.out.println(hashSet1);
    }
}


//    (Task 11 - Write a Java program to compare two sets and retain elements which are same on both sets.)