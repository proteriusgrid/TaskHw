package TaskHWL7.TaskHW4;

public class Cat extends Animal{
    public Cat( String a ) {
        super(a);
    }

    @Override
    public String SayHello(){
        return String.format("The %s say hello, meow ", super.getName());
    }

}
