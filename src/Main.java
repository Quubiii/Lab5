import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExercise 1, 3:\n");
        Person person1 = new Person("Samuel", "male", 1999);
        Person person2 = new Person("Zac", "male", 2004);
        Person person3 = new Person("Iga", "female", 2006);

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        System.out.println("\nExercise 2:\n");
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(5, 8);
        Rectangle rectangle3 = new Rectangle(6, 10);

        System.out.println("Height: " + rectangle1.height + " Width: " + rectangle1.width);
        rectangle1.getArea();
        rectangle1.getPerimeter();
        System.out.println("Height: " + rectangle2.height + " Width: " + rectangle2.width);
        rectangle2.getArea();
        rectangle2.getPerimeter();
        System.out.println("Height: " + rectangle3.height + " Width: " + rectangle3.width);
        rectangle3.getArea();
        rectangle3.getPerimeter();

        System.out.println(("\nExercise 4:\n"));
        BankAccount bankAccount1 = new BankAccount("54635241524");
        while(true) {
            System.out.println("What operation do you want to do? [Deposit/Withdraw/Balance/Exit]");
            String operation = scanner.nextLine();
            if(operation.equalsIgnoreCase("deposit")) {
                bankAccount1.Deposit();
            } else if(operation.equalsIgnoreCase("withdraw")) {
                bankAccount1.Withdraw();
            } else if(operation.equalsIgnoreCase("balance")) {
                bankAccount1.getBalance();
            } else if(operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
        }
        System.out.println("\nExercise 4, 2nd problem:\n");
        InitialAccount IniAcc1 = new InitialAccount("72384783", 750);
        InitialAccount IniAcc2 = new InitialAccount("8490902", 325);

        while (true) {
            System.out.println("What operation do you want to do? [Deposit/Withdraw/Balance/Exit]");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("deposit")) {
                System.out.print("Enter amount to deposit into IniAcc1: ");
                double amount = scanner.nextDouble();
                if (IniAcc2.withdraw(amount)) { // Withdraw from IniAcc2 if possible
                    IniAcc1.deposit(amount);    // Deposit into IniAcc1
                }
                scanner.nextLine(); // Clear newline character

            } else if (operation.equalsIgnoreCase("withdraw")) {
                System.out.print("Enter amount to withdraw from IniAcc1: ");
                double amount = scanner.nextDouble();
                if (IniAcc1.withdraw(amount)) { // Withdraw from IniAcc1 if possible
                    IniAcc2.deposit(amount);    // Deposit into IniAcc2
                }
                scanner.nextLine(); // Clear newline character

            } else if (operation.equalsIgnoreCase("balance")) {
                IniAcc1.getBalance();
                IniAcc2.getBalance();

            } else if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }

        scanner.close();
    }

}
