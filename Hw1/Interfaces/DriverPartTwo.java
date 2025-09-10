package Interfaces;
import java.util.ArrayList;

public class DriverPartTwo {
    
    public static void main(String[] args){

        ArrayList<Payable> Payables = new ArrayList<Payable>();
        Payable Tim = new Freelance("Tim", "Poon", 1, 40);
        Payable Wesley = new Freelance("Wesley", "Trinh", 1, 41);
        Payable Kevin = new VendorInvoice("Kevin Ly", "111-11-1111", 50);
        Payable Alec = new VendorInvoice("Alec Voong", "222-22-2222", 50);

        Payables.add(Tim);
        Payables.add(Wesley);
        Payables.add(Kevin);
        Payables.add(Alec);

        double total = 0;
        for(Payable element:Payables){
            element.Print();

            total += element.calculatePayment();
        }
        System.out.println("Total Payout: " + total);
    }
}
