package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<String> ArrayList= new ArrayList<String>();

        ArrayList.add("Audi");
        ArrayList.add("BMW");
        ArrayList.add("Bugatti");
        ArrayList.add("Ford");
        ArrayList.add("GMC");
        ArrayList.add("Tesla");
        ArrayList.add("Porsche");

        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrayList);

        Collections.swap(ArrayList , 0, 6);
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrayList);
    }
}
