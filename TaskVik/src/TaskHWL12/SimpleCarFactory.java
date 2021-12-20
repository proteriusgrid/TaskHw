package TaskHWL12;

public class SimpleCarFactory {
    public Car createCar ( CarType type){
        Car car = null;

        switch (type) {
            case MODEL_A:
                car = new Main.Model_A();
                break;
            case  MODEL_B:
                car = new Main.Model_B();
                break;
            case MODEL_C:
                car =  new Main.Model_C();
                break;

            case MODEL_D:
                car =  new Main.Model_D();
                break;

        }
        return car;



    }
}
