package Composition;

public class File {
 
    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
