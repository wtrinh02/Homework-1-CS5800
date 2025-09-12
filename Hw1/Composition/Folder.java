package Composition;

import java.util.ArrayList;


public class Folder {
    
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

    public ArrayList<Folder> getSubFolders(){
        return this.subFolders;
    }

    public ArrayList<File> getFiles(){
        return this.files;
    }

    public void setFolderName(String newName){
        this.folderName = newName;
    }

    public void setSubFolders(ArrayList<Folder> newSubfolders){
        this.subFolders = newSubfolders;
    }

    public void setFiles(ArrayList<File> newFiles){
        this.files = newFiles;
    }

    public void addFile(String fileName){
        
        this.files.add(new File(fileName));
    }

    public void addSubFolder(String subFolder){
        this.subFolders.add(new Folder(subFolder));
    }


    public void deleteFolder(String name){
        for (Folder subfolder : subFolders) {
            if(subfolder.getFolderName().equals(name)){
                subFolders.remove(subfolder);
                break;
            }
        }
    }

    public void print(){

        System.out.println(this.folderName);

        for(Folder subFolder: this.subFolders){
            subFolder.print();
        }

        for (File file : this.files){
            file.print();
        }
    }

}
