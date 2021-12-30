package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<String> Strings_ListModel1= new ArrayList<>();
        Strings_ListModel1.add("Model 11");
        Strings_ListModel1.add("Model 12");
        Strings_ListModel1.add("Model 13");
        Strings_ListModel1.add("Model 14");
        System.out.println("Strings_ListModel1 : " + Strings_ListModel1);

        List<String> Strings_ListModel2= new ArrayList<>();
        Strings_ListModel2.add("Model 21");
        Strings_ListModel2.add("Model 22");
        Strings_ListModel2.add("Model 23");
        Strings_ListModel2.add("Model 24");
        System.out.println("Strings_ListModel2 : " + Strings_ListModel2);

        Collections.copy(Strings_ListModel1, Strings_ListModel2);
        System.out.println("Copy Strings_ListModel1 to Strings_ListModel2. ");
        System.out.println("After copy: ");
        System.out.println("Strings_ListModel1 : " + Strings_ListModel1);
        System.out.println("Strings_ListModel2 : " + Strings_ListModel2);



    }
}
