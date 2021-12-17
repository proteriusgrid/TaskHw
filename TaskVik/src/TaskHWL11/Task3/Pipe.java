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

//    @Override
//    public boolean equals(Object object){
//        if (this == object)
//            return true;
//        if (!(object instanceof Pipe))
//            return false;
//        Pipe pipe= (Pipe)  object;
//        return Double.compare(pipe.diameter, diameter) == 0;
//    }
//
//    @Override
//    public int hashCode(){
//        long temp = Double.doubleToLongBits(diameter);
//        return (int)  (temp ^ (temp >>>32));
//    }

    @Override
    public String toString(){
        return "Pipe"+" { "+ "diameter = " +diameter +'\'' + " }";
    }


}
