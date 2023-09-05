import java.util.Scanner;

class Bank {
    String ifscCode;
    String accountNumber;
    String name;
    double balance;
    double maxWithdrawPerDay = 15000;

     Bank(String ifscCode, String accountNumber, String name, double initialBalance) {
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

     void withdraw(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Insufficient balance. Minimum balance of 1000 required.");
        } else if (amount > maxWithdrawPerDay) {
            System.out.println("Maximum withdrawal per day exceeded.");
        } else if (amount % 100 != 0 || amount > balance) {
            System.out.println("Withdraw money in the denomination of 100 and 500.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

     void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IFSC code: ");
        String ifscCode = sc.next();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.next();

        System.out.print("Enter Account Holder's Name: ");
        String accountHolderName = sc.next();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Bank bankAccount = new Bank(ifscCode, accountNumber, accountHolderName, initialBalance);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
