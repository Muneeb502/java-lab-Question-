import java.util.Scanner;
public class blood {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        int  age = in.nextInt();
        System.out.print("ENTER YOUR WEIGHT  IN kg : ");
        int weight = in.nextInt();
        if ( 45<weight && 18<age || age >60 ) {
            System.out.println("YES YOU ARE ELIGIBLE TO DONATE BLOOD ! ");
        } else {
            System.out.println("ops! YOU ARE NOT ELIGIBLE TO DONATE BLOOD ! ");
        }
    }
}
