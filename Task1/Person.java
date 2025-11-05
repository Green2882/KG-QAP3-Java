package Task1;

class Person {

    // Instance variables
    protected String myName;
    protected int myAge;
    protected String myGender;  // M = male/F = female

    // Constructor
    public Person(String myName, int myAge, String myGender) {

        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    // Getters and Setters
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    // toString
    @Override
    public String toString() {

        return (myName + ", Age: " + myAge + ", Gender: " + myGender);
    }
}
