import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER : ");
        long num = in.nextInt();
        long i ;

        for( i=2 ; i<num ; i++){
            if (num%i == 0 ) {
                System.out.println("IT IS NOT A PRIME NUMBER ");
                break ;
            }
        }
        if (i==num) {
            System.out.println("YES IT IS PRIME NUMBER ");
        }
    }
}
