import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.print("ENTER ANY YEAR : ");
Scanner in = new Scanner(System.in);
int YEAR = in.nextInt();
if (YEAR>0) {
    if (YEAR%4 ==0 || YEAR%400 == 0) {
        System.out.print("YES " + YEAR );
        System.out.println(" is leap year");
    } else {
        System.out.println("not leap year");
    }
} else {
    System.out.println("PLEASE ENTER A VALID YEAR !");
}
    }
}
