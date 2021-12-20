package TaskHWL12;

public class Main {

    public static class Model_A extends Car{}
    public static class Model_B extends Car{}
    public static class Model_C extends Car{}
    public static class Model_D extends Car{}

    public static class EuroStyleModel_A extends Car {}
    public static class EuroStyleModel_B extends Car {}
    public static class EuroStyleModel_C extends Car {}
    public static class EuroStyleModel_D extends Car {}


    public static class UsaStyleModel_A extends Car {}
    public static class UsaStyleModel_B extends Car {}
    public static class UsaStyleModel_C extends Car {}
    public static class UsaStyleModel_D extends Car {}

    public static void main( String[] args ) {
        SimpleEuroCarFactory EuroCarFactory = new SimpleEuroCarFactory();
        CarShop EuroCarShop = new CarShop(EuroCarFactory);
        EuroCarShop.orderCar(CarType.MODEL_C);


        SimpleUsaCarFactory UsaCarFactory = new SimpleUsaCarFactory();
        CarShop UsaCarShop = new CarShop(UsaCarFactory);
        UsaCarShop.orderCar(CarType.MODEL_C);

    }





}
