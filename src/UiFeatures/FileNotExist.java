package UiFeatures;

public class FileNotExist extends Exception{
    public FileNotExist(){
        super("The File does not exist in that path!");
    }
}
