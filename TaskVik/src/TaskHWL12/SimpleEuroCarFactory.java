package TaskHWL12;

public class SimpleEuroCarFactory extends SimpleCarFactory{
    @Override
    public Car creatCar (CarType type){
        Car car = null;

        switch (type){
        case MODEL_A:
        car = new Main.EuroStyleModel_A();
        break;

        case  MODEL_B:
        car = new Main.EuroStyleModel_B();
        break;

        case MODEL_C:
        car =  new Main.EuroStyleModel_C();
        break;

        case MODEL_D:
        car =  new Main.EuroStyleModel_D();
        break;

        }
        return car;

    }

}
public class SimpleUsaCarFactory extends SimpleCarFactory{

//    @Override
    public Car creatCar (CarType type) {
        Car car = null;

        switch (type) {
            case MODEL_A:
                car = new Main.UsaStyleModel_A();
                break;

            case MODEL_B:
                car = new Main.UsaStyleModel_B();
                break;

            case MODEL_C:
                car = new Main.UsaStyleModel_C();
                break;

            case MODEL_D:
                car = new Main.UsaStyleModel_D();
                break;

        }
        return car;

    }
}