import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER YOUR TOTAL MARKS :");
        int number = in.nextInt();
        if (number <0 || number > 100) {
            System.out.println("Invalid marks marks must be between 0 amd 100 ");
            
        } else if (number >= 90 && number <= 100) {
            System.out.println("your grade is A+1 ");
        }else if (number >=80 && number < 90) {
            System.out.println("your grade is A+ ");
        }
        else if (number >=70 && number <80) {
            System.out.println("your grade is A ");
        }
        else if (number >=60 && number < 70) {
            System.out.println("your grade is B ");
        }
        else if (number >=50 && number <60) {
            System.out.println("your grade is C ");

        }else if (number >=40 && number < 50) {
            System.out.println("your grade is D ");
        }else {
            System.out.println("YOU ARE FAIL IN EXAM ");
        }
    }
    }