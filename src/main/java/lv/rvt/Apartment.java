package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.rooms > compared.rooms && this.squares > compared.squares ) {
            return true;
        }
            return false;
    }

    public int priceDifference(Apartment compared){

        price = (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);

        if (price < 0) {

            return Math.abs(price);
        
        }

            return price;
    
    }

    public boolean moreExpensiveThan(Apartment compared){

        if ((this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }
            return false;


    }

}


