package Task3;

public class Ellipse extends Shape {

    // Instance variables
    protected double semiMajor;
    protected double semiMinor;

    // Constructor
    public Ellipse(String name, double a, double b) {

        super(name);
        if (a > b) {
            this.semiMajor = a;
            this.semiMinor = b;
        } else {
            this.semiMajor = b;
            this.semiMinor = a;
        }
    }

    // Override abstarct methods
    @Override
    public double getPerimeter() {

        double a = semiMajor;
        double b = semiMinor;

        if (a == b) {
            return 2 * Math.PI * a;
        }

        return 2 * Math.PI * Math.sqrt(a * a + b * b - ((a - b) * (a - b)) / 2.0);

    }

    @Override
    public double getArea() {

        return Math.PI * semiMajor * semiMinor;
    }
}
