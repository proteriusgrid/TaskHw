package TaskHWL7.TaskHW4;

public class Animal {
    private  String name;

    public Animal(String a){
        this.name= a;

    }

    public String SayHello(){
        return String.format("The %s say hello", this.name);
    }
    public String getName(){
        return this.name;
    }
}
