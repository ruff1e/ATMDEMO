public class WithdrawService {
    private final Account accountInfo;

    public WithdrawService(Account accountInfo) {
        this.accountInfo = accountInfo;

    }

    public Account withdraw(int amount) {
        int balance = accountInfo.getBalance();
        System.out.println("Your balance: " +balance);

        if(amount<balance) {
            balance -= amount;
        }
        else {
            System.out.println("Invalid amount..");
        }
        accountInfo.setBalance(balance);
        System.out.println("Your new balance: " +balance);
        return accountInfo;
    }


}
