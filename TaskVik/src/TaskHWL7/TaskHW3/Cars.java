package TaskHWL7.TaskHW3;

public class Cars {

        private String model;
        public Cars(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "model = " + model;
        }

    static class CarsManager
    {
        public static void main(String[] args) {
            Cars modelOne = new Cars ("Test Model 1");
            Cars modelTwo = new Cars ("Test Model 2");
            System.out.println(modelOne.toString());
            System.out.println(modelTwo.toString());
        }
    }
    }
