import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER YOU WANT TO FIND FACTORIAL ");
        int num = in.nextInt();
        int i , n ;
         n = num;

        for (i=1 ; i < num ;i ++ ){

            n = n * i;
        }
        System.out.print("so the factorial of " + num + " is " + n);
        
    }

}
