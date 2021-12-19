package TasksHWLOther.CarBrand;


public class Toyota implements Models{
    private String brand;

    public Toyota (String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }
//    @Override
//    public void print(){
//        System.out.println("Printing brand" + getBrand());
//    }
    @Override
    public void printModels() {

    }

    public static void printToyota( Models[] models) {
        for (Models m: models) {
            if (m instanceof Toyota )
//                ((Toyota) m).print();
                m.printModels();

        }
    }


}
