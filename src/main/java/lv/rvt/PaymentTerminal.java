package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {

        if (payment >= 2.50) { 

            money = money + 2.50;
            affordableMeals = affordableMeals + 1;
            return payment = payment - 2.50;
               
        }
            
        return payment;
         
        
    }

    public double eatHeartily(PaymentCard card) {

        if (card.balance >= 4.30) { 

         money = money + 4.30;
         heartyMeals = heartyMeals + 1;
         return card.balance = card.balance - 4.30;
               
        }
            
        return card.balance;
         
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.balance = card.balance + sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
