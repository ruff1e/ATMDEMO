import java.util.*;

public class Account {
    private int id;
    private String name;
    private int balance;
    private int loanMax;
    private int newLoanMax;
    private List<Integer> loanList;
    private HashMap<Integer, List<Integer>> loanMap;




    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.loanMax = balance / 10;
        this.loanList = new ArrayList<>();
        this.loanMap = new HashMap<>();
    }

    public List<Integer> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Integer> loanList) {
        this.loanList = loanList;
    }

    public HashMap<Integer, List<Integer>> getLoanMap() {
        return loanMap;
    }

    public void setLoanMap(HashMap<Integer, List<Integer>> loanMap) {
        this.loanMap = loanMap;
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
