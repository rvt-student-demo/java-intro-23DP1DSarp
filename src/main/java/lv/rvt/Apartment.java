package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

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

   /*  public int priceDifference(Apartment compared){

        // Math.abs() would be needed
    
        }

    public boolean moreExpensiveThan(Apartment compared){

    }*/
}
