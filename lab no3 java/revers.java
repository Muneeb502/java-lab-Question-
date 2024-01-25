import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       int i , r, s = 0  ;
       System.out.print("ENTER ANY NUMBER : ");
       r = sn.nextInt();
       while (r>0) {
        i = r % 10 ;
        s = s *10 + i ;
        r = r / 10 ;
       }
       System.out.println("THE REVERS OF NUMBER IS : "+ s);
    }
}
