package TaskHWL15.HashMap;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap1 =new HashMap<Integer,String>();
        hashMap1.put(1, " Audi");
        hashMap1.put(2, " BMW");
        hashMap1.put(3, " Bugatti");
        hashMap1.put(4, " Alfa Romeo");
        System.out.println("\nValues in first map: "+ hashMap1);

        HashMap<Integer,String> hashMap2 =new HashMap<Integer,String>();
        hashMap2.put(5, " Jaguar");
        hashMap2.put(6, " Tesla");
        hashMap2.put(7, " Jaguar");
        System.out.println("\nValues in second map: "+ hashMap2);

        hashMap2.putAll(hashMap1);
        System.out.println("\nNow values in second map: " + hashMap2);


    }


}
