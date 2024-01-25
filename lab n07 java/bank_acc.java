import java.util.Scanner;
 class Account {
    String accname;
    long accnumber;
    double accbalance;
    public void initialize(long iacnum , String iacname , double iacbala){ 
        accnumber = iacnum ;
        accname = iacname;
        accbalance= iacbala;
    }
    public void  balncecheck(){
        System.out.println(accnumber +" "+accname+" "+accbalance);
    }
    public void deposit(double money){
        accbalance += money ;
        System.out.println(accbalance +" deposite");
        display();
    }
    public void  withdrawAmount( double wdthamc){
        if (wdthamc > accbalance) {
             System.out.println("insufficint balance");
        } else {
            accbalance -= wdthamc;
            System.out.println(wdthamc+" Withdraw ");
        }
        display();
    }
    public void display(){
        System.out.println(accbalance+" Balnace");
    }
}
public class bank_acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account cust = new Account();
        cust.initialize(3433443, "manzoor", 100.00);
        cust.balncecheck();
        System.out.print("ENTER THE AMOUNT  THAT YOU WANT TO DEPOSITE : ");
        double amount =sc.nextDouble();
        cust.deposit(amount);
        System.out.print("ENTER THE AMOUNT THAT YOU WANT TO WITHDRAW ");
        double wdtham = sc.nextDouble();
        cust.withdrawAmount(wdtham);
    }
}