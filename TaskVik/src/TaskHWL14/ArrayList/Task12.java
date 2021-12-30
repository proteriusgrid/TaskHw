package TaskHWL14.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args)
            throws Exception {
        {
            try {
                ArrayList<String> arrListBrand= new ArrayList<>();

                arrListBrand.add("Audi");
                arrListBrand.add("BMW");
                arrListBrand.add("Bugatti");
                arrListBrand.add("Ford");
                arrListBrand.add("GMC");
                arrListBrand.add("Tesla");
                arrListBrand.add("Porsche");

                System.out.println("Original arrListBrand: "
                        + arrListBrand);
                List<String> arrListBrand2 = arrListBrand.subList(3,5);
                System.out.println("Sublist of  arrListBrand:" + arrListBrand2);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Exception thrown : " + e);
            }
            catch (IllegalArgumentException e){
                System.out.println("Exception thrown : " + e);
            }
        }

    }
}
