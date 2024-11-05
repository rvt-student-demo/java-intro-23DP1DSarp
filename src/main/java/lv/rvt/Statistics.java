package lv.rvt;

import java.util.Scanner;

public class Statistics {
    
    private int count;
    private int number;
    private double numberAverage;
    private int numberEven;
    private int numberOdd;
    private double average;

    public Statistics() {
        
    }

    public void addNumber(int number) {
        
        if (number % 2 == 0) {
            this.numberEven = this.numberEven + number;
        }
        
        
        if (number % 2 != 0){
            this.numberOdd = this.numberOdd + number;
        }


        this.count = this.count + 1;
        this.number = this.number + number;
        this.numberAverage = numberAverage + number;
    }

    public int getCount() {
        return this.count;
        
    }

    public int sum() {
        return this.number;
    }
    
    public int sumEven() {
        return this.numberEven;
    }


    public int sumOdd() {
        return this.numberOdd;
    }

    public double average() {
        this.average = this.numberAverage / this.count;
        return this.average;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");

        String userInput = scanner.nextLine();

        Integer intInput = Integer.valueOf(userInput);

        statistics.addNumber(intInput);

        while(intInput != -1){
            

            userInput = scanner.nextLine();

            intInput = Integer.valueOf(userInput);
            
            if (intInput != -1){
                statistics.addNumber(intInput);
            }
            
        
            
        }

        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.sumEven());
        System.out.println("Sum of odd numbers: " + statistics.sumOdd());
    }
}
