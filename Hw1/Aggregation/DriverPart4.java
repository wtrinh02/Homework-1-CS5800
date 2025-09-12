package Aggregation;

public class DriverPart4 {
    public static void main(String[] args){
        Instructor Nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook book = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course currentCourse = new Course("CS5800", Nima, book);
     
        currentCourse.Print();
        System.out.println("Office: " + currentCourse.getInstructor().getOfficeNumber());

       Instructor Marin = new Instructor("Ericsson", "Marin", "8-39");
        Textbook tBook = new Textbook("Machine Learning", "T.M. Mitchell", "McGraw-Hill");

        Course twoCourse = new Course("Test Course", Nima, Marin, book, tBook);

        Instructor[] instructors = twoCourse.getInstructors();
        Textbook [] textbooks = twoCourse.getTextbooks();
        Instructor firstInstructor = instructors[0];
        Instructor secondInstructor = instructors[1];
        Textbook firstTextbook = textbooks[0];
        Textbook secondTextbook = textbooks[1];

        System.out.println("Instructors: " + firstInstructor.getFirstName() + " " + firstInstructor.getLastName() + " & " + secondInstructor.getFirstName() + " " + secondInstructor.getLastName());
        System.out.println("Offices: "+ firstInstructor.getOfficeNumber() + " & " + secondInstructor.getOfficeNumber());
        System.out.println("First Textbook: " + firstTextbook.getTitle() + " by " + firstTextbook.getAuthor());
        System.out.println("Second Textbook: " + secondTextbook.getTitle() + " by " + secondTextbook.getAuthor());
    }
}
