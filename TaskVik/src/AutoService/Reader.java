package TasksHWLOther.AutoService;

public class Reader {
    private String brand;
    private int numberCar;
    private String model;
    private String yearOfManufacture;
    private String phoneNumber;
    private double engineCapacity;
    private String bodyType;
    private String color;

    public Reader (String brand, int numberCar, String model, String yearOfManufacture, String phoneNumber,double engineCapacity, String bodyType, String color){

        this.brand = brand;
        this.numberCar = numberCar;
        this.model = model;
        this.yearOfManufacture= yearOfManufacture;
        this.phoneNumber = phoneNumber;
        this.engineCapacity =engineCapacity;
        this.bodyType = bodyType;
        this.color = color;
    }
    public Reader(){

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

    public void takeList(String... lists){
        System.out.println(this.brand + "took the following lists: ");
        for (String list : lists){
            System.out.println(list);
        }
        System.out.println();
    }

    public void takeList(List... lists){
        System.out.println(this.brand + " took the following lists:");
        for (List list : lists){
            System.out.println(list.getName()+ ", Car Owner - " + list.getCarOwner());
        }
        System.out.println();
    }
    public  void  returnList(int numberCar){
        System.out.println(this.brand + "returned " + numberCar + "lists");
    }
    public void returnList(String... lists){
        System.out.println(this.brand + "returned the following lists:  ");
        for (String list : lists){
            System.out.println(list);
        }
        System.out.println();
    }

    public void returnList(List... lists){
        System.out.println(this.brand + " returned the following lists: ");
        for (List list: lists){
            System.out.println(list.getName()+ ", Car Owner - " +list.getCarOwner());
        }
        System.out.println();
    }

    public String getInfo(){
        return "{" + "brand" + brand + '\'' + ", number Car = " +numberCar+ ", model" + model +'\''  +", year of manufacture" + yearOfManufacture+ '\''
        + ", phone='" + phoneNumber + '\'' +"engine capacity" + engineCapacity+ '\'' +"body type" + bodyType+ "color"+ color +'}';
    }

}
