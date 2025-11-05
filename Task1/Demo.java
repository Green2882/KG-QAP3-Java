package Task1;

public class Demo {

    public static void main(String[] args) {

        // Create person
        Person John = new Person("John Smith", 25, "M");
        System.out.println(John);
        System.out.println();

        // Create student
        Student Amy = new Student("Amy Jones", 22, "F", "242", 3.3);
        System.out.println(Amy);
        System.out.println();

        // Create teacher
        Teacher Frank = new Teacher("Frank Browne", 38, "M", "Math", 60000);
        System.out.println(Frank);
        System.out.println();

        // Create college student
        CollegeStudent Sarah = new CollegeStudent("Sarah Cambell", 24, "F", "650", 3.7, "Economics", 3);
        System.out.println(Sarah);
    }
}
