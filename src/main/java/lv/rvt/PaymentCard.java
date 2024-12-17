package lv.rvt;

public class PaymentCard {
    public double balance;
    private double payment;
    

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably(PaymentCard card) {
        if (card.balance >= 2.60) {
            card.balance = card.balance - 2.60;
        }
        
    }

    public void eatHeartily(PaymentCard card) {
        if (card.balance >= 4.60) {
            card.balance = card.balance - 4.60;
        }
        
    }

    public double balance() {
        return this.balance;
    }

    public boolean takeMoney(PaymentCard card, double amount){
        if (card.balance >= amount) { 
            moneyTake(amount);  
            return true;   
        }
            return false;
        

    }

    

    public void moneyTake(double amount){
        
        this.balance = this.balance - amount;
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
