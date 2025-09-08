package Inheritance;
public class CommissionEmployee extends Employee{
    
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, int commissionRate, int grossSales){
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getCommissionRate(){
        return this.commissionRate;
    }
    public int grossSales(){
        return this.grossSales;
    }

    public void setCommissionRate(int newCommissionRate){
        this.commissionRate = newCommissionRate;
    }

    public void setGrossSales(int newGrossSales){
        this.grossSales = newGrossSales;
    }

        public String toString(){
        return super.toString() + ", Commission Rate: " + this.commissionRate + "%, Gross Sales: $" + this.grossSales;
    }
}
