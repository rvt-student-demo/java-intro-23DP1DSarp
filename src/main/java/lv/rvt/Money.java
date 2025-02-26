package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {

        int euroSum = this.euros + addition.euros;
        int centsSum = this.cents + addition.cents;

        Money newMoney = new Money(euroSum, centsSum); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        }

        return false;

    }

    public Money minus(Money decreaser) {


        int euroDecrease = this.euros - decreaser.euros;

        int centsDecrease = this.cents - decreaser.cents;

        if (this.cents < decreaser.cents) {
            centsDecrease = this.cents + decreaser.cents;
            euroDecrease = euroDecrease - 1;
        }

    

        Money newMoney = new Money(euroDecrease, centsDecrease);

        if (newMoney.euros < 0) {

            return new Money(0, 0);
        }

        return newMoney;

    }
}
