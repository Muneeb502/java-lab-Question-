import java.util.Scanner;
public class values {
    public static void main(String[] args) {
         System.out.println("ENTER ANY VALUE UNLESS YOU ENTER 0 ");
        Scanner num = new Scanner(System.in);
        int in ;
        do {
            System.out.print("ENTER ANY VALUE");
              in = num.nextInt();
        } while (in != 0);
    }
}
