package Task4;

public abstract class Shape implements Scalable {

    // Instance variable
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to be used in other classes
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString
    @Override
    public String toString() {
        return name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    }
}
