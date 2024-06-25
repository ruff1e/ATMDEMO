public class Account {
    private int id;
    private String name;
    private int balance;
    private int loanMax;
    private int newLoanMax;



    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.loanMax = balance / 10;

    }


    public int getLoanMax() {
        return loanMax;
    }

    public void setLoanMax(int money) {
        this.loanMax -= money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
