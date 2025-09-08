package Aggregation;

public class Textbook {
    
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }    

    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void setPublisher(String newPublisher){
        this.publisher = newPublisher;
    }

}
