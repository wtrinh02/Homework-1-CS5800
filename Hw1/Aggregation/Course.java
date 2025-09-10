package Aggregation;

public class Course {
    
    private String courseName;
    private Instructor instructor;
    private Textbook book;

    private Instructor [] instructors = new Instructor[2];
    private Textbook [] textbooks = new Textbook[2];

    public Course(String courseName, Instructor instructor, Textbook book){
        this.courseName = courseName;
        this.instructor = instructor;
        this.book = book;
    }
    public Course(String courseName, Instructor instructor, Instructor instructor2, Textbook book, Textbook book2){
        this.courseName = courseName;
        this.instructors[0] = instructor;
        this.instructors[1] = instructor2;
        this.textbooks[0] = book;
        this.textbooks[1] = book2;

    }
    
   public Instructor[] getInstructors(){
    return this.instructors;
   }

   public Textbook[] getTextbooks(){
    return this.textbooks;
   }

    public Instructor getInstructor(){
        return this.instructor;
    }

    public Textbook getTextbook(){
        return this.book;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setInstructor(Instructor newInstructor){
        this.instructor = newInstructor;
    }

    public void setTextBook(Textbook newTextbook){
        this.book = newTextbook;
    }

    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }

    public void Print(){
        System.out.println("Course Name: " + this.courseName );
        System.out.println("Instructor Name: " + this.instructor.getFirstName() + " " + this.instructor.getLastName());
        System.out.println("Textbook Title: " + this.book.getTitle() + "\nTextBook Author: " + this.book.getAuthor() );
    }
}
