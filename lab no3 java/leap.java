 import java.util.Scanner;
 public class leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int februaryDays = 29;
        String result;
        System.out.print("ENTER THE NUMBER OF DAYS IN FEBRURAY : ");
        int num = in.nextInt();
        if (num==februaryDays) {
            result = "yes it is leap year!";
        } else {
            result = "no it is not leap year!";
        }
        System.out.println(result);
    }
}
