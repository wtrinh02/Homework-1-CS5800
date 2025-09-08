package Polymorphism;

public class CruiseShip extends Ship {
    
    private int maxNumberPassengers;

    public CruiseShip(String name, String year, int maxNumberPassengers){
        super(name, year);
        this.maxNumberPassengers = maxNumberPassengers;
    }

    public int getMaxNumberPassengers(){
        return this.maxNumberPassengers;
    }

    public void setMaxNumberPassengers(int newMax){
        this.maxNumberPassengers = newMax;
    }

    public void Print(){
        System.out.println("Ship's Name: " + super.name + ", Maximum amount of passengers: " + this.maxNumberPassengers);
    }
}
