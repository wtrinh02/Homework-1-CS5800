package Inheritance;
public class DriverPartOne {

    public static void main(String[] args){
        
        Employee Joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        Employee Stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee Mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee Nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        Employee Renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee Mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee Mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        
        
        
        System.out.println(Joe);
        System.out.println(Stephanie);
        System.out.println(Mary);
        System.out.println(Nicole);
        System.out.println(Renwa);
        System.out.println(Mike);
        System.out.println(Mahnaz);

    }
}
