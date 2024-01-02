package ch05.sub02;

public class Account {


    public static Account getInstance(String bank, String id, String name, int balance) {
        return new Account(bank, id, name, balance);

    }
    private Account(String bank, String id, String name, int balance){
        this.bank = bank;
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // 속성
    private String bank;
    private String id;
    private String name;
    private int balance;


    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    // 기능(메서드)
    public void deposit(int money) {
        this.balance += money;
    }
    public void withdraw(int money) {
        this.balance -= money;
    }
    public void show() {
        System.out.println("은행명 : " + this.bank);
        System.out.println("계좌번호 : " + this.id);
        System.out.println("입금주 : " + this.name);
        System.out.println("현재잔액 : " + this.balance);
    }
}
