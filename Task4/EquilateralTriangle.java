package Task4;

public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);

        if (side <= 0) {
            System.out.println("Error: Side length must be positive.");
            System.exit(0);
        }
    }

    // Override scale method
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
