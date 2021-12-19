package TasksHWLOther.CarBrand;



public class Audi implements Models{

    private String brand;
    public Audi (String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }
//    @Override
//    public  void  print(){
//        System.out.println("Printing brand" + getBrand());
//    }

    @Override
    public void printModels() {

    }
    public void printAudi( Models[] models) {
        for (Models m : models) {
            if (m instanceof Audi)
//                ((Audi) m).print();
                m.printModels();
        }


}
}
