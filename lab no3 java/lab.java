/**
 * lab
 */
import java.util.Scanner;
public class lab {

    public static void main(String[] args) {
        System.out.print("Enter the value in Fahrenheit  : ");
        Scanner input = new Scanner(System.in);
        float   VALUE = input.nextFloat(); 
        double celsi =  (VALUE -32)* 0.55;
        System.out.println("so yur answer is = " + celsi);

    }
}