import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int mainChoice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create New Account");
            System.out.println("2. Use Existing Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {

                case 1:
                    System.out.println("\nChoose Account Type:");
                    System.out.println("1. Saving");
                    System.out.println("2. Current");
                    System.out.print("Enter choice: ");

                    int typeChoice = sc.nextInt();
                    sc.nextLine();

                    String type = (typeChoice == 2) ? "Current" : "Saving";

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    account.create_account(name, type);
                    break;

                case 2:
                    if (!account.isAccountCreated()) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }

                    int choice;
                    do {
                        System.out.println("\n--- Banking Operations ---");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Display Account Details");
                        System.out.println("5. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter deposit amount: ");
                                account.deposit(sc.nextDouble());
                                break;

                            case 2:
                                System.out.print("Enter withdrawal amount: ");
                                account.withdraw(sc.nextDouble());
                                break;

                            case 3:
                                account.checkBalance();
                                break;

                            case 4:
                                account.displayDetails();
                                break;

                            case 5:
                                System.out.println("Returning to Main Menu...");
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                    } while (choice != 5);
                    break;

                case 3:
                    System.out.println("Thank you for using Banking System!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (mainChoice != 3);

        sc.close();
    }
}
