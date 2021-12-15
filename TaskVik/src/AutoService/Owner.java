package TasksHWLOther.AutoService;

public class Owner  {
//    private String name;
    private String carOwner;

    public Owner( String name, String carOwner) {
//        this.name = name;
        this.carOwner = carOwner;

    }
    public Owner(){

    }

//    public String getName() {
//        return name;
//    }

//    public void setName( String name ) {
//        this.name = name;
//    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner( String carOwner ) {
        this.carOwner = carOwner;
    }

    public String getInfo() {

        return "{" + "Car Owner = " + carOwner + '\'' + '}';
    }
}
// + " name = " + name + '\''