package Interfaces;
public class Freelance implements Payable{
    
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    //Constructor
    public Freelance(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;

        if (hourlyRate >= 0 ){
            this.hourlyRate = hourlyRate;
        }
        else{
            this.hourlyRate = 0;
        }

        if (hoursWorked >=0){
            this.hoursWorked = hoursWorked;
        }
        else{
            this.hoursWorked = 0;
        }

    }
    
    //Accessors

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getHourlyRate(){
        return this.hourlyRate;
    }

    public double getHoursWorked(){
        return this.hoursWorked;
    }


    //Mutators

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setHourlyRate(double hourlyRate){
        if (hourlyRate >= 0 ){
            this.hourlyRate = hourlyRate;
        }
        else{
            this.hourlyRate = 0;
        }
    }

    public void setHoursWorkd(double hoursWorked){
        if (hoursWorked >=0){
            this.hoursWorked = hoursWorked;
        }
        else{
            this.hoursWorked = 0;
        }
    }

    public double calculatePayment() {
        double payment;
        double overtime = 40;
        double overtimeRate = 1.5;
        double totalHours = this.hoursWorked;
        double hourlyRate = this.hourlyRate;

        if (totalHours > overtime){
            double overtimeHours = totalHours - overtime;
            double normalHours = totalHours - overtimeHours;

            payment = (hourlyRate * normalHours) + (hourlyRate * overtimeHours * overtimeRate);

        }
        else{
            payment = hourlyRate * totalHours;
        }

        return payment;
    }

    public String getPayeeName() {

        return "Name: " + this.firstName + " " + this.lastName; 
    }

    public void Print(){
        System.out.println(getPayeeName()  + ", Calculated Payment: $" + calculatePayment());
    }
}
