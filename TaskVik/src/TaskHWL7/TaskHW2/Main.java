package TaskHWL7.TaskHW2;

public class Main {
    public static void main( String[] args ) {

        Wolf wolf = new Wolf("Wolf");
        Wolf dog = new  Dog("Dog");
        Wolf fox = new Fox("Fox");

        System.out.println(wolf.getColor());
        System.out.println(dog.getColor());
        System.out.println(fox.getColor());
    }
}
