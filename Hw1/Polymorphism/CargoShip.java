package Polymorphism;

public class CargoShip extends Ship{
    
    private int tonnage;

    public CargoShip (String name, String year, int tonnage){
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage(){
        return this.tonnage;
    }

    public void setTonnage(int newTonnage){
        this.tonnage = newTonnage;
    }

    public void Print(){
        System.out.println("Ship's Name: " + super.name + ", Cargo Capacity: " + this.tonnage);
    }
}
