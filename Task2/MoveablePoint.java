package Task2;

public class MoveablePoint extends Point {

    // Instance variables 
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor
    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {

        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters and Setters
    public float getXSpeed() {

        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {

        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {

        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {

        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {

        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString
    @Override
    public String toString() {

        return (super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")");
    }

    // Method to move point
    public MoveablePoint move() {

        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
