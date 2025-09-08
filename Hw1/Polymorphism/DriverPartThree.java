package Polymorphism;

public class DriverPartThree {
    
    public static void main(String[] args){
        Ship[] ships = new Ship[3];

        Ship normalShip = new Ship("NormalShip", "2000");
        Ship cruiseShip = new CruiseShip("CruiseShip", "2001", 500);
        Ship cargoShip = new CargoShip("CargoShip", "2002", 100);
        
        ships[0] = normalShip;
        ships[1] = cruiseShip;
        ships[2] = cargoShip;

        for(Ship element: ships){
            element.Print();
        }
    }
}
