package Aggregation;

public class Instructor {
    
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getOfficeNumber(){
        return this.officeNumber;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setlastName(String name){
        this.lastName = name;
    }
    public void setOfficeNumber(String newOfficeNumber){
        this.officeNumber = newOfficeNumber;
    }
}
