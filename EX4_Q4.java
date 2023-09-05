import java.util.Scanner;

class Room {
    double length;
    double breadth;
    double height;
    double floorArea;
    double wallArea;
    int numOfFans;
    int numOfWindows;
    int numOfDoors;

    Room(double length, double breadth, double height, int numOfFans, int numOfWindows, int numOfDoors) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.numOfFans = numOfFans;
        this.numOfWindows = numOfWindows;
        this.numOfDoors = numOfDoors;

        this.calculateFloorArea();
        this.calculateWallArea();
    }

    void calculateFloorArea() {
        floorArea = length * breadth;
    }

    void calculateWallArea() {
        wallArea = 2 * height * (length + breadth) - 0.2 * (2 * height * (length + breadth));
    }

    void displayDetails() {
        System.out.println("Room Details:");
        System.out.println("Length: " + length + " meters");
        System.out.println("Breadth: " + breadth + " meters");
        System.out.println("Height: " + height + " meters");
        System.out.println("Floor Area: " + floorArea + " square meters");
        System.out.println("Wall Area: " + wallArea + " square meters");
        System.out.println("Number of Fans: " + numOfFans);
        System.out.println("Number of Windows: " + numOfWindows);
        System.out.println("Number of Doors: " + numOfDoors);
    }
}

public class EX4_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the room: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter the height of the room: ");
        double height = sc.nextDouble();

        System.out.print("Enter the number of fans in the room: ");
        int numOfFans = sc.nextInt();

        System.out.print("Enter the number of windows in the room: ");
        int numOfWindows = sc.nextInt();

        System.out.print("Enter the number of doors in the room: ");
        int numOfDoors = sc.nextInt();

        Room room = new Room(length, breadth, height, numOfFans, numOfWindows, numOfDoors);
        room.displayDetails();
        sc.close();

    }
}
