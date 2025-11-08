package Task3;

public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);

        if (side <= 0) {
            System.out.println("Error: Side length must be positive.");
            System.exit(0);
        }
    }
}
