package TaskHWL7.TaskHW1;

public class FractionNumbers {
    public int X = 0;
    public int Y = 0;

    public FractionNumbers( int x, int y ) {
        X = x;
        Y = x;

    }

    public int toPlus() {
        return X + Y;
    }

    public int toMinus() {
        return X - Y;
    }

    public int toDivide() {
        return X / Y;
    }

    public int toMultiply() {
        return X * Y;
    }

    public String toString() {
        return "FractionNumbers {" + "X =" + X + " Y= " + Y + "}";

    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX( int x ) {

        X = x;
    }

    public void setY( int y ) {

        Y = y;
    }

    @Override
    public boolean equals( Object object ) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        FractionNumbers that = (FractionNumbers) object;

        if (X != that.X)
            return false;
        return Y == that.Y;

    }
}
