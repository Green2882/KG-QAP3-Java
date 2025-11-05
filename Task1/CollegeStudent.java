package Task1;

public class CollegeStudent extends Student {

    // Instance variables
    protected String myMajor;
    protected int myYear;

    // Constructor
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGpa, String myMajor, int myYear) {

        super(myName, myAge, myGender, myIdNum, myGpa);
        this.myMajor = myMajor;
        this.myYear = myYear;
    }

    // Getters and Setters
    public String getMyMajor() {
        return myMajor;
    }

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public int getMyYear() {
        return myYear;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    // toString
    @Override
    public String toString() {

        return (super.toString() + ", Major: " + myMajor + ", Year: " + myYear);
    }

}
