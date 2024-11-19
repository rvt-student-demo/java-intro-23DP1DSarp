package lv.rvt;

public class Counter {


    private int value;   // a variable that remembers the value of the counter
    


    public Counter(int startValue) {
        this.value = startValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement(int decreaseBy) {

        if (this.value > 0) {
            this.value = this.value - decreaseBy;
        }
        

    }

    public void increase(int increaseBy) {
        this.value = this.value + increaseBy;
    }

    public void reset() {

        this.value = 0;

    }

    public static void main(String[] args) {
        Counter counter = new Counter(100);

        counter.printValue();

        
        counter.printValue();

        counter.decrement(5);
        counter.printValue();


        
        counter.reset();
        counter.increase(10);
        counter.printValue();
    }
}
