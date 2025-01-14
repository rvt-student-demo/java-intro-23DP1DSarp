package lv.rvt;

class Box {

    private double width;
    private double height;
    private double length;
    

    public Box( double width, double height, double length ){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box( Box oldBox ){
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

   


    public double width(){
        return width;
    }


    public double height(){
        return height;
    }

    public double length(){
        return length;
    }

    public double volume(){
        return length * width * height;
    }

    public double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;      
    }

    private double faceArea(){
        return length * height;
    }

    public double topArea(){
        return length * width;
    }

    private double sideArea(){
        return width * height;
    }
    
    public Box biggerBox( Box oldBox ){

        return new Box( 1.25*oldBox.width(),  1.25*oldBox.height(), 1.25*oldBox.length() );
        
        
    }
    
    public Box smallerBox( Box oldBox ){

        return new Box( oldBox.width()/1.25,  oldBox.height()/1.25, oldBox.length()/1.25 );
        
        
    }


    public boolean nests( Box outsideBox ) {

        if (this.width()-outsideBox.width() >0 && this.height()-outsideBox.height() >0 && this.length()-outsideBox.length() >0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    
    
}

