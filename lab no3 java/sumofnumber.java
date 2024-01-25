import java.util.Scanner;
public class sumofnumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("EBTER THE NUMBER YOU WANT TO FIND SUM ");
        int num = in.nextInt();
        int i , sum =0 ;
        while (num>0) {
            i = num%10;
            sum = sum  + i;
            num=num/10;
            
        }
        System.out.println("THE SUM OF THE NUMBER IS "+ sum);
    }
}