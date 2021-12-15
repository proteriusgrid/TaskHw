package TasksHWLOther.AutoService;

public class Car extends Owner {
    private String brand;
    private int numberCar;
    private String model;
    private String yearOfManufacture;
    private String phoneNumber;
    private double engineCapacity;
    private String bodyType;
    private String color;


    public Car( String brand, int numberCar, String model, String yearOfManufacture, String phoneNumber, double engineCapacity, String bodyType, String color){

        this.brand = brand;
        this.numberCar = numberCar;
        this.model = model;
        this.yearOfManufacture= yearOfManufacture;
        this.phoneNumber = phoneNumber;
        this.engineCapacity =engineCapacity;
        this.bodyType = bodyType;
        this.color = color;

    }
    public Car(){

    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar( int numberCar ) {
        this.numberCar = numberCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture( String yearOfManufacture ) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity( double engineCapacity ) {
        this.engineCapacity = engineCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType( String bodyType ) {
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public void takeOwner(String... owners){
//        System.out.println(this.brand + "took the following owners: ");
        System.out.println(this.getCarOwner()+ " the cars were taken from the following owners:  ");
        for (String owner : owners){
            System.out.println(owner);
        }
        System.out.println();
    }

    public void takeOwner( Owner... owners ){
        System.out.println(this.brand + " took from the next owner :");
        for (Owner owner : owners){
            System.out.println( "Car Owner - " + owner.getCarOwner());
        }
        System.out.println();
    }
    public  void  returnOwner(int numberCar){
        System.out.println(this.brand + "returned " + numberCar + "owners");
    }
    public void returnOwner(String... owners){
        System.out.println(this.brand + "returned to the following owners: ");
        for (String owner : owners){
            System.out.println(owner);
        }
        System.out.println();
    }

    public void returnOwner( Owner... owners ){
        System.out.println(this.brand + "the car was returned to the owner as follows:  ");
        for (Owner owner : owners){
            System.out.println("Car Owner - " + owner.getCarOwner());
        }
        System.out.println();
    }

    public String getInfo(){
        return "{" + "brand " + brand + '\'' + ", number Car = " +numberCar+ ", model " + model +'\''  +", year of manufacture = " + yearOfManufacture+ '\''
        + ", phone = '" + phoneNumber + '\'' +", engine capacity = " + engineCapacity+ '\'' +", body type = " + bodyType+ '\''+ ", color - "+ color + '\''+'}';
    }
//
//    public void takeOwner( String s, String s1 ) {
//    }
}
