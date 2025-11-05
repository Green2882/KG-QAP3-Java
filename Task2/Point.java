package Task2;

public class Point {

    // Instance variables
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor
    public Point() {
    }

    public Point(float x, float y) {

        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public float getX() {

        return this.x;
    }

    public void setX(float x) {

        this.x = x;
    }

    public float getY() {

        return this.y;
    }

    public void setY(float y) {

        this.y = y;
    }

    public float[] getXY() {

        return new float[]{x, y};
    }

    public void setXY(float x, float y) {

        this.x = x;
        this.y = y;
    }

    // toString
    @Override
    public String toString() {

        return ("(" + x + "," + y + ")");
    }

}
