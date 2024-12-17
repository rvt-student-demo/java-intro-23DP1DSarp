package lv.rvt;

public class SimpleDate   {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        
        if (object instanceof SimpleDate == false) {
            return true;
        }
            SimpleDate comparedObject = (SimpleDate) object;

        if (this.day == comparedObject.getDay() && this.month == comparedObject.getMonth() && this.year == comparedObject.getYear()) {
            return true;
        }
            return false;
    }


}
