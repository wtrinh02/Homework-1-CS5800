package Composition;

import java.util.ArrayList;
import java.util.LinkedList;

public class Folder {
    
    // Change to only take name in for constructor and initialize other variables with black arraylists
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    String folderName;

    public Folder(String folderName){
        this.folderName = folderName;
        this.files = new ArrayList<File>();
        this.subFolders = new ArrayList<Folder>();
    }


    public String getFolderName(){
        return this.folderName;
    }

    public void setFolderName(String newName){
        this.folderName = newName;
    }

    public void addFile(String fileName){
        
        this.files.add(new File(fileName));
    }

    public void addSubFolder(String subFolder){
        this.subFolders.add(new Folder(subFolder));
    }

    public void print(){
        //For each sub folder of root, check if they have sub folders, if they do traverse them and repeat until they dont,
        // if not print all their files
        //should end with files of the root
        //Similar to DFS Neighbors are subfolders and if no neighbors call their files print function

        LinkedList<Folder> stack = new LinkedList<Folder>();

        stack.add(this);
        while (stack.size() != 0){
            Folder currentFolder = stack.removeLast();
            for(Folder subfolder:currentFolder.subFolders){
                stack.add(subfolder);
            }
            
            System.out.println(currentFolder.getFolderName());


        }
    }

}
