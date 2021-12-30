package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> Strings_ListBrand= new ArrayList<>();
        Strings_ListBrand.add("Audi");
        Strings_ListBrand.add("BMW");
        Strings_ListBrand.add("Bugatti");
        Strings_ListBrand.add("Ford");
        Strings_ListBrand.add("GMC");
        Strings_ListBrand.add("Tesla");
        Strings_ListBrand.add("Porsche");

        System.out.println("Before shuffling Brand List :");

        Iterator itr =Strings_ListBrand .iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
        Collections.shuffle(Strings_ListBrand);

        System.out.println("After shuffling Brand List :");
        itr = Strings_ListBrand.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next()+ " ");

        }
    }
}
