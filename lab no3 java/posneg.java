import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER : ");
        int num = in.nextInt();
        System.out.print(num);
        if (num>0) {
            System.out.println(" is positive number ");
        } else if (num<0) {
            System.out.println(" is negative numbrer ");
        }
        
        else {
            System.out.println(" is neither positive or neither negative ");
        }
    }
}
