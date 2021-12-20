package TaskHWL11.Task1;

public class EquilTriangle extends Triangle {

    EquilTriangle( double side_1, double side_2, double corner) {

        super(side_1, side_2, corner);
    }

    @Override
    public double area() {
        return (Math.sqrt(3.0) / 4) * Math.pow(getSide_1(), 2);
    }

    @Override
    public double perimeter() {
        return (3 * getSide_1());
    }

    @Override
    public boolean equals(Triangle var) {
        return (getSide_1() == var.getSide_1()) && (getSide_2() == var.getSide_2())
                && (getCorner() == var.getCorner());
    }

    @Override
    public String toString() {
        return "class " + EquilTriangle.class.getName();
    }

}
