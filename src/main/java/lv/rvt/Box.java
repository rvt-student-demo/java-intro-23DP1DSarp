package lv.rvt;

import java.util.ArrayList;

class Box implements Packable {

    private double weight;
    
    
    ArrayList<Packable> box = new ArrayList<>();


    

    public Box(double weight) {
        this.weight = weight;
        this.box = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.weight ) {
            box.add(item);
        }
    }

   


    public double weight() {
        double weight = 0;
        for (Packable packable : box) {
            weight += packable.weight();
        }
        return weight;
    }
    
   
    
    public void printItems() {
        for (Packable item : box) {
            System.out.println(item);
        }
    }

    


    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
    
}





