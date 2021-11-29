package TaskHWL7.TaskHW4;

public class Main {
    public static void main( String[] args ) {

        Animal a= new Animal("Animal");
        Cat c =new Cat("Cat");
        Dragon d = new Dragon("Dragon");

        System.out.println(a.SayHello());
        System.out.println(c.SayHello());
        System.out.println(d.SayHello());
    }
}
