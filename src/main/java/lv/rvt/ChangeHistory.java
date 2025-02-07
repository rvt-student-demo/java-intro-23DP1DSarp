package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> records;

    public ChangeHistory() {
        
        this.records = new ArrayList<>();
    }

    public void add(double status) {

        this.records.add(status);

    }

    public void clear() {
        this.records.clear();
    }

    


    public double maxValue() {
        double max = this.records.get(0);
        for (double value : records) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.records.get(0);
        for (double value : records) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double averageValue() {

        double sum = 0;
        int count = this.records.size();

        for (int i = 0; i < count; i++) {
            sum += this.records.get(i);
        }

        return sum/count;

    }

    @Override
    public String toString() {
        return this.records.toString();
    }

}
