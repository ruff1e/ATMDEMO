public class CheckService {
    private final Account accountInfo;

    public CheckService(Account accountInfo) {
        this.accountInfo = accountInfo;
    }


    public void checkBalance() {
        int balance = accountInfo.getBalance();

        System.out.println("Your current balance is: " + balance);
    }

}
