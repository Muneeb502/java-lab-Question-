import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("print the table of your roll number ");
        System.out.print("enter your roll number = ");
        int i,j, num = in.nextInt();
        for(i=0 ; i<=10 ; i++){
                j=i*num;
                System.out.print(j+" ");    
        }
    }
}
