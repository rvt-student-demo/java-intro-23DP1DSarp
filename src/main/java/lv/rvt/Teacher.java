package lv.rvt;



public class Teacher extends Person {

    private int salary;


    public Teacher(String name, String adress, int salary){
        super(name, adress, salary);
   }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + getSalary() + " euro/month";
}

    
    
}

