import java.util.Scanner;
public class even_odd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER : ");
        int num = in.nextInt();
       if (num > 1) {
        if (num%2==0) {
            System.out.println("the number is even number");
        }
        else if (num%2 > 0 ) {
            System.out.println("the number is odd number ");
        } 
    } else {
        System.out.println("ENTER A CORRECT NUMBER !!!");
    }
    }
}