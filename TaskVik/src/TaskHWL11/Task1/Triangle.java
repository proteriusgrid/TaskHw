package TaskHWL11.Task1;

abstract public class Triangle {
    Triangle(double side_1, double side_2, double corner) {

        this.side_1 = side_1;
        this.side_2 = side_2;
        this.corner = corner * rad;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract String toString();
    public abstract boolean equals(Triangle obj);

    public double getSide_1() {
        return side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public double getCorner() {
        return corner;
    }

    private double side_1;
    private double side_2;
    private double corner;
    private final static double rad = 0.017453292519943;

}
