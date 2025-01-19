package lv.rvt;

public class Student extends Person{

    private int credits;


   public Student(String name, String adress){
    super(name, adress);
   }

    public int credits() {
        return this.credits;
    }

    public void study(){
        this.credits = this.credits + 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
}

    
    
    

}


