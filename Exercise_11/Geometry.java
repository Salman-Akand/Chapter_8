import java.awt.geom.Ellipse2D;

public class Geometry {
    public static double perimeter(Ellipse2D.Double ellipse) {
        double perimeter;

        double a = ellipse.getWidth() / 2.0;
        double b = ellipse.getHeight() / 2.0;

        perimeter = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));

        return perimeter;
    }

    public static double area(Ellipse2D.Double ellipse) {
        double area;
        double a = ellipse.getWidth() / 2.0;
        double b = ellipse.getHeight() / 2.0;

        area = Math.PI * a * b;

        return area;
    }
}