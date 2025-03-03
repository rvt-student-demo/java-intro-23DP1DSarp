package lv.rvt;

import java.util.HashMap;

public class IOU {

    private String toWhom;

    private double amount;


    HashMap<String, String> numbers = new HashMap<>();

    public void setSum(String toWhom, double amount) {

        this.toWhom = toWhom;
        this.amount = amount;

        numbers.put(this.toWhom, String.valueOf(this.amount));

    }


    public double howMuchDoIOweTo(String toWhom) {


        if (numbers.get(toWhom) == null) {
            
            return 0;

        } else {

            return Double.valueOf(numbers.get(toWhom));

        }
        

    }

}
