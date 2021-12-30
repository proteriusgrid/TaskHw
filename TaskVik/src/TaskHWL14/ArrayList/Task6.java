package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
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

        Strings_ListBrand.remove(4);

        System.out.println("After removing fifth element from the list: " + Strings_ListBrand);

    }
}
