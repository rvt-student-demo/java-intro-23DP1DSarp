package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance >= 2.50) {
            card.balance = card.balance - 2.50;
            return true;
        }
            return false;
        
    }

    public double eatAffordably(double change) {
        if (change >= 2.50) {
            
            return change = change - 2.50;
        }
            return change;
        
    }


    public boolean eatHeartily(PaymentCard card) {
        if (card.balance >= 4.30) {
            card.balance = card.balance - 4.30;
            return true;
        }
            return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.balance = card.balance + sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    
}
