package Task1;

public class Teacher extends Person {

    // Instance variables
    protected String mySubject;
    protected double mySalary;

    // Constructor
    public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {

        super(myName, myAge, myGender);
        this.mySubject = mySubject;
        this.mySalary = mySalary;
    }

    // Getters and Setters
    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    // toString
    @Override
    public String toString() {

        return (super.toString() + ", Subject: " + mySubject + String.format(", Salary: $%.2f", mySalary));
    }
}
