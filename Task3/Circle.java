package Task3;

public class Circle extends Ellipse {

    // Constructor
    public Circle(String name, double radius) {

        super(name, radius, radius);

        if (radius <= 0) {
            System.out.println("Error: Radius must be positive.");
            System.exit(0);
        }
    }
}
