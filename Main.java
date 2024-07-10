import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the ATM");


        List<Account> accounts = List.of(
                new Account(1000, "Emre", 1000),
                new Account(1001, "Josh", 2000),
                new Account(1002, "Umut", 3000),
                new Account(1003, "Diln", 4000),
                new Account(1004, "Babacim", 999999)
        );





        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account ID: ");
        int accountId = scanner.nextInt();
        Account account = findAccountById(accounts, accountId);

        if (account != null) {
            System.out.println("Welcome to the ATM " + account.getName());
        } else {
            System.out.println("Account not found");
        }

        while (account != null) {

            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Loan Services");
            System.out.println("5: Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            WithdrawService withdrawService = new WithdrawService(account);
            DepositService depositService = new DepositService(account);
            CheckService checkService = new CheckService(account);
            LoanServices loanServices = new LoanServices(account);

            switch (option) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    withdrawService.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    depositService.deposit(depositAmount);
                    break;
                case 3:
                    checkService.checkBalance();
                    break;
                case 4:
                    System.out.println("You are eligible for a loan up to " + account.getLoanMax() + " dollars.");
                    System.out.println("How much would you like to apply for?");
                    int loanAmount = scanner.nextInt();
                    loanServices.loan(loanAmount);
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static Account findAccountById(List<Account> accounts, int accountId) {

        Account acc = accounts.stream()
                .filter(x -> x.getId() == accountId)
                .findFirst()
                .orElse(null);


        return acc;
    }
}
