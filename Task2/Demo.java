package Task2;

public class Demo {

    public static void main(String[] args) {

        // Create first Point
        Point p1 = new Point();

        // Create second Point
        Point p2 = new Point(3, 5);

        // Update p1 coords
        p1.setX(2);
        p1.setY(4);

        // Update p2 coords
        p2.setXY(5, 7);

        // Display 2 created Points
        System.out.println("Points");
        System.out.print("P1: ");
        System.out.println(p1);
        System.out.print("P2: ");
        System.out.println(p2);

        // Create first MoveablePoint
        MoveablePoint mp1 = new MoveablePoint();

        // Create second MoveablePoint
        MoveablePoint mp2 = new MoveablePoint(2, 2);

        // Create third MoveablePoint
        MoveablePoint mp3 = new MoveablePoint(2, 1, 3, 4);

        // Update mp1 coords and speed
        mp1.setX(1);
        mp1.setY(3);
        mp1.setXSpeed(5);
        mp1.setYSpeed(8);

        // Update mp3 coords and speed
        mp3.setXY(4, 7);
        mp3.setSpeed(5, 5);

        // Display MoveablePoints before being moved
        System.out.println();
        System.out.println("MoveablePoints before moving");
        System.out.print("MP1: ");
        System.out.println(mp1);
        System.out.print("MP2: ");
        System.out.println(mp2);
        System.out.print("MP3: ");
        System.out.println(mp3);

        // Move MoveablePoints
        mp1.move();
        mp2.move();
        mp3.move();

        // Display MoveablePoints after being moved
        System.out.println();
        System.out.println("MoveablePoints after moving");
        System.out.print("MP1: ");
        System.out.println(mp1);
        System.out.print("MP2: ");
        System.out.println(mp2);
        System.out.print("MP3: ");
        System.out.println(mp3);
    }
}
