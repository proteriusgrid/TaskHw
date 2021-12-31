package TaskHWL15.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap1 =new HashMap<Integer,String>();
        hashMap1.put(1, "Audi");
        hashMap1.put(2, "BMW");
        hashMap1.put(3, "Bugatti");
        hashMap1.put(4, "Alfa Romeo");
        hashMap1.put(5, "Jaguar");
        hashMap1.put(6, "Tesla");
        hashMap1.put(7, "Jaguar");

        for (Map.Entry x : hashMap1.entrySet()){
            System.out.println(x.getKey() + ". " + x.getValue());

        }
    }
}
