import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner yn = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO FIND THE PERFECT SQUARE = ");
        int num = yn.nextInt();
        double r = Math.sqrt(num);
        if (r*r == num) {
            System.out.println("yes it is a perfect square.");
        }
        else{
            System.out.println("no it is not a perfect square");
        }
    }
}
