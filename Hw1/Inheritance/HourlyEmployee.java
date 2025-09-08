package Inheritance;
public class HourlyEmployee extends Employee{
    private int wage;
    private int numberHoursWorked;

    public HourlyEmployee (String firstName, String lastName, String ssn, int wage, int numHoursWorked){
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.numberHoursWorked= numHoursWorked;
    }

    public int getWage(){
        return this.wage;
    }

    public int getNumberHoursWorked(){
        return this.numberHoursWorked;
    }

    public void setWage(int newWage){
        this.wage = newWage;
    }

    public void setNumberHoursWorked(int newNumberHoursWorked){
        this.numberHoursWorked = newNumberHoursWorked;
    }

    public String toString(){
        return super.toString() + ", Wage: $" + this.wage + ", Number Hours Worked: " + this.numberHoursWorked;
    }
}
