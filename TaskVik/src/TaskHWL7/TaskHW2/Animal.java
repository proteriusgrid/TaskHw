package TaskHWL7.TaskHW2;

public class Animal {
    static class Wolf {
        void show()
        {
            System.out.println("Wolf hello");
        }
    }


    static class Dog extends Wolf {

        @Override
        void show()
        {
            System.out.println("Dogs Hello");
        }
    }

    // Driver class
    static class Main {
        public static void main(String[] args)
        {

            Wolf obj1 = new Wolf();
            obj1.show();

            Wolf obj2 = new Dog();
            obj2.show();
        }
    }
}
