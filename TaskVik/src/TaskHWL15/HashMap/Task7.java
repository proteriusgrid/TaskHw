package TaskHWL15.HashMap;

import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap1 =new HashMap<String,Integer>();
        hashMap1.put("Audi", 1);
        hashMap1.put("BMW", 2);
        hashMap1.put("Bugatti", 3);
        hashMap1.put("Alfa Romeo", 4);
        hashMap1.put("Jaguar", 5);
        hashMap1.put("Tesla", 6);

        System.out.println("The Original map: "+ hashMap1);

        System.out.println("1. Is key 'Bugatti' exists?");

        if (hashMap1.containsKey("Bugatti")) {
            System.out.println("yes! - "+ hashMap1.get("Bugatti"));
        }else {
            System.out.println("no! ");

        }

        System.out.println("\n2. Is key 'VW' exists? ");
        if (hashMap1.containsKey("VW")){
            System.out.println("yes! - "+ hashMap1.get("VW"));
        }else {
            System.out.println("no! ");
        }





    }
}
