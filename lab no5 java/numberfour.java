import java.util.Scanner;

public class numberfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. while");
        System.out.println("4. do-while");
        System.out.println("5. for");

        // Get the user's choice
        int choice = scanner.nextInt();

        switch (choice) {
            case 4:
                // Using do-while loop
                int i = 1;
                do {
                    System.out.println("Output: " + i);
                    i++;
                } while (i <= 5);
                break;

            default:
                System.out.println("Invalid choice");
        }
}
}
