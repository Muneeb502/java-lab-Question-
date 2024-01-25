import java.util.Scanner;
public class greatnumber {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in) ;
        System.out.print("enter the first number :");
        int num1 = nu.nextInt();
        System.out.print("enter the second numner :");
        int num2 = nu.nextInt();
    if (num1 > num2) {
               System.out.print(num1 + " IS GREATER THAN "+ num2);        
    }else if (num1 <num2) {
         System.out.print(num2 + " IS GREATER THAN "+ num1); 
    }
    else{
         System.out.print("both are equal"); 
    }
        
    }
}
