package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> Strings_ListBrand= new ArrayList<>();
        Strings_ListBrand.add("Audi");
        Strings_ListBrand.add("BMW");
        Strings_ListBrand.add("Bugatti");
        Strings_ListBrand.add("Ford");
        Strings_ListBrand.add("GMC");
        Strings_ListBrand.add("Tesla");
        Strings_ListBrand.add("Porsche");

        System.out.println("Brand list before reversing: ");
        printListBrand(Strings_ListBrand);

        Collections.reverse(Strings_ListBrand);
        System.out.println("\nBrand list after reversing: ");
        printListBrand(Strings_ListBrand);

    }
    public static void printListBrand(ArrayList<String> arrayList){

        for (int i = 0; i <arrayList.size(); i++){
            System.out.print(arrayList.get(i)+ " ");
        }
    }

}
