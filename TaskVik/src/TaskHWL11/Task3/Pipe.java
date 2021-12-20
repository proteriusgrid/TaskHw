package TaskHWL11.Task3;

public class Pipe implements  Instrument {

    private double diameter;

    public double getDiameter() {
        return diameter;
    }


    public void setDiameter( double diameter ) {
        this.diameter = diameter;
    }


    @Override
    public void play() {
        System.out.println("Играет Трубка");
    }


    @Override
    public String toString(){
        return "Pipe"+" { "+ "diameter = " +diameter +'\'' + " }";
    }


}
