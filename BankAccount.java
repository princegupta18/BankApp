public class BankAccount {

    static int nextAccountNumber = 1001; // auto generator

    String accountHolderName;
    int accountNumber;
    double balance;
    String accountType;

    void create_account(String name, String type) {
        accountHolderName = name;
        accountType = type;
        accountNumber = nextAccountNumber++; // AUTO NUMBER
        balance = 0;

        System.out.println("Account created successfully");
        System.out.println("Your Account Number is: " + accountNumber);
    }

    boolean isAccountCreated() {
        return accountNumber != 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: ₹" + balance);
    }
}
