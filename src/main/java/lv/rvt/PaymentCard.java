package lv.rvt;

public class PaymentCard {
    private double balance;
    private double payment;
    

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
        
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
        
    }

    public double balance() {
        return this.balance;
    }

    public boolean takeMoney(double amount){
        if () {
            
        }
    }

    public void addMoney(double amount) {

        if (amount >= 0){

        this.balance = this.balance + amount;
        }
        
        if (this.balance > 150) {
            this.balance = 150;
        }

    }
}
