package TaskHWL11.Task1;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = null;

        RecTriangle recTriangle = new RecTriangle(3, 4, 90);
        IsosTriangle isosTriangle = new IsosTriangle(4, 6, 45);
        Equil_Triangle equilTriangle = new Equil_Triangle(5, 5, 60);

        triangle = recTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "area: ", triangle.area());
        System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
        System.out.printf("%s%b\n", "equals: ", triangle.equals(equilTriangle));
        System.out.println();

        triangle = isosTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "area: ", triangle.area());
        System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
        System.out.printf("%s%b\n", "equals: ", triangle.equals(equilTriangle));
        System.out.println();

        triangle = equilTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "area: ", triangle.area());
        System.out.printf("%s%.2f\n", "perimeter: ", triangle.perimeter());
        System.out.printf("%s%b\n", "equals: ", triangle.equals(equilTriangle));
        System.out.println();
    }

}
