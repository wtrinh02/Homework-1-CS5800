package Inheritance;
public class Employee{

    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    public Employee(String fName, String lName, String ssn){
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setlastName(String name){
        this.lastName = name;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + ", Social Security Number: " + this.socialSecurityNumber;
    }
}



