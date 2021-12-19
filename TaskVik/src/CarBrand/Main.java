package TasksHWLOther.CarBrand;

public class Main {
    public static void main( String[] args ) {

        Audi audi1 = new Audi("brand 1");
        Audi audi2 = new Audi("brand 2 ");

        Toyota toyota1  = new Toyota("toyota 1");
        Toyota toyota2  = new Toyota("toyota 2");

        Models[] models = {audi1, audi2, toyota1, toyota2};

        for (Models  models1 :models){
            models1.printModels();

        }



    }
}
