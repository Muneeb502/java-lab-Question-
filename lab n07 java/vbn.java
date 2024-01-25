/*import java.util.Scanner;

class Account {
    long accountNumber;
    String accountHolderName;
    double balance;

    // Method to initialize the account
    public void initialize(long accNumber, String accHolderName, double initialBalance) {
        accountNumber = accNumber;
        accountHolderName = accHolderName;
        balance = initialBalance;
    }

    // Method to display account details
    public void display() {
        System.out.println(accountNumber + " " + accountHolderName + " " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited");
        displayBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn");
            displayBalance();
        }
    }

    // Method to check balance
    public void displayBalance() {
        System.out.println("Balance is: " + balance);
    }
}

public class vbn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an Account object
        Account account = new Account();

        // Initializing the account
        account.initialize(832345, "Sohail", 1000.0);

        // Displaying initial account details
        System.out.print("Initial details: ");
        account.display();

        // Depositing money
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdrawing money
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
*/