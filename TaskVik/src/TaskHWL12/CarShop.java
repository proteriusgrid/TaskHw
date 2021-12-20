package TaskHWL12;

public class CarShop {
    private SimpleCarFactory carFactory;
    public CarShop(SimpleCarFactory carFactory){
        this.carFactory = carFactory;
    }

    public Car orderCar(CarType type){
        Car car = carFactory.createCar(type);
        car.detailsCar();
        car.makeCar();
        car.drivingTestCar();

        System.out.println("Ваш автомобиль готов ! Спасибо, приходите еще за новыми моделями!");
        return car;
    }



}

