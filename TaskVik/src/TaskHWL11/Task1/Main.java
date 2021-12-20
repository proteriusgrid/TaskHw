package TaskHWL11.Task1;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = null;

        RecTriangle recTriangle = new RecTriangle(3, 4, 90);
        IsoTriangle isoTriangle = new IsoTriangle(4, 6, 45);
        EquilTriangle equilTriangle = new EquilTriangle(5, 5, 60);

        triangle = recTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "площадь: ", triangle.area());
        System.out.printf("%s%.2f\n", "периметр: ", triangle.perimeter());
        System.out.printf("%s%b\n", "статус: ", triangle.equals(equilTriangle));
        System.out.println();

        triangle = isoTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "площадь: ", triangle.area());
        System.out.printf("%s%.2f\n", "периметр: ", triangle.perimeter());
        System.out.printf("%s%b\n", "статус: ", triangle.equals(equilTriangle));
        System.out.println();

        triangle = equilTriangle;
        System.out.println(triangle.toString());
        System.out.printf("%s%.2f\n", "площадь: ", triangle.area());
        System.out.printf("%s%.2f\n", "периметр: ", triangle.perimeter());
        System.out.printf("%s%b\n", "статус: ", triangle.equals(equilTriangle));
        System.out.println();
    }

}
