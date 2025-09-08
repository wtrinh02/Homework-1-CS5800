package Aggregation;

public class Course {
    
    private String courseName;
    private Instructor instructor;
    private Textbook book;

    public Course(String courseName, Instructor instructor, Textbook book){
        this.courseName = courseName;
        this.instructor = instructor;
        this.book = book;
    }
    

    public void Print(){
        System.out.println("Course Name: " + this.courseName );
        System.out.println("Instructor Name: " + this.instructor.getFirstName() + " " + this.instructor.getLastName());
        System.out.println("Textbook Title: " + this.book.getTitle() + ", TextBook Author: " + this.book.getAuthor() );
    }
}
