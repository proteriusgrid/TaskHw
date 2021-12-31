package TaskHWL15.HashMap;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap1 =new HashMap<Integer,String>();
        hashMap1.put(1, " Audi");
        hashMap1.put(2, " BMW");
        hashMap1.put(3, " Bugatti");
        hashMap1.put(4, " Alfa Romeo");
        hashMap1.put(5, " Jaguar");
        hashMap1.put(6, " Tesla");
        hashMap1.put(7, " Jaguar");

        System.out.println("Initial Mappings are: " + hashMap1);

        System.out.println("Size of the hash map: " + hashMap1.size());

    }
}
