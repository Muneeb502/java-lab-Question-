import java.util.Scanner;
public class sum_of_index {
    public static void main(String[] args) {
        Scanner len = new Scanner(System.in);
        System.out.print("ENTER THE LENGHT OF ARRAY = ");
        int num = len.nextInt();
        int[] values = new int[num];
        System.out.println("ENTER THE VALUES OF ARRAY ");
        int i , sum =0 ;
        for(i=0;i<num;i++){
            System.out.print("ENTER THE "+i+" = ");
            values[i] = len.nextInt();
            sum += values[i];

        }
        System.out.println("THE SUM OF GIVEN ARRAY VALUES = "+sum);
    }
}
