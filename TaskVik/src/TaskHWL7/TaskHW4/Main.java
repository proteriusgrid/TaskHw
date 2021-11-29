package TaskHWL7.TaskHW4;

public class Main {
    public static void main( String[] args ) {

        Animal a= new Animal("Jack");
        Cat c =new Cat("John");
        Dragon d = new Dragon("Bob");

        System.out.println(a.SayHello());
        System.out.println(c.SayHello());
        System.out.println(d.SayHello());
    }
}
