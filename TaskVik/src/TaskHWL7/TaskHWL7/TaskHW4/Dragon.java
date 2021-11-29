package TaskHWL7.TaskHW4;

public class Dragon extends Animal{
    public Dragon( String a ) {
        super(a);
    }

    @Override
    public String SayHello(){
        return String.format("The %s says hellllo", this.getName());
    }
}
