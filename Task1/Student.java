package Task1;

public class Student extends Person {

    // Instance variables
    protected String myIdNum;
    protected double myGpa;

    // Constructor
    public Student(String myName, int myAge, String myGender, String myIdNum, double myGpa) {

        super(myName, myAge, myGender);
        this.myIdNum = myIdNum;
        this.myGpa = myGpa;
    }

    // Getters and Setters
    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGpa() {
        return myGpa;
    }

    public void setMyGpa(double myGpa) {
        this.myGpa = myGpa;
    }

    // toString
    @Override
    public String toString() {

        return (super.toString() + ", ID: " + myIdNum + ", GPA: " + myGpa);
    }
}
