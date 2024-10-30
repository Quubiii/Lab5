public class InitialAccount {
    private String IniAccNumber;
    private double IniAccBalance;

    public InitialAccount(String IniAccNumber, int IniAccBalance) {
        this.IniAccNumber = IniAccNumber;
        this.IniAccBalance = IniAccBalance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive!");
            return IniAccBalance;
        }
        IniAccBalance += amount;
        System.out.println("Successfully added " + amount + " to account " + IniAccNumber + ". Balance: " + IniAccBalance);
        return IniAccBalance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > IniAccBalance) {
            System.out.println("Amount cannot be bigger than your balance and must be positive!");
            return false;
        }
        IniAccBalance -= amount;
        System.out.println("Successfully withdrew " + amount + " from account " + IniAccNumber + ". Balance: " + IniAccBalance);
        return true;
    }

    public void getBalance() {
        System.out.println("Account " + IniAccNumber + " balance: " + IniAccBalance);
    }
}
