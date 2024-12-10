package lv.rvt;

public class HealthStation {

    
    private int health;
    private int weithingsCount;

    public int weigh(Person person) {
        
        this.weithingsCount = weithingsCount + 1;

        return person.getWeight();

        
    }


    public void feed(Person person){

        

        this.health = person.getWeight() + 1;

        
        
        person.setWeight(health);

        
    }

    public int weighings(){

        

        return this.weithingsCount;

    }
}
