package Task4;

public class Circle extends Ellipse {

    // Constructor
    public Circle(String name, double radius) {

        super(name, radius, radius);

        if (radius <= 0) {
            System.out.println("Error: Radius must be positive.");
            System.exit(0);
        }
    }

    // Override scale method
    @Override
    public void scale(double factor) {
        semiMajor *= factor;
        semiMinor *= factor;
    }
}
