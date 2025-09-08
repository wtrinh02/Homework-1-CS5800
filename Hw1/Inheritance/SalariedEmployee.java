package Inheritance;
public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, int weeklySalary)  {
        super(firstName,lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    public int getWeeklySalary(){
        return this.weeklySalary;
    }

    public void setWeeklySalary(int salary){
        this.weeklySalary = salary;
    }

    public String toString(){
        return super.toString() + ", Weekly Salary: $" + this.weeklySalary;
    }
}