package Polymorphism;

public class Ship {
    protected String name;
    protected String year;
    
    public Ship(String name, String year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public String getYear(){
        return this.year;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setYear(String newYear){
        this.year = newYear;
    }

    public void Print(){
        System.out.println("Ship's Name: " + this.name + ", Built in " + this.year);
    }
}
