package TasksHWLOther.AutoService;

public class Main {
    public static void main( String[] args ) {

        Car car1 = new Car("VW " , 1234,"T5","2004","380912345678", 2.5 ,"Minibus","White");
        Car car2 = new Car("BMW " , 1002,"M3","2021","380922345678", 3.0 ,"Coupe","Red");
        Car car3 = new Car("Ford " , 1234,"f-150 raptor","2021","380932345678", 3.5,"Pickup truck","Black");

        Car[] cars = {car1, car2, car3};

        Owner owner1 = new Owner("ford f-150 ", " Bob ");
        Owner owner2 = new Owner("ford mustang gt500 ", " Max ");
        Owner owner3 = new Owner("Audi R8 ", " John ");
        Owner[] owners ={owner1, owner2, owner3};

        printCar(cars);
        printOwner(owners);


        car1.takeOwner(" Emma"," Mia");
        car2.takeOwner("Sergii  ", "Bob");
        car3.takeOwner(owner1, owner2, owner3);

        car1.returnOwner(2);
        car2.returnOwner("McLaren Speedtail, www");
        car3.returnOwner(owner3);

    }


    private static void printOwner( Owner... owners ){
        System.out.println("Take a Owner : ");
        for (Owner owner : owners){
            System.out.println(owner.getInfo());
        }
        System.out.println();
    }
    private static void printCar( Car... cars ){
        System.out.println("List Car: ");
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
        System.out.println();
    }
}
