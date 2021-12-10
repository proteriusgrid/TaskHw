package TasksHWLOther.AutoService;

public class List {
    private String name;
    private String carOwner;

    public List(String name, String carOwner) {
        this.name = name;
        this.carOwner = carOwner;

    }
    public List(){

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

    public String getInfo() {

        return "{" + " name = '" + name + '\'' + ", Car Owner ='" + carOwner + '\'' + '}';
    }
}
