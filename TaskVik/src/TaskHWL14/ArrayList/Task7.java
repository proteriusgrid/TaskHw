package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> Strings_ListBrand= new ArrayList<>();
        Strings_ListBrand.add("Audi");
        Strings_ListBrand.add("BMW");
        Strings_ListBrand.add("Bugatti");
        Strings_ListBrand.add("Ford");
        Strings_ListBrand.add("GMC");
        Strings_ListBrand.add("Tesla");
        Strings_ListBrand.add("Porsche");

        System.out.println(Strings_ListBrand);

        if (Strings_ListBrand.contains("Bugatti")) {
            System.out.println("Found the element." );
        } else {
            System.out.println("There is no such element.");
        }
    }
}
