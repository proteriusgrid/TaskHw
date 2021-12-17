package TaskHWL11.Task1;

public class IsosTriangle  extends  Triangle{

    IsosTriangle(double side_1, double side_2, double corner) {

        super(side_1, side_2, corner);
    }

    @Override
    public double area() {
        return (.5 * getSide_1() * getSide_2() * Math.sin(getCorner()));
    }

    @Override
    public double perimeter() {
        return (2 * getSide_1()) + getSide_2();
    }

    @Override
    public String toString() {
        return "class " + IsosTriangle.class.getName();
    }

    @Override
    public boolean equals(Triangle var) {
        return (getSide_1() == var.getSide_1()) && (getSide_2() == var.getSide_2())
                && (getCorner() == var.getCorner());
    }
}



