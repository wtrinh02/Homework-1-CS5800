package Interfaces;
public class VendorInvoice implements Payable {

    private String name;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String name, String invoiceNumber, double amountDue){
        this.name = name;
        this.invoiceNumber = invoiceNumber;
        if(amountDue >=0){
            this.amountDue = amountDue;
        }
        else{
            amountDue = 0;
        }
    }

    //Accessors
    public String getName(){
        return this.name;
    }

    public String getInvoiceNumber(){
        return this.invoiceNumber;
    }

    public double getAmountDue(){
        return this.amountDue;
    }

    //Mutators

    public void setName(String newName){
        this.name = newName;
    }

    public void setInvoiceNumber(String newInvoiceNumber){
        this.invoiceNumber = newInvoiceNumber;
    }

    public void setAmountDue(double newAmountDue){
        this.amountDue = newAmountDue;
    }

    //Interface Methods

    public double calculatePayment() {
        return getAmountDue();
    }


    public String getPayeeName() {

        return getName();
    }

    public void Print(){
        System.out.println( "Name: " + getName()+ ", Invoice Number: " + this.invoiceNumber + ", Amount Due: $" + getAmountDue());
    }
    
}
