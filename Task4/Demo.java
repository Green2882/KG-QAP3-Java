package Task4;

public class Demo {

    public static void main(String[] args) {

        // Create empty array
        Shape[] shapes = new Shape[4];

        // Create shapes
        shapes[0] = new Ellipse("My Ellipse", 8, 4);
        shapes[1] = new Circle("My Circle", 5);
        shapes[2] = new Triangle("My Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("My Equilateral Triangle", 6);

        // Print shapes before scaling
        System.out.println("Before scaling:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // Scale all shapes
        scaleAll(shapes, 2);

        // Print shapes after scaling
        System.out.println();
        System.out.println("After scaling:");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    // Method to scale all shapes in array
    public static void scaleAll(Scalable[] items, double factor) {
        for (Scalable s : items) {
            s.scale(factor);
        }
    }
}
