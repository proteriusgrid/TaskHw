package TasksHWLOther.AutoService;

public class Main  extends  Owner{
    public static void main( String[] args )  {

        Car car1 = new Car("VW " , 1234,"T5","2004","380912345678", 2.5 ,"Minibus","White");
        Car car2 = new Car("BMW " , 1002,"M3","2021","380922345678", 3.0 ,"Coupe","Red");
        Car car3 = new Car("Ford " , 1234,"f-150 raptor","2021","380932345678", 3.5,"Pickup truck","Black");

        Car[] cars = {car1, car2, car3};

        Owner owner1 = new Owner("VW"," Bob ");
        Owner owner2 = new Owner("BMW "," Max ");
        Owner owner3 = new Owner("Ford ", " John ");

        Owner[] owners ={owner1, owner2, owner3};

        printCar(cars);
        printOwner(owners);


        owner1.takeCar(car1);
        owner2.takeCar(car2);
        owner1.takeCar(car3);


        owner1.returnCar(car1 );
        owner2.returnCar(car2);
        owner3.returnCar(car3);

    }


    private static void printOwner( Owner... owners ){
        System.out.println("Cars taken from such owners : ");
        for (Owner owner : owners){
//            System.out.println(owner.getInfo());
              System.out.println(owner.getCarOwner());
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
