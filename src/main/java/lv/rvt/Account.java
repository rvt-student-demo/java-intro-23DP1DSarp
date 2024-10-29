package lv.rvt;

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }


    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);
        Account mathewsAccount = new Account("Mathew's account", 1000.00);
        Account myAccount = new Account("My account", 0);


        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
        System.out.println(mathewsAccount);
        System.out.println(myAccount);

        artosAccount.withdraw(20.0);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());

        artosSwissAccount.deposit(200.0);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        mathewsAccount.withdraw(100.0);
        System.out.println("The balance of Mathew's account is now: " + mathewsAccount.balance());

        myAccount.deposit(100.0);
        System.out.println("The balance of my account is now: " + myAccount.balance());


        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    }
    
}
