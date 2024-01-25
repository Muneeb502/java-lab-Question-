class Box {
    double length, width, height;

    // Constructor when all dimensions are specified
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Default constructor when no dimensions are specified
    Box() {
        length = 1;
        width = 1;
        height = 1;
    }

    // Constructor when creating a cube
    Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Method to compute and return the volume of the box
    double calculateVolume() {
        return length * width * height;
    }
}

public class Teatbox {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Box box1 = new Box(2, 3, 4);
        System.out.println("Volume of Box 1: " + box1.calculateVolume());

        Box box2 = new Box();
        System.out.println("Volume of Box 2: " + box2.calculateVolume());

        Box cube = new Box(5);
        System.out.println("Volume of Cube: " + cube.calculateVolume());
    }
}
