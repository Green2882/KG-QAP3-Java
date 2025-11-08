package Task3;

public abstract class Shape {

    // Instance variables
    protected String name;

    // Constrcutor
    public Shape(String name) {

        this.name = name;
    }

    // Abstract methods to be used in other classes
    public abstract double getPerimeter();

    public abstract double getArea();

    // toString
    @Override
    public String toString() {

        return ("Name: " + this.name + ", Perimeter=" + this.getPerimeter() + ", Area=" + this.getArea());
    }
}
