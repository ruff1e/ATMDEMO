public class DepositService {
    private final Account accountInfo;

    public DepositService(Account accountInfo) {
        this.accountInfo = accountInfo;
    }


    public Account deposit(int amount) {
        int balance = accountInfo.getBalance();

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit. Please enter a amount greater than 0.");
        }
        accountInfo.setBalance(balance);
        System.out.println("Your new balance is: " + balance);
        return accountInfo;
    }

}
