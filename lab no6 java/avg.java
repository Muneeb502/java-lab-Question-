import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("ENTER YHR LENGHT OF ARRAY = ");
        int len = num.nextInt();
        int[] value = new int[len];
        int i, sum =0;
        System.out.println("ENTER THE VALUE OF ARRAY");
        for(i=0;i<len;i++){
            System.out.print("ENTER THE "+ i+ " VALU = ");
            value[i] =  num.nextInt();
            sum += value[i];
        }
        float avgr = (float) sum /  len;
        System.out.println("THE AVERAGE OF ARRAY IS "+ avgr);
    }
}
