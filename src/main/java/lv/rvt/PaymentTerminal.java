package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
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

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
