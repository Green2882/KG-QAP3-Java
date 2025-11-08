package Task3;

public class Demo {

    public static void main(String[] args) {

        // Create empty array
        Shape[] shapes = new Shape[4];

        // Create shapes
        shapes[0] = new Ellipse("Ellipse", 8, 4);
        shapes[1] = new Circle("Circle", 5);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        // Print shapes in a loop
        for (Shape s : shapes) {

            System.out.println(s.toString());
            System.out.println();
        }
    }
}
