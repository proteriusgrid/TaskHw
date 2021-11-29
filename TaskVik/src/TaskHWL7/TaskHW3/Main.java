package TaskHWL7.TaskHW3;

public class Main extends Cars{
    public static void main( String[] args ) {

        Cars cars= new Cars();
        Cars modelOne = new ModelOne();
        Cars modelTwo = new ModelTwo();

        cars.move();
        modelOne.move();
        modelTwo.move();

    }

}

