package Composition;

public class Folder {
    
    // Change to only take name in for constructor and initialize other variables with black arraylists
    private File file;
    private Folder [] subFolders;
    String folderName;

    public Folder(String name, String folderName, Folder[] subFolders){
        this.file = new File(name);
        this.folderName = folderName;
        this.subFolders = subFolders;
    }

    public File getFile(){
        return this.file;
    }

    public String getFolderName(){
        return this.folderName;
    }

    public Folder[] getSubFolders(){
        return this.subFolders;
    }


    public void setFile(File newFile){
        this.file = newFile;
    }

    public void setFolderName(String newName){
        this.folderName = newName;
    }

    public void setSubFolder (Folder[] newSubFolders){
        this.subFolders = newSubFolders;
    }
}
