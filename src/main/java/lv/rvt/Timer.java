package lv.rvt;


public class Timer {

    private ClockHand minutes;
    private ClockHand seconds;

    public Timer() {
        
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            
        }
    }

    public String toString() {
        return minutes + ":" + seconds;
    }


}