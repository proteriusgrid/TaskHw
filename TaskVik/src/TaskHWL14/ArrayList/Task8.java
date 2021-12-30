package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> Strings_ListBrand= new ArrayList<>();
        Strings_ListBrand.add("Audi");
        Strings_ListBrand.add("BMW");
        Strings_ListBrand.add("Bugatti");
        Strings_ListBrand.add("Ford");
        Strings_ListBrand.add("GMC");
        Strings_ListBrand.add("Tesla");
        Strings_ListBrand.add("Porsche");

        System.out.println("Brand car list before sort: " + Strings_ListBrand);
        Collections.sort(Strings_ListBrand);
        System.out.println("Brand car list after sort: "+ Strings_ListBrand);


    }
}
