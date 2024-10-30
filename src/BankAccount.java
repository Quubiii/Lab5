import java.util.Scanner;

public class BankAccount {
    private String AccountNumber;
    private double Balance;

    public BankAccount(String AccountNumber) {
        this.AccountNumber = AccountNumber;;
    }

    public void Deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to deposit?");
        double amount = scanner.nextDouble();
        if(amount <= 0) {
            System.out.println("Amount must be positive!");
            return;
        }
        Balance += amount;
        System.out.println("Successfully added " + amount +" to your account. Balance: " + Balance);
    }

    public void Withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to withdraw? You got: " + Balance);
        double amount = scanner.nextDouble();
        if(amount <= 0 || amount > Balance) {
            System.out.println("Amount cannot be bigger than your balance and must be positive!");
            return;
        }
        Balance -= amount;
        System.out.println("Successfully withdrawed " + amount + " from your account. Balance: " + Balance);
    }

    public void getBalance() {
        System.out.println("Your balance: " + Balance);
    }
}
