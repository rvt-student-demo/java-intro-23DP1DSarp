package lv.rvt;

public class Product {
    
    private String name;
    private double price;
    private int quantity;


    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;

        printProduct();
        
        
    }


    public static void main(String[] args) {
        new Product("Banana", 1.1, 13);
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs" );
    }



}
