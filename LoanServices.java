public class LoanServices {
    private final Account accountInfo;


    public LoanServices(Account accountInfo) {
        this.accountInfo = accountInfo;
    }


    public Account loan(int amount) {
        int balance = accountInfo.getBalance();
        int loanMax = accountInfo.getLoanMax();

        if(amount <= loanMax) {
            balance += amount;
            accountInfo.setLoanMax(amount);

            System.out.println("Loan of " + amount + " has been applied.");
            System.out.println("Your new balance is: " + balance);
        }
        else {
            System.out.println("you can't apply for that much.");
        }

        return accountInfo;
    }

}
