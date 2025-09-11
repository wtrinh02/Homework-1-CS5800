package Composition;

public class DriverPartFive {
    
    public static void main(String[] args) {
        
        Folder root = new Folder("php_demo1");

        root.addSubFolder("Source Files");
        root.addSubFolder("Include Path");
        root.addFile("Remote Files");

       Folder sourceFile = root.getSubFolders().get(0);
       sourceFile.addSubFolder(".phalcon");
       sourceFile.addSubFolder("app");
       sourceFile.addSubFolder("cache");
       sourceFile.addSubFolder("public");

       Folder app = sourceFile.getSubFolders().get(1);
       app.addSubFolder("config");
       app.addSubFolder("controllers");
       app.addSubFolder("library");
       app.addSubFolder("migrations");
       app.addSubFolder("models");
       app.addSubFolder("views");

       Folder publicFolder = sourceFile.getSubFolders().get(3);
       publicFolder.addFile(".htaccess");
       publicFolder.addFile(".htrouter.php");
       publicFolder.addFile(".index.html");

        root.print();

        
        
        System.out.println("--------------------------------------");
        sourceFile.deleteFolder("app");
        root.print();

        System.out.println("--------------------------------------");
        sourceFile.deleteFolder("public");
        root.print();

    }
}
