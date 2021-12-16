package TasksHWLOther.AutoService;

public class Owner  {
    private String name;
    private String carOwner;

    public Owner( String name, String carOwner) {
        this.name = name;
        this.carOwner = carOwner;

    }
    public Owner(){

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner( String carOwner ) {
        this.carOwner = carOwner;
    }

    public void takeCar(String... cars){
//        System.out.println(this.brand + "took the following owners: ");
        System.out.println(this.getCarOwner()+ " took the following cars:  ");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();
    }

    public void takeCar( Car... cars ){
        System.out.println(this.getCarOwner() + " took the following cars:");
        for (Car car : cars){
            System.out.println( "Car Brand - " + car.getBrand());
        }
        System.out.println();
    }
    public  void  returnCar(int numberCar){
        System.out.println(this.carOwner + "returned " + numberCar + "cars");
    }
    public void returnCar(String... cars){
        System.out.println(this.carOwner + "returned to the following cars: ");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();
    }

    public void returnCar( Car... cars ){
        System.out.println(this.carOwner + "returned the following cars:  ");
        for (Car car : cars){
            System.out.println(car.getBrand()+ "Car Brand - " + car.getNumberCar());
        }
        System.out.println();
    }

    public String getInfo() {

        return "{" + "Car Owner = " + carOwner + '\'' + '}';
    }
}
// + " name = " + name + '\''